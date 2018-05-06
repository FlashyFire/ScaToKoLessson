import me.ntab.checklistLexer
import me.ntab.checklistParser
import me.ntab.checklistVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode

class CheckListChecker(fileName: String) : checklistVisitor<Unit> {

    private var _fileName = fileName
    private var _items = mutableListOf<String>()
    private var _acc : StringBuilder? = null
    private var _inputRule = false
    private var _inputPrompt : String = ""
    private var _variables = mutableMapOf<String, Pair<String, String?>>()

    val items
        get() = _items

    fun proceed() {
        var lexer = checklistLexer(CharStreams.fromFileName(_fileName))
        var parser = checklistParser(CommonTokenStream(lexer))
        parser.main().accept(this)
    }

    override fun visitMain(ctx: checklistParser.MainContext?) {
        ctx!!.children.forEach { it.accept(this) }
    }

    override fun visitTitle(ctx: checklistParser.TitleContext?) {
        ctx!!.sentence().accept(this)
    }

    override fun visitBody(ctx: checklistParser.BodyContext?) {
        ctx!!.children.forEach { it.accept(this) }
    }

    override fun visitSentence(ctx: checklistParser.SentenceContext?) {
        _acc = StringBuilder()
        ctx!!.children.forEach { it.accept(this) }
        if (_inputRule)
            _inputPrompt = _acc.toString()
        else
            _items.add(_acc.toString())
        _acc = null
    }

    override fun visitSubtitle(ctx: checklistParser.SubtitleContext?) {
        ctx!!.sentence().accept(this)
    }

    override fun visitInput(ctx: checklistParser.InputContext?) {
        // Prompt
        _inputRule = true
        ctx!!.sentence().accept(this)
        _inputRule = false
        // Type
        _acc = StringBuilder()
        ctx.word(0).accept(this)
        var varType = _acc.toString()
        // Variable name
        _acc = StringBuilder()
        ctx.word(1).accept(this)
        var varName = _acc.toString()
        _acc = null
        // Input and create variable
        print(_inputPrompt)
        print(": ")
        _variables[varName] = Pair(varType, readLine())
    }

    override fun visitExpr(ctx: checklistParser.ExprContext?) {
        // TODO
    }

    override fun visitFunc_def(ctx: checklistParser.Func_defContext?) {
        // TODO
    }

    override fun visitFunc_call(ctx: checklistParser.Func_callContext?) {
        // TODO
    }

    override fun visitSubst(ctx: checklistParser.SubstContext?) {
        // TODO
    }

    override fun visitLogical_expr(ctx: checklistParser.Logical_exprContext?) {
        // TODO
    }

    override fun visitComp_op(ctx: checklistParser.Comp_opContext?) {
        // TODO
    }

    override fun visit(p0: ParseTree?) {
        // TODO
    }

    override fun visitCondition(ctx: checklistParser.ConditionContext?) {
        // TODO
    }

    override fun visitBinary_op(ctx: checklistParser.Binary_opContext?) {
        // TODO
    }

    override fun visitLogical_op(ctx: checklistParser.Logical_opContext?) {
        // TODO
    }

    override fun visitWord(ctx: checklistParser.WordContext?) {
        ctx!!.children.forEach { it.accept(this) }
    }

    override fun visitNumber(ctx: checklistParser.NumberContext?) {
        ctx!!.children.forEach { it.accept(this) }
    }

    override fun visitErrorNode(p0: ErrorNode?) {
        // TODO
    }

    override fun visitTerminal(p0: TerminalNode?) {
        _acc?.append(p0!!.toString())
    }

    override fun visitName(ctx: checklistParser.NameContext?) {
        // TODO
    }

    override fun visitChildren(p0: RuleNode?) {
        // TODO
    }
}
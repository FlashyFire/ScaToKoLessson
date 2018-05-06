import java.io.File

fun main(args: Array<String>) {
    if (args.size < 2 || (!args[0].startsWith("--file:") && args[0] != "--interactive")) {
        println("Checklist generation util.")
        println("USAGE:")
        println("checklist --interactive Template.checklist")
        println("checklist --file:output.txt Template.checklist")
    }
    else {
        var checker = CheckListChecker(args[1])
        checker.proceed()
        if (args[0] == "--interactive") {
            checker.items.forEach { println(it) }
        }
        else {
            var fileName = args[0].split(":")[1]
            File(fileName).printWriter().use { out ->
                checker.items.forEach { out.println(it) }
            }
        }
    }
}
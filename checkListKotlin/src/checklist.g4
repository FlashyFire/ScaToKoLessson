grammar checklist;
main: title body ;
title: '##' sentence NEWLINE ;
body: ((sentence | subtitle | input | func_def | condition) NEWLINE)* ;
sentence: (word | expr) (COMMA* SPACE (word | expr))* DOT* ;
subtitle: '#' sentence ;
input: ('?' | '->') sentence ':' word ':' word ;
expr: ('${' (word | number) binary_op (word | number) '}') | subst | func_call ;
func_def: '$$' name '(' name ')' NEWLINE sentence ;
func_call: '$' name '(' (name | number) ')' ;
subst: '$' name ;
condition: '${' logical_expr '}' NEWLINE sentence (NEWLINE sentence)* ;
logical_expr: logical_expr logical_op logical_expr |
   (word | number) comp_op (word | number) |
   '(' logical_expr ')' ;
binary_op: SPACE* ('+' | '-' | '*' | '/') SPACE* ;
comp_op: SPACE* ('==' | '!=' | '<' | '<=' | '>' | '>=') SPACE* ;
logical_op: SPACE* ('&&' | '||') SPACE* ;
word: SPACE* CHAR+ SPACE* ;
name: CHAR+ ;
number: INT ;
CHAR: [a-z] | [A-Z] | [\u0410-\u044F] ;
INT: [0-9]+ ;
SPACE: ' ' ;
COMMA: ',' ;
DOT: '.' ;
NEWLINE: [\r\n]+ ;
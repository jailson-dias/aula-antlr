grammar Antlr;

@header {
	package antlr;
}

goal: NUMBER op NUMBER;
op: '+'|'-';

NUMBER: [0-9]+;
WS: [ \t\r\n] -> skip;













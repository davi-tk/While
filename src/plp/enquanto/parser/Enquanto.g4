grammar Enquanto;

programa : seqComando;     // sequência de comandos

seqComando: comando (';' comando)* ;

comando: ID ':=' expressao                                                                       # atribuicao
       | 'skip'                                                                                  # skip
       | 'se' booleano 'entao' comando ('senaose' booleano 'entao' comando)* 'senao' comando     # se
       | 'enquanto' booleano 'faca' comando                                                      # enquanto
       | 'repita' expressao 'vezes' comando                                                      # repita
       | 'quando' expressao (expressao ':' comando)* '_ :' comando                               # quando
       | 'exiba' TEXTO                                                                           # exiba
       | 'escreva' expressao                                                                     # escreva
       | 'para' ID 'em' expressao '..' expressao 'faca' comando                                  # para
       | '{' seqComando';' '}'                                                                   # bloco
       ;

expressao: INT                                                                                   # inteiro
         | 'leia'                                                                                # leia
         | ID                                                                                    # id
         | expressao '^' expressao                                                               # opBin
         | expressao ('*' | '/') expressao                                                       # opBin
         | expressao ('+' | '-') expressao                                                       # opBin
         | '(' expressao ')'                                                                     # expPar
         ;

booleano: BOOLEANO                                                                               # bool
        | expressao '=' expressao                                                                # opRel
        | expressao '!=' expressao                                                               # opRel
        | expressao '<' expressao                                                                # opRel
        | expressao '>' expressao                                                                # opRel  
        | expressao '<=' expressao                                                               # opRel
        | expressao '>=' expressao                                                               # opRel        
        | 'nao' booleano                                                                         # naoLogico
        | booleano 'e' booleano                                                                  # eLogico
        | booleano 'or' booleano                                                                 # ouLogico
        | booleano 'xor' booleano                                                                # xorLogico
        | '(' booleano ')'                                                                       # boolPar
        ;


BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
TEXTO: '"' .*? '"';

Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;
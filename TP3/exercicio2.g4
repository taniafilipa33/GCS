grammar exercicio2;

@members {
    Main.java;
}
s: turma+ ;

turma: TURMA ID alunos
            {
        System.out.println("numero total de alunos:"+t$alunos.totalAlunos);
            }
                PONTO ;

alunos returns [int totalAlunos]: aluno {$totalAlunos= 1;} (PONTIVIRG aluno {$totalAlunos +=1;})*;


/* nesta zona as notas herdam  nome: nome notas[$nome.text] e depois notas[String n]*/
aluno: nome notas[$nome.text] {
            float media = $notas.somaNotas / $notas.totalNotas;
            System.out.println("A media do/a " + $nome.text + " é " media);
};

nome: NOME
    ;

notas[String nomeA] returns [int somaNotas, int totalNotas]:
          '(' n1=NOTA {if($n1.int > -1 && $n1.int<21) {$somaNotas=$n1.int;$totalNotas=1;}
                    else System.out.println("Nota invalida");}
            (VIRG n2=NOTA {if($n1.int > -1 && $n1.int<21)
                            {$somaNotas+=$n2.int;$totalNotas+=1;}
                            else System.out.println("Nota invalida");}
             )* ')' {
                 if($totalNotas >= 4 && $totalNotas <= 6 ) System.out.println("O aluno tem entre 4 e 6 notas");
                   else System.out.println("Erro: O aluno "+ $nomeA.text +" não tem o numero de notas correto");
             }
      ;


//lexer


TURMA: [tT][uU][rR][mM][aA];
ID: [a-zA-Z];
NOME: [a-zA-Z]+;
NOTA: [0-9]+;
VIRG: ',' ;
PONTO: '.';
PONTIVIRG: ';';
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;
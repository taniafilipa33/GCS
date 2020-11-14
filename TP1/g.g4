

grammar g;

//variaveis para as alineas:
@members{
    int comprimento = 0;
    int quantiNumeros = 0;
    int palavras = 0;
    int somatorio = 0;
    int soma = 0;
    int momento = 0;
    int maior = -1;
}

s: lista+ ; //o + representa que 'lista' é simbolo não terminal e que é uma construção de uma lista não vazia.

lista : Lista elems '.'
                    //resultados finais:
                    {System.out.println("Tamanho da lista : " + comprimento);
                     System.out.println("Quantidade de Números: " + quantiNumeros);
                     System.out.println("Somatório dos números: " + somatorio);
                     System.out.println("Número maior: " +maior);
                     System.out.println("A média dos núemros presentes é:" +(soma/quantiNumeros));
                     if(quantiNumeros==palavras) System.out.println("Núemro de palavras é igual ao número de números");
                     else System.out.println("O núumero de palavras e números são diferentes.");
                     quantiNumeros = 0; palavras = 0; momento = 0; maior = -1; soma = 0;}
;

elems : elem {comprimento = 1; } (',' elem {comprimento++;})* ; // o * representa a existencia de simbolos não terminais e a consyrução de lista que pode ser vazia

elem: Palavra {palavras++; if($Palavra.text.equals("agora")) momento = 1; else if(momento == 1 && $Palavra.text.equals("fim")) momento = 0;}
     | Num { soma += $Num.int ; quantiNumeros++; if (momento ==1) somatorio += $Num.int;
              if (maior < $Num.int) maior = $Num.int;}
     ;

//lexer

Lista: [lL][iI][sS][tT][aA] //varias representações
      ;

Palavra: [a-zA-Z][a-zA-Z0-9]*
        ;

Num: ('0'..'9')+ //em vez de [0-9]+
    ;

WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;

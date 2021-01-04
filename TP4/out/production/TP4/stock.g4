grammar stock;

@header{
        import java.util.*;
}

@members{
    class Produto{
           int referencia;
           String descricao;
           int preco;
           int quantidade;
    }
}

s: {HashMap<Integer,Produto> prodsA = new HashMap<Integer,Produto>();
   } s1=stock[prodsA]  PONTVIRG  faturas[$s1.prods]  PONTO;


stock[HashMap<Integer,Produto> prodsA] returns[HashMap<Integer,Produto> prods]
    :
            STOCK ':' '{'
            p1=produto[$prodsA]
                ({$prods = $p1.prodOUT;}PONTVIRG p2=produto[$prods]
                 {$prods = $p2.prodOUT;} )*
                '}';

faturas[HashMap<Integer,Produto> prodIn] returns [HashMap<Integer,Produto> prodOut] : f1=fatura[$prodIn]
                        {$prodOut = $f1.prodFOut;}
                        (PONTVIRG f2=fatura[$prodOut]
                        {$prodOut = $f2.prodFOut;})*;

fatura[HashMap<Integer,Produto> prodFIn] returns [HashMap<Integer,Produto> prodFOut]
                                : FATURA
                                 //{for(Produto entry : prodFIn.values()) System.out.println("Produto:"+entry.referencia + entry.descricao);}
                                 cabecalho VENDAS g1=corpo[$prodFIn]
                                 {$prodFOut = $prodFIn;} MOVIMENTOS ':' movimentos ;

cabecalho: ref fornecedor cliente ;

cliente: CLIENTE ':' nome VIRG nif VIRG morada;

corpo[HashMap<Integer,Produto> prodCIn] returns [HashMap<Integer,Produto> prodCOut]
                                    :
                                     l1=linha[$prodCIn]
                                    {$prodCOut = $l1.prodLout; }
                                    ('.' l2=linha[$prodCOut] {$prodCOut = $l2.prodLout;}
                                    )* '.' ;

linha[HashMap<Integer,Produto> prodLin] returns [HashMap<Integer,Produto> prodLout]
                                            : ref VIRG quantidade
                                            {if($prodLin.get(Integer.parseInt($ref.text))==null) System.out.println("O produto não existe");
                                            else {
                                                Produto t = $prodLin.get(Integer.parseInt($ref.text));
                                                if(t.quantidade < Integer.parseInt($quantidade.text)) System.out.println("Venda não pode ser efetuada devido ao stock insuficiente");
                                                else {t.quantidade = t.quantidade - Integer.parseInt($quantidade.text);
                                                      $prodLin.put(Integer.parseInt($ref.text),t);
                                                      System.out.println("Venda válida");
                                                }
                                            }
                                            $prodLout = $prodLin;
                                            }
                                            ;

fornecedor: FORNECEDOR ':' nome VIRG nif VIRG morada VIRG nib;

movimentos : movimento (VIRG movimento)* ;


produto[HashMap<Integer,Produto> prodIN] returns [HashMap<Integer,Produto> prodOUT]
                                                    :
                                                     ref VIRG descricao VIRG preco VIRG quantidade
                                                    {

                                                    //gera o produto novo
                                                    Produto novo =new Produto();
                                                    novo.descricao = $descricao.text;
                                                    novo.referencia = Integer.parseInt($ref.text);
                                                    novo.preco = Integer.parseInt($preco.text);
                                                    novo.quantidade = Integer.parseInt($quantidade.text);


                                                    //System.out.println("olaaaaaaa"+novo.referencia+novo.preco+novo.quantidade+novo.descricao);
                                                    //insere ou atualiza na hash
                                                    $prodIN.put(novo.referencia,novo);

                                                    //clone da hash
                                                    $prodOUT = $prodIN;

                                                    }
                                                    ;

//sinbolos terminais
ref: NUM;
movimento : STRING;
descricao: STRING;
preco: NUM;
quantidade: NUM;
nome : STRING;
nif: NUM;
nib: NUM;
morada: STRING;

//lexer
STOCK : [sS][tT][oO][cC][Kk];
FATURA: [Ff][Aa][Tt][Uu][rR][Aa];
MOVIMENTOS : [Mm][Oo][Vv][Ii][Mm][Ee][Nn][Tt][Oo][Ss];
CLIENTE : [Cc][Ll][Ii][Ee][Nn][Tt][Ee];
FORNECEDOR : [Ff][Oo][Rr][Nn][Ee][Cc][Ee][Dd][Oo][Rr];
VENDAS : [Vv][Ee][Nn][Dd][Aa][Ss];

NUM: [0-9]+;
STRING: [a-zA-Z]+(' '*[a-zA-Z]+)*;
VIRG: ',' ;
PONTO: '.';
PONTVIRG: ';';
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nichollas Falcão
 */
public class Capitulo5 {
    
    public static void main(String[]args){
    
        // Controle de Fluxo (São instruções de decisões)

            /* IF */

                double altura = Math.random() ;
                System.out.println( altura ) ;

                if(altura < 0.89) {
                    System.out.println(" Acesso bloqueado ");
                }

                System.out.println("Acesso liberado");

                /* If - else */

                    System.out.println(altura);

                    if(altura < 0.89) {
                        System.out.println(" Acesso bloqueado ");
                    }else {
                        System . out . println (" Acesso liberado ") ;
                    }

        // Instruções de Repetição

            /* While */

                // inicialização
                int i = 1;
                
                // condição
                while ( i <= 100) {
                    // corpo
                    System . out . println (" Mensagem número " + i ) ;
                    
                    // atualização
                    i ++;
                }

            /* For */

                for(int numero = 1000; numero <= 1002; numero ++) {
                    System.out.println(" Bilhete " + numero ) ;
                }

                System.out.println("FIM") ;

            /* Instruções de Repetição Encadeadas */

                for(int numeroSetor = 1; numeroSetor<=4; numeroSetor++){
                    
                    for(int numeroCadeira = 1; numeroCadeira<=200; numeroCadeira++){

                        int ingresso =  "Setor: " +  numeroSetor + " " + "Cadeira: " + numeroCadeira ;

                        System.out.println(ingresso);

                    }

                }

            /* Instrução break */

                int soma = 0;
            
                for(int i = 1; i <= 100; i ++) {
                    System.out.println("Lançamento : " + i);
                    
                    int numero = (int)(Math.random() * 6 + 1);
                    
                    System.out.println(" Número : " + numero);
                    
                    soma += numero ;
                    
                    System.out.println(" Soma : " + soma);
                    
                    if(soma > 360) {
                        System.out.println(" Você ganhou com " + i + " lançamentos");
                        break;
                    }
                }
                System.out.println(" Jogue Novamente ");

            /* Instrução continue */

                int soma = 0;
                
                for(int i = 1; i <= 100; i ++) {
                    System.out.println(" Lançamento : " + i );
                    
                    int numero = (int)(Math.random() * 6 + 1);
                    
                    System.out .println(" Número : " + numero);
                    
                    if(numero % 2 != 0) {
                        continue ;
                    }
                    
                    soma += numero ;
                    
                    System.out.println(" Soma : " + soma);
                    
                    if( soma > 180) {
                        System.out.println(" Você ganhou com " + i + " lançamentos");
                        break ;
                    }
                }
                System.out.println(" Jogue Novamente ");

            /* Blocos sem chaves */

                if(a < 10)
                    a = a * 2 + 1;
                    else {
                        if(a < 20)
                        a = a * 3 + 1;
                        else
                        a = a * 4 + 1;
                    }

            /* Laços Infinitos */

                int k = 1;

                while(k < 10) {
                    System.out.println("K19") ;
                }

                for(k < 10;) {
                    System.out.println("K19") ;
                }
        
                for(int quantidadeVoltas = 1; quantidadeVoltas <= 3; quantidadeVoltas++){
                    for(int estrela = 1; estrela <= 6; estrela++){
                        if(estrela == 1){
                            System.out.println("*");
                        }else if(estrela == 2){
                            System.out.println("**");
                        }else if(estrela == 3){
                            System.out.println("***");
                        }else if(estrela == 4){
                            System.out.println("****");
                        }else if(estrela == 5){
                            System.out.println("*****");
                        }else if(estrela == 6){
                            System.out.println("******");
                        }else{
                            System.out.println("ERRO");
                        }
                    }
                }

                /* ----- QUESTÕES ----- */

                /*

                    1 Qual alternativa está correta?

                    a) if e else são instruções de decisão.
                    b) if e while são instruções de decisão.
                    c) else e while são instruções de decisão.
                    d) while e for são instruções de decisão.
                    e) if e for são instruções de decisão.
                  
                    2 Qual alternativa está correta?
                    a) No if, a condição pode ser um valor booleano ou numérico
                    b) No if, a condição só pode ser um valor numérico.
                    c) No if, a condição só pode ser um valor booleano.
                    d) No if, a condição pode ser uma string ou um valor numérico.
                    e) No if, a condição pode ser qualquer coisa

                    3 Qual alternativa está correta?
                    a) Para cada if, tem que existir um else.
                    b) O corpo do else é executado quando a condição do if é verdadeira.
                    c) O corpo do if é executado quando a condição é falsa.
                    d) Não podemos definir ifs no corpo dos elses.
                    e) Para cada else, tem que existir um if.

                    4 Considere o seguinte código.

                    1 int a = 1;
                    2 int b = 1;
                    3
                    4 if( a ++ > b ) {
                    5 if( a > --b ) {
                    6 a = 10
                    7 } else
                    8 a = 11;
                    9 a = 12;
                    10 } else
                    11 if( a > --b )
                    12 a = 13;
                    13 else {
                    14 a = 14;
                    15 }

                    Ao final desse código, qual é o valor da variável a.
                    a) 10
                    b) 11
                    c) 12
                    d) 13
                    e) 14
                    
                    5 Qual alternativa está correta?
                    a) if e else são instruções de repetição.
                    b) if e while são instruções de repetição.
                    c) else e while são instruções de repetição.
                    d) while e for são instruções de repetição.
                    e) if e for são instruções de repetição.

                    6 Qual alternativa está correta?
                    a) No while e for, a condição só pode ser um valor numérico.
                    b) No while e for, a condição pode ser um valor booleano ou numérico.
                    c) No while e for, a condição pode ser uma string ou um valor numérico.
                    d) No while e for, a condição pode ser qualquer coisa.
                    e) No while e for, a condição só pode ser um valor booleano.

                    7 Considere o seguinte código:

                    1 int a = 1;
                    2
                    3 while ( a > 10) {
                    4 a ++;
                    5 }

                    Ao final desse código, qual é o valor da variável a.
                    a) 1
                    b) 2
                    c) 9
                    d) 10
                    e) 11

                    8 Considere o seguinte código:
                    1 int a = 1;
                    2
                    3 for(int i = 10; i > 0; i - -) {
                    4 a += 2;
                    5 }
                  
                    Ao final desse código, qual é o valor da variável a.
                    a) 1
                    b) 11
                    c) 12
                    d) 21
                    e) 23

                    9 Considere o seguinte código:

                    1 int a = 0;
                    2
                    3 for(int i = 1; i < 10; i ++) {
                    4 if( i == 3 || i == 5) {
                    5 continue ;
                    6 }
                    7
                    8 if( i == 9) {
                    9 break ;
                    10 }
                    11
                    12 a += i ;
                    13 }

                    Ao final desse código, qual é o valor da variável a.
                    a) 0
                    b) 3
                    c) 8
                    d) 28
                    e) 36

                    10 Considere o seguinte código:

                    1 int a = 0;
                    2 for(int i = 0; i < 10; i ++) {
                    3 for(int j = 0; j < 10; j ++) {
                    4 a ++;
                    5 }
                    6 }

                    Ao final desse código, qual é o valor da variável a.
                    a) 9
                    b) 10
                    c) 18
                    d) 20
                    e) 100

                    11 Considere o seguinte código.
                    1 int a = 0;
                    2 for(int i = 0; i < 10; i ++) {
                    3 for(int j = 0; j < 10; j ++) {
                    4 if( i == j ) {
                    5 continue ;
                    6 }
                    7 a ++;
                    8 }
                    9 }

                    Ao final desse código, qual é o valor da variável a.

                    a) 18
                    b) 50
                    c) 90
                    d) 99
                    e) 100

                    ----- GABARITO -----

                    1º A
                    2º C
                    3º E
                    4º D
                    5º D
                    6º E
                    7º A
                    8º D
                    9º D
                    10º E
                    11º C

                */



    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nichollas Falcão
 */
public class Capitulo4 {
    
    public static void main(String[]args){
    
       // Operadores

            // Tipos de Operadores

            /*

                • Aritmético: + - * / %
                • Atribuição: = += -= *= /= %= ++ --
                • Relacional: == != < <= > >=
                • Lógico: & | ˆ && ||

            */   

            // Operadores Aritméticos

                int umMaisUm = 1 + 1;
                // umMaisUm = 2

                int tresVezesDois = 3 * 2;
                // tresVezesDois = 6

                int quatroDivididoPorDois = 4 / 2;
                // quatroDivididoPorDois = 2

                int seisModuloCinco = 6 % 5;
                // seisModuloCinco = 1

                int x = 7;

                x = x + 1 * 2;
                // x = 9

                x = x - 4;
                // x = 5   

                x = x / (6 - 2 + (3 * 5) /(16 - 1));
                // x = 1          

            // Classe math

                // Potenciação

                    double a = Math.pow(3, 5);
                    // a = 243

                    double b = Math.sqrt(9) ;
                    // b = 3

            // Divisão Inteira

                int a = 5;
                int b = 2;
                System.out.println(a/b);

                // Com Casting

                    // convertendo apenas o "a"
                    System.out.println((double)a/b);

                    // convertendo apenas o "b"
                    System.out.println(a/(double)b);

                    // convertendo apenas o "a" e o "b"
                    System.out.println((double)a/(double)b);

             // Concatenação de Strings

                String s1 = " Nichollas ";
                String s2 = " ";
                String s3 = " Falcão ";
                
                // " Nichollas Falcão "
                String s4 = s1 + s2 + s3;   

            // Operadores de Atribuição

                int valor = 1;
                // valor = 1
                
                valor += 2;
                // valor = 3
                
                valor -= 1;
                // valor = 2
                
                valor *= 6;
                // valor = 12
                
                valor /= 3;
                // valor = 4
                
                valor %= 3;
                // valor = 1
                
                valor ++;
                // valor = 2
                
                valor --;
                // valor = 1

                /* Para comparar com os Operadores Aritméticos */

                valor = valor + 2;
                // valor = 3
            
                valor = valor - 1;
                // valor = 2
            
                valor = valor * 6;
                // valor = 12
                
                valor = valor / 3;
                // valor = 4
                
                valor = valor % 3;
                // valor = 1
                
                valor = valor + 1;
                // valor = 2
                
                valor = valor - 1;
                // valor = 1

            // Operadores Relacionais

                int valor1 = 2;
                boolean t = false ;
                w = ( valor == 2); // t = true
                w = ( valor != 2); // t = false
                w = ( valor < 2); // t = false
                w = ( valor <= 2); // t = true
                w = ( valor > 1); // t = true
                w = ( valor >= 1); // t = true

            // Operadores Lógicos

                double a = Math.random();
                double b = Math.random();
                
                System.out.println(a > 0.2 & b < 0.8) ;
                System.out.println(a > 0.2 && b < 0.8) ;

            // Operador Ternário "?:"

                double nota1 = Math . random ();
                String resultadoNota = nota1 >= 0.5 ? " aprovado " : " reprovado ";
                System.out.println(resultadoNota);

                /* Também pode ser usado com outros tipos de variáveis */

                int u = nota1 >= 0.5 ? 1 : 2;
                double d = nota1 >= 0.5 ? 0.1 : 0.2;

            // Operador "!" (Operador de negação, para o tipo BOOLEANO)

            // Pré e Pós Incremento ou Pré e Pós Decremento

                int i = 10;
                i ++;
                i --;
                /* Pós Incremento ou Decremento */

                ++i;
                --i;
                /* Pré Incremento ou Decremento */

            // Operações com Strings

                // Descobrir a quantidade de caracteres de uma String

                    String ss = " Nichollas Falcão ";
                    
                    int length = ss.length ();
                    
                    System.out.println(length);

                // Recuperar umcaractere de acordo com a sua posição na string.

                    String sss = " Nichollas Falcão ";
                    
                    char c = sss.charAt(0);
                    
                    System.out.println(c);

                // Verificar se uma determinada sequência de caracteres está contida emuma string.

                    String s = "K11 - Orientação a Objetos em Java ";
                    
                    boolean resultado1 = s.contains("Java");
                    boolean resultado2 = s.contains("C#");
                    
                    // true
                    System.out.println(resultado1);
                    
                    // false
                    System.out.println(resultado2);  
                
                // Verificar se uma string termina com uma determinada sequência de caracteres.
                    
                    boolean resultado1 = s.endsWith(" Java ");
                    boolean resultado2 = s.endsWith(" Objetos ");
                    
                    // true
                    System.out.println(resultado1);
                    
                    // false
                    System.out.println(resultado2);

                // Verificar se uma string começa com uma determinada sequência de caracteres.

                    boolean resultado1 = s.startsWith (" Java ");
                    boolean resultado2 = s.startsWith ("K11 ");
                    
                    // false
                    System.out.println(resultado1);
                    
                    // true
                    System.out.println(resultado2); 

                // Podemos realizar substituições em uma string.

                    String s1 = " K19 - Treinamentos ";
                    
                    String s2 = s1.replaceAll(" Treinamentos ", " Cursos ");
                    
                    // K19 - Cursos
                    System.out.println(s2);

                // Podemos extrair um trecho de uma string.

                    String s1 = " Rafael Cosentino ";
                    
                    String s2 = s1.substring (7) ;
                    String s3 = s1.substring (0, 6);
                    
                    // Cosentino
                    System.out.println(s2);
                    
                    // Rafael
                    System.out.println(s3);

                // Transformar em maiúsculas todas as letras contidas em uma string.

                    String x1 = " Rafael Cosentino ";
                    
                    String x2 = x1.toUpperCase();
                    
                    // RAFAEL COSENTINO
                    System.out.println(x2);

                // Podemos transformar em minúsculas todas as letras contidas emuma string.    

                    String s1 = " Rafael Cosentino ";
                    
                    String s2 = s1.toLowerCase();
                    
                    // rafael cosentino
                    System.out.println(s2); 

                // Podemos eliminar os espaços em branco do começo e do término de uma string.

                    String s4 = " Rafael Cosentino ";
                    
                    String s5 = s4.trim();
                    
                    // " Rafael Cosentino "
                    System.out.println(s5);

                // Operações com Data e Hora

                    java.util.Calendar c = new java.util.GregorianCalendar(2010 , 7, 27) ;
                
                    // Acrescentando 140 dias
                    c.add(java.util.Calendar.DAY_OF_MONTH, 140) ;
                    
                    // Subtraindo 2 anos
                    c.add(java.util.Calendar.YEAR, -2);
                
                    // Acrescentando 20 segundos
                    c.add(java.util.Calendar.SECOND, 20);

                // Podemos comparar a ordem das datas e horas.

                    java.util.Calendar c1 = new java.util.GregorianCalendar(2010 , 7, 27);
                    java.util.Calendar c2 = java.util.Calendar.getInstance();
                    
                    // true
                    System.out.println(c1.before(c2));
                    
                    // false
                    System.out.println(c1.after(c2));

               /*

                    ----- QUESTÕES -----

                    1º Qual é o resultado da operação abaixo?
                    5% 2

                    a) 2
                    b) 2.5
                    c) 0.1
                    d) 1
                    e) 5.1

                    2º Quais são os resultados das operações abaixo?
                    5/2
                    5.0/2
                    (double)5/2

                    a) 2, 2 e 2
                    b) 2.5, 2.5 e 2.5
                    c) 2, 2.5 e 2.5
                    d) 2, 2 e 2.5
                    e) 2, 2.5 e 2

                    3º Quais são os resultados das operações baixo?
                    (double)(5/2)
                    (double)5/2
                    5/(double)2

                    a) 2.5, 2.5 e 2.5
                    b) 2, 2 e 2
                    c) 2, 2 e 2.5
                    d) 2.5, 2.5 e 2
                    e) 2, 2.5 e 2.5

                    4º Qual é o resultado da operação abaixo?
                    1 + 2 + "rafael" + 3 + 4

                    a) 12rafael34
                    b) 3rafael34
                    c) 3rafael7
                    d) 12rafael7
                    e) ocorrerá um erro

                    5º Qual é o valor armazenado na variável i depois das seguintes operações?
                    int i = 10;
                    i++;
                    i += 10;
                    --i;
                    i %= 3;

                    a) 2
                    b) 10
                    c) 3
                    d) 5
                    e) 0

                    6º Qual é o tipo dos valores devolvidos pelos operadores relacionais?
                    a) números inteiros
                    b) números reais
                    c) caracteres
                    d) string
                    e) booleanos

                    7º Quais são os resultados das operações baixo?
                    10 > 5 & 7 < 10
                    10 > 5 & 7 > 10
                    10 < 5 & 7 < 10
                    10 < 5 & 7 > 10

                    a) true, true, true e true
                    b) true, true, true e false
                    c) true, false, true e false
                    d) true, false, false e false
                    e) false, true, true e false

                    8º Quais são os resultados das operações abaixo?
                    10 > 5 | 7 < 10
                    10 > 5 | 7 > 10
                    10 < 5 | 7 < 10
                    10 < 5 | 7 > 10

                    a) true, true, true e true
                    b) true, true, true e false
                    c) true, false, true e false
                    d) true, false, false e false
                    e) false, true, true e false

                    9º Quais são os resultados das operações abaixo?
                    10 > 5 ^ 7 < 10
                    10 > 5 ^ 7 > 10
                    10 < 5 ^ 7 < 10
                    10 < 5 ^ 7 > 10

                    a) true, true, true e true
                    b) true, true, true e false
                    c) true, false, true e false
                    d) true, false, false e false
                    e) false, true, true e false

                    10º Quais são os resultados das operações abaixo?
                    10 > 5 ? 10 : 5
                    !(10 > 5) ? 10 : 5
                    (10 < 5) ? "k01" : "k02"

                    a) 10, 10, k01
                    b) 5, 5, k02
                    c) 10, 5, k02
                    d) 10, 5, k01
                    e) 5, 10, k02

                    11º O que é exibido com o código Java a seguir?

                    1 int i = 10;
                    2 System.out.println(i ++);
                    3 System.out.println(++i);
                    4 System.out.println(i--);
                    5 System.out.println(--i);

                    a) 10, 12, 12 e 10
                    b) 11, 12, 11, 10
                    c) 10, 11, 11, 10
                    d) 10, 10, 10, 10
                    e) 11, 11, 11, 10

                    ----- GABARITO -----

                    1º D
                    2º C
                    3º E
                    4º B
                    5º A
                    6º E
                    7º D
                    8º B
                    9º E
                    10º C
                    11º A

               */ 



    }
    
}

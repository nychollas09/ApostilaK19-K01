/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nichollas Falcão
 */
public class Capitulo3 {
    
    public static void main(String[]args){
    
        /* Variáveis */
        
            //Declaração
            
                int numeroDaConta ;
                double saldo ;

                // ou

                double saldo1 , limite , taxa ;
            
            // Atribuição de Valores
            
                numeroDaConta = 3466;

                // ou

                int numeroDaConta1 = 3466;
            
            // Exibindo as Variáveis
            
                int numero = 10;
                System .out. println ( numero );
                
            // Copiando Valores
            
                int a = 1;
                int b = a;
                a = 2;
                b = 3;
                System .out. println (a); // exibe o valor 2
                System .out. println (b); // exibe o valor 3
                
            // Tipos Primitivos
                
                byte variavelByte; // Valor inteiro entre -128 e 127
                byte variavelShort; // Valor inteiro entre -32768 e 32767
                byte variavelInt; //  Valor inteiro entre -2147483648 e 2147483647
                byte variavelLong; // Valor inteiro entre -9223372036854775808 e 9223372036854775807
                byte variavelFloat;
                byte variavelDouble;
                byte variavelBoolean; // O valor true (verdadeiro) ou o valor false (falso)
                byte variavelChar; // Valor inteiro entre 0 e 65535
                
            // BigInteger e BigDecimal
            
                //Valores Mínimos 
                
                    // Byte
                        System.out.println(Byte.MIN_VALUE);
                    // Short
                        System.out.println(Short.MIN_VALUE);
                    // Int
                        System.out.println(Integer.MIN_VALUE);
                    // Long
                        System.out.println(Long.MIN_VALUE);
                    // Float
                        System.out.println(Float.MIN_VALUE);
                    // Double
                        System.out.println(Double.MIN_VALUE);
                    // Char
                        System.out.println(Character.MIN_VALUE);
                
                // Valores Máximos
                
                    // Byte
                        System.out.println(Byte.MAX_VALUE);
                    // Short
                        System.out.println(Short.MAX_VALUE);
                    // Int
                        System.out.println(Integer.MAX_VALUE);
                    // Long
                        System.out.println(Long.MAX_VALUE);
                    // Float
                        System.out.println(Float.MAX_VALUE);
                    // Double
                        System.out.println(Double.MAX_VALUE);
                    // Char
                        System.out.println(Character.MAX_VALUE);
                    
            // Típos numéricos não primitivos
            
                // Primitivos
                    
                    byte ex1;
                    short ex2;
                    int ex3;
                    long ex4;
                    float ex5;
                    double ex6;
                    char ex7;
                    boolean ex8;
                    
                // Wrapper Class
                
                    Byte exx1;
                    Short exx2;
                    Integer exx3;
                    Long exx4;
                    Float exx5;
                    Double exx6;
                    Character exx7;
                    Boolean exx8;
            
            
            // Classe String
            
                String texto = "K19 Treinamentos ";
                
            // Data e Hora
            
                java . util . Calendar exatamenteAgora = java . util . Calendar . getInstance ();
            
                // Calendário "Detalhado"
                
                java.util.Calendar c = new java.util.GregorianCalendar(2018,8,8,00,9,37);
                
                /* 
                    1º Espaço - Ano
                    2º Espaço - Mês
                    3º Espaço - Dias
                    4º Espaço - Horas
                    5º Espaço - Minutos
                    6º Espaço - Segundos
                */
                
            // Valores Literais = valores inseridos diretamente no código fonte são chamados de valores literais.
            
                // Null
                    
                    Double variacao = null; /* Null é diferente de 0 */
                    
                // Booleanos
                
                    boolean a1 = true ;
                    boolean b1 = false ;
            
                // Inteiros
                
                    // Prefixos para utilizar na exibição de "Caracteres atípicos"
                
                    // 19 em binário
                    int a2 = 0b10011 ;
                    // 19 em octal
                    int b2 = 023;
                    // 19 em decimal
                    int c2 = 19;
                    // 19 em hexadecimal
                    int d2 = 0x13;
                    
                // Variáveis
                
                    /* Sempre lembrar de usar o L depois do número */
                
                    // valor literal inteiro do tipo long
                    long a3 = 2147483648L;
                    // valor literal inteiro do tipo long
                    long b3 = 2147483648l;
                    
                // Reais
                
                    /* Valores literais reais são definidos com o separador de casas decimais “.” */
                
                    double a4 = 19.19;
                    double b4 = 0.19;
                    double c4 = .19;
                    
                    float a5 = 19.09F;
                    float b5 = 19.09f;
                    
                // Potência
                
                    double a6 = 1.74e3; // 1740 na forma exponencial
                
                    
                // Caracteres (Caracteres literais são definidos dentro de aspas simples.)
                
                    char a7 = 'K';
                    
                // Strings
                
                    String aa = "K19 Treinamentos ";
                
            // Números Aleatórios

                // Classe Math

                    double aleatorio = Math.random ();
                
            // Casting (Operação de conversão)

                long castingA = 19;
                int castingB = (int)a;

                /*
                    OBS.: Operações de casting podem gerar resultados bem indesejados. Considere que uma variável
                    do tipo long armazena o valor 2147483648. Se uma operação de casting for aplicada para copiar
                    esse valor para uma variável do tipo int ocorrerá perda de precisão e o valor obtido na cópia será
                    -2147483648 tanto em Java quanto em C#.
                */
            
            // Conversão de String

                String conversaoString = "19";
                int receptorString = Integer.parseInt(conversaoString);

                /*
                    byte = Byte.parseByte();
                    short = Short.parseShort();
                    int = Integer.parseInt();
                    long = Long.parseLong();
                    float = Float.parseFloate();
                    double = Double.parseDouble();
                    boolean = Boolean.parseBoolean();
                */

            // Convenções de Nomenclatura

                /*
                    Nunca Usar variáveis com nomes curtos, pois os mesmos tornam-se de difícil entendimento.
                */
            
                // Regras de Nomenclatura

                    /*
                        // válido
                        int numeroDaConta ;
                    
                        // inválido pois o nome de uma variável não pode começar com um dígito
                        int 2outraVariavel ;
                    
                        // inválido pois o nome de uma variável não pode ser igual a uma palavra reservada
                        double double ;
                        
                        // inválido pois o nome de uma variável não pode conter espaços
                        double saldo da conta ;
                        
                        // válido
                        int umaVariavelComUmNomeSuperHiperMegaUltraGigante ;
                        
                        // válido
                        int numeroDaContaCom8Digitos_semPontos ;
                        
                        // válido somente em Java
                        int valorDoProdutoEmR$;
                        
                        //inválido pois o nome de uma variável não pode conter o caractere #
                        int #telefone ;
                    */

            // Palavras Reservadas

                /*
                
                    abstract || continue || for || new || switch
                    assert || default || if || package || synchronized
                    boolean || do || goto || private || this
                    break || double || implements || protected || throw
                    byte || else || import || public || throws
                    case || enum || instanceof || return || transient
                    catch || extends || int || short || try
                    char || final || interface || static || void
                    class || finally || long || strictfp || volatile
                    const || float || native || super || while

                */
            
            // Formatação

                // Máscaras de Formatação

                    // Exibir Somente o valor com 2 casas decimais
                    System.out.printf ("%.2f",preco);   

                    // Formatação de Data e Hora
                    java.util.Calendar fundacaoK19 = new java.util.GregorianCalendar(2010, 7, 27, 10, 32, 15) ;
                    
                    java.text.SimpleDateFormat sdf =
                    new java.text.SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
                    
                    String fundacaoK19Formatada = sdf.format(fundacaoK19.getTime());
            
            /*
            
                ----- QUESTÕES -----

                1º Qual é a função das variáveis?
                a) Exibir asmensagens dos programas.
                b) Gerar números aleatórios.
                c) Formatar números com casas decimais.
                d) Armazenar dados.
                e) Realizar cálculos matemáticos.

                2º O que ocorre quando uma variável não inicializada é utilizada?
                a) Umerro de compilação.
                b) Umerro de execução.
                c) A variável é inicializada com 0.
                d) A variável é inicializada com umvalor aleatório.
                e) A variável é inicializada com null.

                3º Qual alternativa apresenta os tipos básicos do Java para números reais?
                a) byte e double
                b) int e float
                c) float e double
                d) real e long
                e) single e double

                4º Considere as linguagens Java e C#, qual alternativa declara corretamente um caractere literal?
                a) ’K’
                b) ’KK’
                c) "K"
                d) "KK"
                e) K
                f) KK

                5º No Java e no C#, quais palavras representamos valores literais booleanos?
                a) verdadeiro e falso
                b) True e False
                c) True e false
                d) true ou verdadeiro e false ou falso
                e) true e false

                6º Em Java, quais são as formas de definir os valores literais numéricos inteiros?
                a) decimal e hexadecimal
                b) binário e decimal
                c) octal e decimal
                d) binário, decimal e hexadecimal
                e) binário, octal, decimal e hexadecimal

                7º Considere as linguagens Java e C#, como são definidas as strings?
                a) Dentro de aspas simples.
                b) Dentro de aspas duplas.
                c) Dentro de aspas simples ou aspas duplas.

                8º Qual afirmação sobre casting está correta?
                a) As linguagens Java e C# não permitem operações de casting.
                b) Operações de casting são utilizadas para copiar valores entre variáveis do mesmo tipo.
                c) Operações de casting são perigosas pois podem gerar valores indesejados.
                d) Nas linguagens Java e C#, as operações de casting são utilizadas para transformar strings em
                números.
                e) Nas linguagens Java e C#, as operações de casting são utilizadas para transformar números em
                strings.    

                9º Qual nome de variável segue a convenção de nomenclatura do Java e do C#?
                a) idadeDoMarcelo
                b) idadedomarcelo
                c) idade_do_marcelo
                d) idade-do-marcelo
                e) idade do marcelo

                10º Qual nome de variável segue as regras de nomeclatura do Java e do C#?
                a) 90pesoMinimoDoMarcelo
                b) int
                c) pesoDoMarceloEstaAcimaDe90
                d) peso.do.marcelo
                e) peso do marcelo

                ----- GABARITO -----

                1º D
                2º E
                3º C
                4º A
                5º E
                6º E
                7º B
                8º C
                9º A
                10º C

            */

    }
    
}

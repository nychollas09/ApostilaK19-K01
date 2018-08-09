/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nichollas Falcão
 */
public class Capitulo7 {
    
    // FUNÇÕES OU MÉTODOS

    static void exibeCabecalho () {
        System.out.println(" ------------ K19 Treinamentos ------------");
        System.out.println(" ----------- contato@k19.com.br -----------");
        System.out.println(" -------------- 11 2387 -3791 --------------");
    }

    // chamando a função exibeCabecalho

        exibeCabecalho();
        System.out.println(" Recibo : R$ 545 ,00 ");
        
        System.out.println();
    
    // chamando a função exibeCabecalho

        exibeCabecalho();
        System.out.println(" Atestado de Matrícula : Jonas Keizo Hirata ");

    // Parâmetros

        static void calculaJurosSimples(double capital , double taxa , int periodo){
            double juros = capital * taxa * periodo ;
        }   

        public static void main(String[]args){
            calculaJurosSimples (25400 , 0.02 , 30);
        }

    // Resposta

        static double calculaJurosSimplesComRespsota(double capital , double taxa , int periodo) {
            double juros = capital * taxa * periodo ;
            return juros ;
        }
    
        public static void main(String[]args){
            
            double resposta1 = calculaJurosSimples(10000 , 0.015 , 12);
            
            double resposta2 = calculaJurosSimples(25400 , 0.02 , 30);
            
            System.out.println(" Juros : " + resposta1 );
            System.out.println(" Juros : " + resposta2 );

        }


        /* ----- GABARITO ----- */

        /*

            1º C
            2º A
            3º E
            4º D
            5º E
            6º B

        */

}

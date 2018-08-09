/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nichollas Falcão
 */
public class Capitulo6 {
    
    public static void main(String[]args){
    
        // Array

            int [] nomeDoArray = new int [10];

            // Inserindo valores em um Array

                nomeDoArray[0] = 124;
                nomeDoArray[1] = 43;
                nomeDoArray[2] = 1023;

            // Inicializando e Inserindo

                int [] b = new int [] {1 , 62 , 923 , 15};

            // Acessando valores de um Array

                System.out.println(" Valor na posição de índice 0: " + b[0]) ;
                System.out.println(" Valor na posição de índice 2: " + b[2]) ;

            // Percorendo um Array

                int [] numeros = new int [100];

                for(int i = 0; i <= 100; i++){
                    int aleatorio = (int)(Math.random() * 100);

                    numeros[i] = aleatorio;
                    
                    System.out.println("Posição: " + i + ", " + "Número: " + aleatorio);
                    
                }

            // Array de Arrays (Array multidimensional)

                int [][] arrays = new int [5][];
                
                //arrays[0] = new int [1];
                //arrays[1] = new int [3];
               // arrays[2] = new int [2];
                //arrays[3] = new int [7];

            // Percorrendo um Array de Arrays

                // Criando arrays dentro do array
                for(int i = 0; i<=arrays.length; i++){
                    arrays[i] = new int[5];
                }

                // Percorrendo os Arrays

                    for(int i = 0; i<= arrays.length; i++){
                        for(int j = 0; j <= arrays[i].length; j++){
                            int aleatorio1 = (int)(Math.random()*1000);

                            arrays[i][j] = aleatorio1;

                            System.out.println("Array de Nº: " + i +
                                               ", no array de Nº: " + j +
                                               ", está o valor: " + aleatorio1
                            );
                        }
                    }

                
                /* ----- GABARITO ----- */
                /*
                
                    1º A
                    2º B
                    3º E
                    4º A
                    5º D
                    6º E

                */




    }
    
}

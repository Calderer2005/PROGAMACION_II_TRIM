/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String str = "Hola";
        
        char[] listaChr = {'H', 'o', 'l', 'a'};
        
        System.out.println("Letra de indice 0 del string: "+ str.charAt(0));
        
        System.out.println("Letra de indice 0 del array: "+ listaChr[0]);
        
        int[] listaInt = {0, 1, 2, 3, 4, 5};
        
        System.out.println(listaInt[3]);
        
        listaInt[3] = 15;
        
        System.out.println("Numero de indice 3 tras el cambio: "+listaInt[3]);
        
        int[] numeros = new int[5]; // [0,0,0,0,0]
        
        System.out.println("Indice inicio Array: 0");
        System.out.println("Indice tope del Array: "+(listaInt.length -1));
        System.out.println("Longitud del Array: "+listaInt.length);
        
        for(int i = 0; i < listaInt.length; i++){
            System.out.println("Indice: "+i+"\tValor: "+listaInt[i]);
        }
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i*2;
        }
        
        System.out.println("");
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: "+i+"\tValor: "+numeros[i]);
        }*/
        
        //Diseña un algoritmo que lea una cadena de 5 números y sume todos sus elementos
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 5 números");
        int[] numeros = new int[10];
        int tope = 5;
        
        for(int i = 0; i < tope; i++){
            numeros[i] = sc.nextInt();
            
            for(int j = 0; i < tope; i++){
            
            }
        }
        
        for(int i = 0; i < tope; i++){
            System.out.println("Indice: "+i+"\tValor: "+numeros[i]);
        }
        
        int res = 0;
        for(int i = 0; i < tope; i++){
            res += numeros[i];
        }
        
        System.out.println("La suma de todos los números es "+res);
        
        System.out.println("Introduce un número adicional a la lista");
        numeros[tope] = sc.nextInt();
        tope++;
        
        for(int i = 0; i < tope; i++){
            System.out.println("Indice: "+i+"\tValor: "+numeros[i]);
        }
        
    }
    
}

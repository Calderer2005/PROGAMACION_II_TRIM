/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_ejercicios;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Tema4_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //EJERCICIO 1
        
        System.out.print("Introduzca la longitud de la lista:\n>");
        
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("Ahora introduzca los valores de la lista:");
        
        for(int i = 0;i <arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            
        }
        int max=0;
        max = valorMax(arr,max);
        
        System.out.println(max);
        
    }
    public static int valorMax(int[] arr, int max){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
}

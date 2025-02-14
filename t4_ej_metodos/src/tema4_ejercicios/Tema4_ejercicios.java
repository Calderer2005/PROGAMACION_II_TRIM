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
        /*
        //EJERCICIO 1
        
        System.out.print("Introduzca la longitud de la lista:\n>");
        
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("Ahora introduzca los valores de la lista:");
        
        for(int i = 0;i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max=0;
        max = valorMax(arr,max);
        
        System.out.println("El valor máximo es : "+max);
        
        //EJERCICIO 2
         
        System.out.println("Introduza un número entero:");
        int num = sc.nextInt();  
    
        int[] arr;
        
        arr = listaDig(num);
        
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Posición: "+i+" Valor: "+arr[i]);
        }
        */
        //EJERCICIO 3
        
        System.out.println("Escoga una de las opciones :\n1]FACTORIAL\n2]POTENCIAL");
        int option = sc.nextInt();
        switch (option)
        {
            case 1:
                
                break;
            case 2:
                
                break;
            default:
                System.out.println("\tNO ES UNA OPCIÓN");
        }
    }
    /*
    public static int[] listaDig(int num){
        int lg = 0;
        int f = num;
        int resto ;
        
        for (int i = 0 ;f>0; i++){
            f = f/10;
            lg++;
        }
        int arr[] = new int[lg];
        for (int i = lg-1; i>= 0; i--) {
            resto = num%10;
            num = num/10;
            arr[i] = resto;
        }
        
        return arr;
    }
    
    public static int valorMax(int[] arr, int max){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
    */
    

}   


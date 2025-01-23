/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_clases;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Prueba_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pens = "¿Eres pensionista?";
        String aut = "¿Eres autónomo";
        String casado = "¿Estás casado?";
        
        if(leeOpcion2Alternativas(pens)){
            
        }
                
            
       /* //Solicitar tamaño del arreglo
        System.out.println("Introduce el tamaño del conjunto de enteros: ");
        int size = sc.nextInt();
        //Crear y llenar el arreglo
        int[] numeros = new int[size];
        System.out.println("Introduce los números del conjunto:");
        for(int i = 0; i < size; i ++){
            System.out.println("Número "+(i++)+": ");
            numeros[i] = sc.nextInt();
        }
        //Solicitar el número a buscar
        System.out.println("Introduce el número que deseas contar: ");
        int numeroBuscado =sc.nextInt();
        //LLamar al método y mostrar resultado
        int apariciones = contarApariciones(numeros, numeroBuscado);
        System.out.println("El número "+numeroBuscado+"aparece " + apariciones + " veces en el conjunto.");
        
        sc.close();
        
        
        
        Perro p1 = new Perro("Toby","Golden Retriever",3,"Marrón");
        
        System.out.println(p1.raza);
        
        String resp = p1.ladrar();
        System.out.println(resp);
        
        resp = p1.correr(3.24f);
        System.out.println(resp);
        
        String nomb = "Laika";
        String raza = "Border Collie";
        int anios = 5;
        String color = "Negro";
        
        Perro p2 = new Perro(nomb,raza,anios,color);
        
        System.out.println(p2.ladrar());
        
        //EJERCICIO1
        
        System.out.println("¿Cuantos números vas a introducir?");
        int nNum = sc.nextInt();
        
        float[] lista = new float[nNum];
        
        System.out.println("Introduce la lista de números: ");
        for(int i = 0; i < nNum; i++){
            lista[i] = sc.nextFloat();
        }
        
        float max = calcularMax(lista);
        System.out.println("El valor máximo de la lista es "+max);
    
        }
    
     private static int calcNcifras( int num ){
            int nCifras = 0;
            
            do{
                num/=10;
                nCifras++;
            }while(num > 0);
            
            return nCifras;
        }  
    
    
        public static float calcularMax( float[] lista ){
        float max = lista[0];
        
        for(float num:lista){
            if(num > max) max = num;
        }
        
        return max;
        
        //EJERCICIO 2
        
        System.out.println("Introduzca un entero cualquiera:");
        int nNum = sc.nextInt();
        String tope = nNum+"";
        
        int n = tope.length();
        int[] lista =  new int[n];   
        for(int i=0 ;i < n; i++){
            nNum %= 10;
            lista[i]=nNum;  
        }
        System.out.println(lista);
        
        int[] listaNum = separarCifras(1234);
        
        for(int cif:listaNum) System.out.println(cif+"");
         
            
        
        public static int[] separarCifras( int num){
            int tope = calcNcifras(num);
            
            int[] lista = new int[tope];
            
            
            for(int i = tope-1; i >= 0; i++){
                lista[i] = num%10;
                num/=10;
            }
            return lista;
        }*/
        //Hay que darle un repaso porque hay cosas que sobran y que estan mal
        //EJERCICO 3
        /*
        int op = 0;
        System.out.print("1]Factorial\n2]Potencia\n>");
        op = sc.nextInt();
        if(op==1){
            
        }else if(op==2){
            
        }else{
            System.out.println("NO ES UNA DE LAS OPCIONES");
        }
        */
        
        
    }
    /*//EJ4
    public static int fibonacci(int orden){
            int fib1= 0;
            int fib2= 1;
            int aux = 0;
            for(int i = 2; i <= orden; i++){
                aux = fib1 + fib2;
                fib1 = fib2;
                fib2 = aux;
            }
            return aux;
        }
    public static int fibonacciR(int orden){
        int fib = 0;
            
        if(orden < 1) fib = orden;
        else fib = fibonacciR(orden-2) + fibonacciR(orden-1);
                    
        return fib;
        
    }
    public static int contarApariciones(int[] conjunto,int numero){
        int contador = 0;
        for(int num : conjunto) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }*/
    public static String leeOpcion2Alternativas(String mens){
        Scanner sc = new Scanner(System.in);
    
    System.out.println(mens);
    char resp = sc.next().toLowerCase().charAt(0);
    
    while(resp != 's' && resp!='n'){
    resp =sc.next().toLowerCase().charAt(0);
    }
    
    boolean res = false;
    if(resp == 's') res = true;
    
    sc.close();
    
    return res;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correxmat;

import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class CorrExMat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //VERSION A: EJ 1 VERSION B: EJ 3
        
        System.out.println("Introduce el número de enteros:");
        int tope = sc.nextInt();
        
        int lista[] = new int[tope];
        
        System.out.println("Introduce los números:");
        for(int i = 0; i < tope; i++)
            lista[i] = sc.nextInt();
        
        int listaN[] = new int[tope];
        int contN=0;
        boolean enc = false;
        
        for(int i = 0; i < tope; i++){
            int aux = lista[i];
            enc = false;
            for(int j = 0; j < contN; j++){
                if(aux == listaN[j]) enc=true;
            }
            
            if(!enc){
                listaN[contN] = aux;
                contN++;
            }
        }
        
        for(int i = 0; i < tope-1; i++) {
            for(int j = i+1; j < tope; j++) {
                if(lista[i] == lista[j]){
                    for(int k = j; k < tope-1; k++) {
                        lista[k] = lista[k+1];
                    }
                    tope--;
                    j--;
                }
            }
        }
        
        for(int i = 0; i < tope-1; i++){
            for(int j = i+1; j < tope; j++) {
                if(lista[i]>lista[j]){
                  int aux = lista[i];
                  lista[i] = lista[j];
                  lista[j] = aux;
                }
                    
            }
        }
        
        for(int i = 0; i < tope; i++) System.out.print(lista[i]+" ");
        System.out.println("");
        for(int i = 0; i < tope; i++) System.out.print(listaN[i]+" ");
        
        //VERSION A: EJ 2 VERSION B: EJ 1
        
        System.out.println("Indica el tamaño de la matriz:");
        int filas = sc.nextInt();
        int cols = sc.nextInt();
        
        float[][] matriz = new float[filas][cols];
        float[] arr = new float[cols];
        
        float[] resul = new float[filas];
        
        for(int i = 0; i < filas; i++){
            for(int j=0; j < cols; j++){
                matriz[i][j] = sc.nextFloat();
            }
        }
        
        for(int i = 0; i < cols; i++)
            arr[i] = sc.nextFloat();
        
        float aux = 0;
        
        for(int i = 0; i < filas; i++){
            aux = 0;
            for(int j = 0; j < cols; j++){
                resul[i] += matriz[i][j]*arr[j];
            }
        }
        
        aux = 0;
        for(int i = 0; i < filas; i++)
            aux += resul[i];
        
        aux /= filas;
        
        System.out.println("La media de la matriz resultado es: "+aux);
        
        //VERSION A: EJ 3 VERSION B: EJ 4
        
        System.out.println("Indica el tamaño de la matriz:");
        int filas = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matriz = new int[filas][cols];
        
        System.out.println("Indica el tamaño del array:");
        int tope = sc.nextInt();
        
        int[] arr = new int[tope];
        
        for(int i = 0; i < filas; i++){
            for(int j=0; j < cols; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < cols; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("¿Quieres introducir el array como fila[1] o como columna[2]?");
        int opc = sc.nextInt();
        
        System.out.println("Introduce la posición:");
        int pos = sc.nextInt();
        
        int[][] matrizR = new int[1][1];
        int filaR = filas;
        int colsR = cols;
        
        switch(opc){
            case 1:
                if(tope==cols){
                    if(pos >= 0 && pos < filas+1){
                        filaR=filas+1;
                        matrizR = new int[filaR][cols];
                        int contM = 0;
                        
                        for(int i = 0; i < filaR; i++) {
                            for(int j = 0; j < cols; j++){
                                if(i == pos) matrizR[i][j] = arr[j];
                                else{
                                   matrizR[i][j] = matriz[contM][j];
                                }
                            }
                            if(i != pos) contM++;
                        }
                    }else{
                        System.out.println("Posición no válida");
                    }
                }else{
                    System.out.println("No se puede introducir.");
                }
                break;
            case 2:
                if(tope==filas){
                    if(pos >= 0 && pos < cols+1){
                        colsR = cols+1;
                        matrizR = new int[filas][colsR];
                        int contM = 0;
                        
                        for(int i = 0; i < colsR; i++) {
                            for(int j = 0; j < filas; j++){
                                if(i == pos) matrizR[j][i] = arr[j];
                                else{
                                   matrizR[j][i] = matriz[j][contM];
                                }
                            }
                            if(i != pos) contM++;
                        }
                    }else{
                        System.out.println("Posición no válida");
                    }
                }else{
                    System.out.println("No se puede introducir.");
                }                
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < filaR; i++) {
            for (int j = 0; j < colsR; j++) {
                System.out.print(matrizR[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
        //VERSION A: EJ 4 VERSION B: EJ 2
        
        System.out.println("Introduce un texto:");
        String txt = sc.nextLine().toLowerCase();
        
        int[] letras = new int[26];
        
        int tope = txt.length();
        for(int i = 0; i < tope; i++) {
            char l = txt.charAt(i);
            
            if(l >= 'a' && l <= 'z'){
                int ind = l - 'a';
                letras[ind]++;
            }
        }
        
        int min = tope+1;
        int indMin = -1;
        int max = 0;
        int indMax = -1;
        
        for(int i = 0; i < 26; i++){
            if(letras[i] != 0){
                if(letras[i] < min){
                    min = letras[i];
                    indMin = i;
                }
                
                if(letras[i] > max){
                    max = letras[i];
                    indMax = i;
                }
                
                System.out.println("La letra "+(char)('a'+i)+" aparece "+letras[i]+" veces.");
            }
        }
        
        System.out.println("La letra "+(char)('a'+indMin)+" es la que menos aparece con un total de "+min+" apariciones.");
        System.out.println("La letra "+(char)('a'+indMax)+" es la que más aparece con un total de "+max+" apariciones.");
    }
    
}

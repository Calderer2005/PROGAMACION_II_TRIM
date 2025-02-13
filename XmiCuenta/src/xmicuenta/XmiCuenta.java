/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmicuenta;

/**
 *
 * @author EAG
 */
public class XmiCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*circunferencia c1 = new circunferencia(2.34f);
        circunferencia c2 = new circunferencia(2.34f);
        
        System.out.println(c1.perimetro());
*/
        Libro l1 = new Libro("123456789", "Libro1", "Erica",320);
        Libro l2 = new Libro("234567891", "Libro2", "Pablo", 220);
        
        System.out.println(l1);
        System.out.println(l2);
        
        if (l1.getNum_Pag() > l2.getNum_Pag())System.out.println(l1.getTitulo());) {
        else System.out.println(l2.getTitulo()+" tiene más paginas");    
        }
    }
    
}

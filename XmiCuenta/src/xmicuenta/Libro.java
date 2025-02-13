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
public class Libro {
    //ATRIBUTOS
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Num_Pag;
    
    //CONSTRUCTOR
    public Libro(String I, String T, String A, int n){
        ISBN = I;
        Titulo = T;
        Autor = A;
        Num_Pag = n;
    }
    
    //METODOS
    public String getIsbn(){
        return ISBN;
    }
    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
    public int getNum_Pag(){
        return Num_Pag;
    }
    public void setIsbn(String I){
        ISBN = I;
    }
    public void settitulo(String T){
        Titulo = T;
    }
    public void setAutor(String A){
        Autor = A;
    }
    public void setNum_Pag(int n){
        Num_Pag = n;
    }
    
    @Override
    public String toString(){
        return "El libro <<"+Titulo+">> con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+Num_Pag+"páginas";
    }
    
    
    
    
    
    
}



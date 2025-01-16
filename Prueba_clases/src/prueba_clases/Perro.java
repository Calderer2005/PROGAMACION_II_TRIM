/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_clases;

/**
 *
 * @author EAG
 */
public class Perro {
    //Bloque de atributos
    public String nombre;
    public String raza;
    public int edad;
    public String color;
    
    //Bloque de metodos
    public Perro(String nom,String ra,int ed,String col){
        nombre = nom;
        raza = ra;
        edad = ed;
        color = col;
    }
    
    public String ladrar(){
        String ladrido = nombre + " dice guau.";
        
        return ladrido;
    }
    
    public String correr( float vel ){
        String corre = nombre + " corre a "+ vel +" kms/h.";
        return corre;
    }
}


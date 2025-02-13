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
public class circunferencia {
    //atributos
    public float radio;
    
    //CONSTRUCTOR
    public circunferencia(float r){
        radio = r;
    }
    //METODOS
    public float perimetro(){
        return (float)(2*Math.PI*radio);
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void setradio(float r){
        radio = r;
    }
    @Override
    public String toString(){
        return "La circunferencia tiene radio "+radio+" uds";
    }
}

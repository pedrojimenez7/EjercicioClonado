/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoHerencia;

/**
 *
 * @author Pedro
 */
public class Cuadrado implements Figura{
    private double lado;
    
    public Cuadrado (){
        
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
    
    @Override
    public double calcularArea(){
        double resultado;        
        resultado = (lado * lado) ;        
        return resultado;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un cuadrado");
    }
    @Override 
    public String toString(){
        return "Este es un cuadrado de lado " + lado;
    }
}

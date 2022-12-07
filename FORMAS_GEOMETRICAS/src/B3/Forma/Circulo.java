/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3.Forma;

/**
 *
 * @author Rafael
 */
public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
        double calcularArea(){
        return Math.PI*Math.pow(raio,2);
    }
        
    @Override
        double calcularPerimetro(){
        return 2 * Math.PI*raio;
    }

    @Override
    public String toString() {
        return "\nCirculo" + 
                "\nRaio= " + raio + 
                "\nArea= " + calcularArea() +
                "\nPerimetro= " + calcularPerimetro();
    }
        
        
        
        
    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
}

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
public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea(){
        return 4* Math.PI*Math.pow(raio,2);
    }
    
    @Override
    double calcularVolume(){
        return (4* Math.PI*Math.pow(raio,3))/3;
    }

    @Override
    public String toString() {
        return "\nEsfera" +
                "\nraio=" + raio +
                "\nArea= " + calcularArea() +
                "\nvolume= " + calcularVolume();
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

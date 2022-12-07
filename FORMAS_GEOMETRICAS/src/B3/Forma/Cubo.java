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
public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    
    @Override
    double calcularArea(){
        return 6 * Math.pow(lado,2);
    }
    
    @Override
    double calcularVolume(){
        return Math.pow(lado,3);
    }

    @Override
    public String toString() {
        return "\nCubo" +
                "\nlado=" + lado +
                "\nArea= " + calcularArea() +
                "\nvolume= " + calcularVolume();
    }

    
    
    
    
    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}

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
public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea(){
        return Math.pow(lado,2);
    }
    
    @Override
    double calcularPerimetro(){
        return 4*lado;
    }

    @Override
    public String toString() {
        return "\nQuadrado" + 
                "\nlado=" + lado + 
                "\nArea= " + calcularArea() +
                "\nPerimetro= " + calcularPerimetro();
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

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
public class Retangulo extends FormaBidimensional {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea(){
        return lado1*lado2;
    }
    
    @Override
    double calcularPerimetro(){
        return 2*lado1+2*lado2;
    }

    @Override
    public String toString() {
        return "\nRetangulo" + 
                "\nlado1=" + lado1 + 
                "\nlado2=" + lado2 + "Area= " + calcularArea() +
                "\nPerimetro= " + calcularPerimetro();
    }
    
    
    
    
    
    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
}

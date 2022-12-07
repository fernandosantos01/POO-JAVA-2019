package B3.Forma;


import B3.Forma.FormaTridimensional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Tetraedro extends FormaTridimensional {
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    
    @Override
   double calcularArea(){
       return Math.pow(lado,2)*Math.sqrt(3);
   }
     
    @Override
     double calcularVolume(){
        return (Math.pow(lado,3)*Math.sqrt(2))/12;
    }

    @Override
    public String toString() {
        return "\nTetraedro" +
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

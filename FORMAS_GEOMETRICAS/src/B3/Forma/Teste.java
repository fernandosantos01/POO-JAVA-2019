/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3.Forma;

import B3.Forma.Circulo;
import B3.Forma.Cubo;
import B3.Forma.Esfera;
import B3.Forma.Forma;
import B3.Forma.Quadrado;
import B3.Forma.Retangulo;
import B3.Forma.Tetraedro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        Circulo c = new Circulo(5);
        
        Quadrado q = new Quadrado(7);
        
        Esfera e = new Esfera(9);
        
        Cubo u = new Cubo(2);
        
        Tetraedro t = new Tetraedro(10);
        
        Retangulo r = new Retangulo(9, 8);
        
        List<Forma> lista = new ArrayList<Forma>();
        lista.add(c);
        lista.add(q);
        lista.add(e);
        lista.add(u);
        lista.add(t);
        lista.add(r);
          
        
        double soma=0, area=0;
        for (Forma forma : lista) {
            area = forma.calcularArea();
            soma += area;
            
        }
        System.out.println(" todas as Areas= " + soma);
        System.out.println(lista);
    }
    
}

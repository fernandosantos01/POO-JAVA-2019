/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018.poo.jose_rafael;

import B3.Conta.Conta;
import B3.Conta.ContaCorrente;
import B3.Conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class POOJose_Rafael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        ContaCorrente c = new ContaCorrente(100, "Julius");
        ContaCorrente c1 = new ContaCorrente(100, "Sabrina");
        ContaPoupanca p = new ContaPoupanca(123, "Ruan");
        ContaPoupanca p1 = new ContaPoupanca(123, "Tulio");
        List<Conta> lista = new ArrayList<Conta>();
        lista.add(c);
        lista.add(c1);
        lista.add(p);
        lista.add(p1);
        System.out.println(lista);

    }
    
}

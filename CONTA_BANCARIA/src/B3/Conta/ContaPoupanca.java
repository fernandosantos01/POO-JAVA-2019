/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3.Conta;

/**
 *
 * @author Lab
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, String nome) {
        super(saldo, nome);
    }

    
    
     @Override
    public String toString() {
        return super.toString()+
                "\nContaPoupanca";
    }
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    @Override
    public Conta compareTo(Conta o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

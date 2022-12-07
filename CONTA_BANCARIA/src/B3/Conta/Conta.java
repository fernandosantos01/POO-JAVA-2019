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
public abstract class Conta implements Comparable{
    protected double saldo;
    public String nome;

    public Conta(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta" + 
                "\nsaldo=" + saldo +
                "\nnome=" + nome;
    }

    public void atualiza(double taxa) {
           this.saldo += this.saldo * taxa;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
}

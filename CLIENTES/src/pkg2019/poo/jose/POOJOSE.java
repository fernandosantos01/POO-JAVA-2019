/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019.poo.jose;

import B4.DAO.Cliente;
import B4.DAO.ClienteDAO;
import B4.DAO.ConnectionFactory;
import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class POOJOSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       ClienteDAO cdao = new ClienteDAO();
       Cliente cl = new Cliente(0, "Jose", "Rua Antonio Gomez", "86995376779", "4456852", "48245518689");
       cdao.adicionar(cl);
      //Connection con = new ConnectionFactory().getConnection();
        //System.out.println("Conexão Sucedida!");
    }
    
}

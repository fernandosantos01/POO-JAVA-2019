/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B4.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lab
 */
public class ClienteDAO {
    protected Connection connection;



    public ClienteDAO() {
        this.connection =  new ConnectionFactory().getConnection();
        System.out.println("Conexão Sucedida!");
    }

    public void adicionar(Cliente c){
        String sql = "insert into contatos"
                    + " (id,nome,endereco,telefone,rg,cpf)"
                    + " values (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //seta os valores
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getRg());
            stmt.setString(6, c.getCpf());
            
            //executar
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    public void remover(Cliente c){
        
    }
    public void atualizar(Cliente c){
        
    }
    
    
    
    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}

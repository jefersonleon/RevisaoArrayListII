/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import br.ulbra.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class UsuarioDao {

    Connection con;

    public UsuarioDao() throws SQLException {
        //construtor da classe UsuarioDao
        con = ConnectionFactory.getConnection();
    }
    //MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS
    public void insere(Usuario u)  {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbusuario(nome,email,senha,fone) VALUES (?,?,?,?)");
            stmt.setString(0, u.getNome());
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getFone());
         

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro:"+ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
                    
        }

    }
}

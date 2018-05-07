package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericoDao {

    String urlDeConexao = "jdbc:mysql://localhost/pizzaria";
    String usuario = "root";
    String senha = "";

    public Connection LerConexao() {
        try {
            Connection conexao = DriverManager.getConnection(urlDeConexao, usuario, senha);
            System.out.println("Conectado");
            return conexao;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

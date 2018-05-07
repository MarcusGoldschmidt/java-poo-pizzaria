package br.com.dao;

import br.com.pizzaria.model.Pizza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaDao {

    public void inserir(Pizza piz) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into pizza (nomePizza, preco, tamanho) values (?,?,?)";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setString(1, piz.getNome());
        ptst.setFloat(2, piz.getPreco());
        ptst.setString(3, piz.getTamanho());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void altera(Pizza piz) {
        String sql = "update pizza set nome=?, tamanho=?, preco=?" + "where idPizza=?";
        Connection con = new GenericoDao().LerConexao();
        try {
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, piz.getNome());
            ptst.setString(2, piz.getTamanho());
            ptst.setFloat(3, piz.getPreco());
            ptst.setInt(4, piz.getIdPizza());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Pizza piz) throws SQLException {
        String sql = "delete from Pizza"
                + " where idPizza=" + piz.getIdPizza();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Pizza ConsultarPizza(Pizza piz) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM pizza where idPizza" + piz.getIdPizza();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Pizza pizza = new Pizza();
        while (rs.next()) {
            piz.setIdPizza(rs.getInt("id"));
            piz.setNome(rs.getString("Nome"));
            piz.setPreco(rs.getFloat("Preco"));
            piz.setTamanho(rs.getString("Tamanho"));
        }

        rs.close();
        return piz;
    }

}

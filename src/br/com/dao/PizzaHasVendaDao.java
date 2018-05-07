package br.com.dao;

import br.com.pizzaria.model.PizzaHasVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PizzaHasVendaDao {

    public void inserir(PizzaHasVenda phv) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into pizzaHasVenda (Pizza_idPizza,Venda_idVenda, quantidade) values (?,?,?)";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setInt(1, phv.getPiz().getIdPizza());
        ptst.setInt(2, phv.getVen().getIdVenda());
        ptst.setInt(3, phv.getQuantidade());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void altera(PizzaHasVenda phv) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update PizzaHasVenda set idPizza=?, idVenda=?, quantidade=?";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setInt(1, phv.getPiz().getIdPizza());
        ptst.setInt(2, phv.getVen().getIdVenda());
        ptst.setInt(3, phv.getQuantidade());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");
    }

    public void remove(PizzaHasVenda phv) throws SQLException {
        String sql = "delete from PizzaHasVenda"
                + " where Piz=" + phv.getPiz();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }
}

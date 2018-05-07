package br.com.dao;

import br.com.pizzaria.model.SaborHasPizza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaborHasPizzaDao {

    public void Inserir(SaborHasPizza shp) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into sabor_has_pizza (Sabor_id_sabor, Pizza_idPizza) values (?,?)";

        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setInt(1, shp.getSab().getIdSabor());
        ptst.setInt(2, shp.getPiz().getIdPizza());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();

    }

    public void altera(SaborHasPizza shp) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update sabor_has_pizza set Sabor_id_sabor=?, Pizza_idPizza=?"
                + "where idFuncionario=?";

        try {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.setInt(1, shp.getSab().getIdSabor());
            ptst.setInt(2, shp.getPiz().getIdPizza());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(SaborHasPizza shp) throws SQLException {
        String sql = "delete from SaborHasPizza"
                + " where Sabor=" + shp.getSab();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

}

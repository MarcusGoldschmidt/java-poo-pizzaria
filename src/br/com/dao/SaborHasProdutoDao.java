package br.com.dao;

import br.com.pizzaria.model.SaborHasProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaborHasProdutoDao {

    public void Inserir(SaborHasProduto shp) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into sabor_has_produto (Sabor_id_sabor, Produto_idProduto) values (?,?)";

        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setInt(1, shp.getSab().getIdSabor());
        ptst.setInt(2, shp.getPro().getIdProduto());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void altera(SaborHasProduto shp) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update sabor_has_produto set Sabor_id_sabor=?, Produto_idProduto=?"
                + " where idSabor=?";

        try {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.setInt(1, shp.getPro().getIdProduto());
            ptst.setInt(2, shp.getSab().getIdSabor());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(SaborHasProduto shp) throws SQLException {
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

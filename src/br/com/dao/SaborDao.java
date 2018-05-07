package br.com.dao;

import br.com.pizzaria.model.Sabor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaborDao {

    public void Inserir(Sabor sab) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into sabor (nome_sabor, Funcionario_idFuncionario) values (?,?)";

        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setString(1, sab.getNomeSabor());
        ptst.setInt(2, sab.getFun().getIdFuncionario());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();

    }

    public void altera(Sabor sab) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update sabor set nome_sabor=?, idFuncionario=?"
                + "where idSabor";

        try {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.setString(1, sab.getNomeSabor());
            ptst.setInt(2, sab.getFun().getIdFuncionario());
            ptst.setInt(3, sab.getIdSabor());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Sabor sab) throws SQLException {
        String sql = "delete from sabor"
                + " where idSabor=" + sab.getIdSabor();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Sabor ConsultarSabor(Sabor sab) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM sabor where idSabor" + sab.getIdSabor();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Sabor sabor = new Sabor();
        while (rs.next()) {
            sab.setIdSabor(rs.getInt("id"));
            sab.setNomeSabor(rs.getString("nomeSabor"));
            sab.getFun().setIdFuncionario(rs.getInt("Fun"));
        }

        rs.close();
        return sab;
    }

}

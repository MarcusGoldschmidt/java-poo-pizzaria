package br.com.dao;

import br.com.pizzaria.model.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MesaDao {

    public void Inserir(Mesa mes) throws SQLException {

        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into mesa (Funcionario_idFuncionario) values (?)";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setInt(1, mes.getFun().getIdFuncionario());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void remove(Mesa mes) throws SQLException {
        String sql = "delete from Mesa"
                + " where idMesa=" + mes.getIdMesa();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Mesa ConsultarMesa(Mesa mes) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM Mesa where IdMesa" + mes.getIdMesa();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Mesa mesa = new Mesa();
        while (rs.next()) {
            mes.setIdMesa(rs.getInt("id"));
        }

        rs.close();
        return mes;
    }
}

package br.com.dao;

import br.com.pizzaria.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDao {

    public void Inserir(Venda ven) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into produto (dataVenda, valor, Cliente_idCliente, Funcionario_idFuncionario, mesa_idmesa) values (?,?,?,?,?)";

        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setDate(1, ven.getDataVenda());
        ptst.setFloat(2, ven.getValor());
        ptst.setFloat(3, ven.getCli().getId());
        ptst.setFloat(4, ven.getFun().getIdFuncionario());
        ptst.setFloat(5, ven.getMes().getIdMesa());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();

    }

    public void altera(Venda ven) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update venda set dataVenda=?, valor=?, idCliente=?, idFuncionario=?, idMesa=?"
                + "where idVenda";

        try {
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setDate(1, ven.getDataVenda());
            ptst.setFloat(2, ven.getValor());
            ptst.setInt(3, ven.getCli().getId());
            ptst.setInt(4, ven.getFun().getIdFuncionario());
            ptst.setInt(5, ven.getMes().getIdMesa());
            ptst.setInt(6, ven.getIdVenda());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Venda ven) throws SQLException {
        String sql = "delete from venda"
                + " where idVenda=" + ven.getIdVenda();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Venda ConsultarId(Venda ven) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM venda where idVenda = " + ven.getIdVenda();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Venda venda = new Venda();
        while (rs.next()) {
            ven.setIdVenda(rs.getInt("id"));
            ven.setValor(rs.getFloat("Valor"));
            ven.setDataVenda(rs.getDate("DataVenda"));
        }

        rs.close();
        return ven;
    }

}

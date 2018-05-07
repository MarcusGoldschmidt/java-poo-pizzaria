package br.com.dao;

import br.com.pizzaria.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDao {

    public void Inserir(Produto pro) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into produto (nome_produto, valor, data_de_entrada, data_de_vencimento, quantidade, Fornecedor_idFornecedor, Funcionario_idFuncionario) values (?,?,?,?,?,?,?)";

        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setString(1, pro.getNomeProduto());
        ptst.setFloat(2, pro.getValor());
        ptst.setDate(3, pro.getDataEntrada());
        ptst.setDate(4, pro.getDataVencimento());
        ptst.setInt(5, pro.getQuantidade());
        ptst.setInt(6, pro.getForn().getIdFornecedor());
        ptst.setInt(7, pro.getFun().getIdFuncionario());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();

    }

    public void Altera(Produto pro) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update produto set nome_produto=?, valor=?, data_de_entrada=?, data_de_vencimento=?, quantidade=?, idFornecedor=?,_idFuncionario=?"
                + " where idProduto";
        try {
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, pro.getNomeProduto());
            ptst.setFloat(2, pro.getValor());
            ptst.setDate(3, pro.getDataEntrada());
            ptst.setDate(4, pro.getDataVencimento());
            ptst.setInt(5, pro.getQuantidade());
            ptst.setInt(6, pro.getForn().getIdFornecedor());
            ptst.setInt(7, pro.getFun().getIdFuncionario());

            ptst.execute();
            ptst.close();

            System.out.println("Gravado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Produto pro) throws SQLException {
        String sql = "delete from produto"
                + " where idProduto=" + pro.getIdProduto();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Produto ConsultarProduto(Produto pro) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM produto where idProduto" + pro.getIdProduto();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Produto produto = new Produto();
        while (rs.next()) {
            pro.setIdProduto(rs.getInt("id"));
            pro.setNomeProduto(rs.getString("nomeProduto"));
            pro.setValor(rs.getFloat("Valor"));
            pro.setQuantidade(rs.getInt("Quantidade"));
            pro.setDataEntrada(rs.getDate("DataEntrada"));
            pro.setDataVencimento(rs.getDate("DataVencimento"));
        }

        rs.close();
        return pro;
    }

}

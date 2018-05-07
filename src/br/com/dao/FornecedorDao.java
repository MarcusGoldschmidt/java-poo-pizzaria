package br.com.dao;

import br.com.pizzaria.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDao {

    public void Inserir(Fornecedor For) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "inserir into fornecedor (cnpj, nome_fornecedor, telefone, bairro, logradouro, numero, complemento,Funcionario_idFuncionario) values (?,?,?,?,?,?,?,?)";
        PreparedStatement ptst = con.prepareStatement(sql);
        ptst.setString(1, For.getCnpj());
        ptst.setString(2, For.getNomeFornecedor());
        ptst.setString(3, For.getTelefone());
        ptst.setString(4, For.getBairro());
        ptst.setString(5, For.getLogradouro());
        ptst.setString(6, For.getNumero());
        ptst.setString(7, For.getComplemento());
        ptst.setInt(8, For.getFun().getIdFuncionario());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void Altera(Fornecedor For) {
        Connection con = new GenericoDao().LerConexao();
        String sql = "updade fornecedor set cnpj=?, nome_fornecedor=?, telefone=?, bairro=?, logradouro=?, numero=?, complemento=?"
                + "where idFornecedor=" + For.getIdFornecedor();
        try {
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, For.getCnpj());
            ptst.setString(2, For.getNomeFornecedor());
            ptst.setString(3, For.getTelefone());
            ptst.setString(4, For.getBairro());
            ptst.setString(5, For.getLogradouro());
            ptst.setString(6, For.getNumero());
            ptst.setString(7, For.getComplemento());

            ptst.execute();
            ptst.close();

            System.out.println("Alterado");

            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Fornecedor For) throws SQLException {
        String sql = "delete from fornecedor"
                + " where idCliente=" + For.getIdFornecedor();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Fornecedor ConsultarId(Fornecedor For) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM venda where idCliente = " + For.getIdFornecedor();
        PreparedStatement stmt = con.prepareStatement(sql);
        try (ResultSet rs = stmt.executeQuery()) {
            Fornecedor fornecedor = new Fornecedor();
            while (rs.next()) {
                For.setIdFornecedor(rs.getInt("id"));
                For.setCnpj(rs.getString("CNPJ"));
                For.setNomeFornecedor(rs.getString("Nome"));
                For.setTelefone(rs.getString("Telefone"));
                For.setBairro(rs.getString("Bairro"));
                For.setLogradouro(rs.getString("Logradouro"));
                For.setNumero(rs.getString("Numero"));
                For.setComplemento(rs.getString("Complemento"));
                For.getFun().setIdFuncionario(rs.getInt("Id Funcionario"));
            }
        }
        return For;
    }

    public Fornecedor ConsultarCNPJ(Fornecedor For) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM fornecedor where cnpj LIKE '%" + For.getCnpj() + "%'";
        PreparedStatement stmt = con.prepareStatement(sql);
        List ArrayFor = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Fornecedor fornecedor = new Fornecedor();
            while (rs.next()) {
                For.setIdFornecedor(rs.getInt("id"));
                For.setCnpj(rs.getString("CNPJ"));
                For.setNomeFornecedor(rs.getString("Nome"));
                For.setTelefone(rs.getString("Telefone"));
                For.setBairro(rs.getString("Bairro"));
                For.setLogradouro(rs.getString("Logradouro"));
                For.setNumero(rs.getString("Numero"));
                For.setComplemento(rs.getString("Complemento"));
                For.getFun().setIdFuncionario(rs.getInt("Id Funcionario"));
            }
        }
        return For;
    }

    public List<Fornecedor> ConsultarNome(Fornecedor For) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM fornecedor where nome_fornecedor LIKE '%" + For.getCnpj() + "%'";
        PreparedStatement stmt = con.prepareStatement(sql);
        List ArrayFor = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Fornecedor fornecedor = new Fornecedor();
            while (rs.next()) {
                For.setIdFornecedor(rs.getInt("id"));
                For.setCnpj(rs.getString("CNPJ"));
                For.setNomeFornecedor(rs.getString("Nome"));
                For.setTelefone(rs.getString("Telefone"));
                For.setBairro(rs.getString("Bairro"));
                For.setLogradouro(rs.getString("Logradouro"));
                For.setNumero(rs.getString("Numero"));
                For.setComplemento(rs.getString("Complemento"));
                For.getFun().setIdFuncionario(rs.getInt("Id Funcionario"));
            }
        }
        return ArrayFor;
    }

}

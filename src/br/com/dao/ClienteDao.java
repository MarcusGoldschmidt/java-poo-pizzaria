package br.com.dao;

import br.com.pizzaria.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    public void Inserir(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into cliente (NomeCliente,cpfcliente,telefone,bairro,numero,logradouro,complemento) values (?,?,?,?,?,?,?)";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setString(1, cli.getNome());
        ptst.setString(2, cli.getCpf());
        ptst.setString(3, cli.getTelefone());
        ptst.setString(4, cli.getBairro());
        ptst.setString(5, cli.getNumero());
        ptst.setString(6, cli.getLogradouro());
        ptst.setString(7, cli.getComplemento());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void altera(Cliente cli) {
        String sql = "update cliente set NomeCliente=?, cpfcliente=?, telefone=?, bairro=?, numero=?, logradouro=?, complemento=?"
                + " where idCliente=" + cli.getId();
        Connection con = new GenericoDao().LerConexao();
        try {
            try (PreparedStatement ptst = con.prepareStatement(sql)) {
                ptst.setString(1, cli.getNome());
                ptst.setString(2, cli.getCpf());
                ptst.setString(3, cli.getTelefone());
                ptst.setString(4, cli.getBairro());
                ptst.setString(5, cli.getNumero());
                ptst.setString(6, cli.getLogradouro());
                ptst.setString(7, cli.getComplemento());

                ptst.execute();
                ptst.close();
                con.close();
            }

            System.out.println("Alterado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Cliente cli) throws SQLException {
        String sql = "delete from cliente"
                + " where idCliente=" + cli.getId();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Cliente ConsultarId(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM cliente where idCliente = " + cli.getId();
        PreparedStatement stmt = con.prepareStatement(sql);
        try (ResultSet rs = stmt.executeQuery()) {
            Cliente cliente = new Cliente();
            while (rs.next()) {
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("Nome"));
                cli.setCpf(rs.getString("CPF"));
                cli.setTelefone(rs.getString("Telefone"));
                cli.setBairro(rs.getString("Bairro"));
                cli.setNumero(rs.getString("Numero"));
                cli.setLogradouro(rs.getString("Logradouro"));
                cli.setComplemento(rs.getString("Complemento"));
            }
        }
        return cli;
    }

    public List<Cliente> ConsultarNome(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM cliente where NomeCliente LIKE '%" + cli.getNome() + "%'";
        PreparedStatement stmt = con.prepareStatement(sql);

        List clientes = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Cliente cliente = new Cliente();
            while (rs.next()) {
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("Nome"));
                cli.setCpf(rs.getString("CPF"));
                cli.setTelefone(rs.getString("Telefone"));
                cli.setBairro(rs.getString("Bairro"));
                cli.setNumero(rs.getString("Numero"));
                cli.setLogradouro(rs.getString("Logradouro"));
                cli.setComplemento(rs.getString("Complemento"));
                clientes.add(cli);
            }
        }
        return clientes;
    }

    public List<Cliente> ConsultarCpf(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM cliente where idCliente LIKE '%" + cli.getCpf() + "%'";
        PreparedStatement stmt = con.prepareStatement(sql);

        List clientes = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Cliente cliente = new Cliente();
            while (rs.next()) {
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("Nome"));
                cli.setCpf(rs.getString("CPF"));
                cli.setTelefone(rs.getString("Telefone"));
                cli.setBairro(rs.getString("Bairro"));
                cli.setNumero(rs.getString("Numero"));
                cli.setLogradouro(rs.getString("Logradouro"));
                cli.setComplemento(rs.getString("Complemento"));
                clientes.add(cli);
            }
        }
        return clientes;
    }

    public List<Cliente> ConsultarNomeDesc(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM cliente ORDER BY NomeCliente DESC";
        PreparedStatement stmt = con.prepareStatement(sql);

        List clientes = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Cliente cliente = new Cliente();
            while (rs.next()) {
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("Nome"));
                cli.setCpf(rs.getString("CPF"));
                cli.setTelefone(rs.getString("Telefone"));
                cli.setBairro(rs.getString("Bairro"));
                cli.setNumero(rs.getString("Numero"));
                cli.setLogradouro(rs.getString("Logradouro"));
                cli.setComplemento(rs.getString("Complemento"));
                clientes.add(cli);
            }
        }
        return clientes;
    }

    public List<Cliente> ConsultarNomeAsc(Cliente cli) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM cliente ORDER BY NomeCliente ASC";
        PreparedStatement stmt = con.prepareStatement(sql);

        List clientes = new ArrayList();
        try (ResultSet rs = stmt.executeQuery()) {
            Cliente cliente = new Cliente();
            while (rs.next()) {
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("Nome"));
                cli.setCpf(rs.getString("CPF"));
                cli.setTelefone(rs.getString("Telefone"));
                cli.setBairro(rs.getString("Bairro"));
                cli.setNumero(rs.getString("Numero"));
                cli.setLogradouro(rs.getString("Logradouro"));
                cli.setComplemento(rs.getString("Complemento"));
                clientes.add(cli);
            }
        }
        return clientes;
    }

}

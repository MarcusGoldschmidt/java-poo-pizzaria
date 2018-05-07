package br.com.dao;

import br.com.pizzaria.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDao {

    public void Inserir(Funcionario fun) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "insert into funcionario (id_cargo, nome_funcionario, telefone, bairro, numero, logradouro, complemento, cpf, sexo, salario) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ptst = con.prepareStatement(sql);

        ptst.setString(1, fun.getIdCargo());
        ptst.setString(2, fun.getNomeFuncionario());
        ptst.setString(3, fun.getTelefone());
        ptst.setString(4, fun.getBairro());
        ptst.setString(5, fun.getNumero());
        ptst.setString(6, fun.getLogradouro());
        ptst.setString(7, fun.getComplemento());
        ptst.setString(8, fun.getCpf());
        ptst.setString(9, fun.getSexo());
        ptst.setFloat(10, fun.getSalario());

        ptst.execute();
        ptst.close();

        System.out.println("Gravado");

        con.close();
    }

    public void Altera(Funcionario fun) {
        Connection con = new GenericoDao().LerConexao();
        String sql = "update funcionario set id_cargo =?, nome_funcionario =?, telefone =?, bairro=?, numero=?, logradouro=?, complemento=?, cpf=?, sexo=?, salario=?"
                + "where idFuncionario=" + fun.getIdFuncionario();
        try {
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, fun.getIdCargo());
            ptst.setString(2, fun.getNomeFuncionario());
            ptst.setString(3, fun.getTelefone());
            ptst.setString(4, fun.getBairro());
            ptst.setString(5, fun.getNumero());
            ptst.setString(6, fun.getLogradouro());
            ptst.setString(7, fun.getComplemento());
            ptst.setString(8, fun.getCpf());
            ptst.setString(9, fun.getSexo());
            ptst.setFloat(10, fun.getSalario());

            ptst.execute();
            ptst.close();

            System.out.println("Alterado");

            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Funcionario fun) throws SQLException {
        String sql = "delete from funcionario"
                + " where idFuncionario=" + fun.getIdFuncionario();

        try (Connection con = new GenericoDao().LerConexao();) {
            PreparedStatement ptst = con.prepareStatement(sql);

            ptst.execute();
            ptst.close();
        }

        System.out.println("Excluido");
    }

    public Funcionario ConsultarFuncionario(Funcionario fun) throws SQLException {
        Connection con = new GenericoDao().LerConexao();
        String sql = "SELECT * FROM Funcionario where idFuncionario =" + fun.getIdFuncionario();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        Funcionario funcionario = new Funcionario();
        while (rs.next()) {
            fun.setIdFuncionario(rs.getInt("id"));
            fun.setNomeFuncionario(rs.getString("Nome"));
            fun.setSalario(rs.getFloat("Salario"));
            fun.setCpf(rs.getNString("Cpf"));
            fun.setTelefone(rs.getNString("Telefone"));
        }

        rs.close();
        return fun;
    }
}

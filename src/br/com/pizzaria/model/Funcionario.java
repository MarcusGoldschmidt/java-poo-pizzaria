package br.com.pizzaria.model;

public class Funcionario {

    private int idFuncionario;
    private float salario;
    private String idCargo, nomeFuncionario, telefone, bairro, numero, logradouro, complemento, cpf, sexo;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, float salario, String idCargo, String nomeFuncionario, String telefone, String bairro, String numero, String logradouro, String complemento, String cpf, String sexo) {
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.idCargo = idCargo;
        this.nomeFuncionario = nomeFuncionario;
        this.telefone = telefone;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}

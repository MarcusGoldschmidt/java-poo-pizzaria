package br.com.pizzaria.model;

public class Cliente {

    private String nomeCliente, cpf, telefone, bairro, numero, logradouro, complemento;
    private int idCliente;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String telefone, String bairro, String numero, String logradouro, String complemento, int id) {
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.idCliente = id;
    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public int getId() {
        return idCliente;
    }

    public void setId(int id) {
        this.idCliente = id;
    }

}

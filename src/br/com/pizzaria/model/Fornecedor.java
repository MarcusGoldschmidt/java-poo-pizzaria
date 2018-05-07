package br.com.pizzaria.model;

public class Fornecedor {

    private int idFornecedor;
    private String cnpj, nomeFornecedor, telefone, bairro, logradouro, numero, complemento;
    private Funcionario fun;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String cnpj, String nomeFornecedor, String telefone, String bairro, String logradouro, String numero, String complemento, Funcionario fun) {
        this.idFornecedor = idFornecedor;
        this.cnpj = cnpj;
        this.nomeFornecedor = nomeFornecedor;
        this.telefone = telefone;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.fun = fun;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

}

package br.com.pizzaria.model;

import java.sql.Date;

public class Produto {

    private int idProduto, quantidade;
    private float valor;
    private Date dataEntrada, dataVencimento;
    private String nomeProduto;
    private Fornecedor forn;
    private Funcionario fun;

    public Produto() {
    }

    public Produto(int idProduto, int quantidade, float valor, Date dataEntrada, Date dataVencimento, String nomeProduto, Fornecedor forn, Funcionario fun) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.dataVencimento = dataVencimento;
        this.nomeProduto = nomeProduto;
        this.forn = forn;
        this.fun = fun;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

}

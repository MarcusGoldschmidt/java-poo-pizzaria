package br.com.pizzaria.model;

import java.sql.Date;

public class Venda {

    private int idVenda;
    private Date dataVenda;
    private float valor;
    private Cliente cli;
    private Funcionario fun;
    private Mesa mes;

    public Venda() {
    }

    public Venda(int idVenda, Date dataVenda, float valor, Cliente cli, Funcionario fun, Mesa mes) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.cli = cli;
        this.fun = fun;
        this.mes = mes;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

    public Mesa getMes() {
        return mes;
    }

    public void setMes(Mesa mes) {
        this.mes = mes;
    }

}

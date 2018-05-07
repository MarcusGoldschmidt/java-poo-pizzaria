package br.com.pizzaria.model;

public class Mesa {

    private int idMesa;
    private Funcionario fun;

    public Mesa() {
    }

    public Mesa(int idMesa, Funcionario fun) {
        this.idMesa = idMesa;
        this.fun = fun;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

}

package br.com.pizzaria.model;

public class Sabor {

    private int idSabor;
    private String nomeSabor;
    private Funcionario fun;

    public Sabor() {
    }

    public Sabor(int idSabor, String nomeSabor, Funcionario fun) {
        this.idSabor = idSabor;
        this.nomeSabor = nomeSabor;
        this.fun = fun;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public String getNomeSabor() {
        return nomeSabor;
    }

    public void setNomeSabor(String nomeSabor) {
        this.nomeSabor = nomeSabor;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

}

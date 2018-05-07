package br.com.pizzaria.model;

public class SaborHasPizza {

    private Sabor sab;
    private Pizza piz;

    public SaborHasPizza() {
    }

    public SaborHasPizza(Sabor sab, Pizza piz) {
        this.sab = sab;
        this.piz = piz;
    }

    public Sabor getSab() {
        return sab;
    }

    public void setSab(Sabor sab) {
        this.sab = sab;
    }

    public Pizza getPiz() {
        return piz;
    }

    public void setPiz(Pizza piz) {
        this.piz = piz;
    }

}

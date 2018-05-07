package br.com.pizzaria.model;

public class PizzaHasVenda {

    private Pizza piz;
    private Venda ven;
    private int quantidade;

    public PizzaHasVenda() {
    }

    public PizzaHasVenda(Pizza piz, Venda ven, int quantidade) {
        this.piz = piz;
        this.ven = ven;
        this.quantidade = quantidade;
    }

    public Pizza getPiz() {
        return piz;
    }

    public void setPiz(Pizza piz) {
        this.piz = piz;
    }

    public Venda getVen() {
        return ven;
    }

    public void setVen(Venda ven) {
        this.ven = ven;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

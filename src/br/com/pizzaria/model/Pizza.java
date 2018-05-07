package br.com.pizzaria.model;

public class Pizza {

    private int idPizza;
    private String nome, tamanho;
    private float preco;

    public Pizza() {
    }

    public Pizza(int idPizza, String nome, String tamanho, float preco) {
        this.idPizza = idPizza;
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}

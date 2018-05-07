package br.com.pizzaria.model;

public class SaborHasProduto {

    private Sabor sab;
    private Produto pro;

    public SaborHasProduto() {
    }

    public SaborHasProduto(Sabor sab, Produto pro) {
        this.sab = sab;
        this.pro = pro;
    }

    public Sabor getSab() {
        return sab;
    }

    public void setSab(Sabor sab) {
        this.sab = sab;
    }

    public Produto getPro() {
        return pro;
    }

    public void setPro(Produto pro) {
        this.pro = pro;
    }

    public Object getPiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

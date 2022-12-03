package ro.mycode.Mancare.Extra;

import ro.mycode.Mancare.Burger;

public abstract class ExtraIngrediente extends Burger {

    private String nume;
    private double pret;
    private Burger burger;

    public ExtraIngrediente(String nume, double pret, Burger burger) {
        this.nume = nume;
        this.pret = pret;
        this.burger = burger;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }
}

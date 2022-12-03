package ro.mycode.Mancare.Extra;

import ro.mycode.Mancare.Burger;

public class Ou extends ExtraIngrediente{

    public Ou(String nume, double pret, Burger burger) {
        super(nume, pret, burger);
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nume: " + this.getNume() + "\n";
        text += "Pret: " + this.getPret() + " lei\n";
        return text;
    }

    @Override
    public void afisare() {
        System.out.println(this);

    }

    @Override
    public String plusDescriere() {
        return getBurger().plusDescriere() + ", " + getNume();
    }

    @Override
    public double cost() {
        return getPret() + getBurger().getPret();
    }
}

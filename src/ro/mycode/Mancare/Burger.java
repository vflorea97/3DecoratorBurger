package ro.mycode.Mancare;

public abstract class Burger {

    private String nume;
    private double pret;
    private String tipCarne;

    public Burger(String nume, double pret, String tipCarne) {
        this.nume = nume;
        this.pret = pret;
        this.tipCarne = tipCarne;
    }

    public Burger() {
        this.nume = "";
        this.pret = 0.0;
        this.tipCarne = "";
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nume: " + this.nume + "\n";
        text += "Pret: " + this.pret + " lei\n";
        text += "Tip Carne: " + this.tipCarne + "\n";
        return text;
    }
    public abstract void afisare();
    public abstract String plusDescriere();
    public abstract double cost();

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

    public String getTipCarne() {
        return tipCarne;
    }

    public void setTipCarne(String tipCarne) {
        this.tipCarne = tipCarne;
    }
}

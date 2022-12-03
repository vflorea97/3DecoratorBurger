package ro.mycode.Mancare;

public class OnionBurger extends Burger{

    public OnionBurger(String nume, double pret, String tipCarne) {
        super(nume, pret, tipCarne);
    }

    @Override
    public void afisare() {
        System.out.println(super.toString());
    }

    @Override
    public String plusDescriere() {
        return "Burger cu ";
    }

    @Override
    public double cost() {
        return getPret();
    }
}

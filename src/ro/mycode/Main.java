package ro.mycode;

import ro.mycode.Controller.ControllerBurger;
import ro.mycode.Mancare.*;
import ro.mycode.Mancare.Extra.Bacon;
import ro.mycode.Mancare.Extra.ExtraIngrediente;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Burger burger = new CheeseBurger("Cheese Burger",22,"Vita");
        Burger burger1 = new ChickenBurger("Chicken Burger",19,"Pui");
        Burger burger2 = new DoubleCheeseBurger("Double Cheese Burger",27,"Vita");
        Burger burger3 = new HotBurger("Hot Burger",20,"Vita");
        Burger burger4 = new OnionBurger("Onion Burger",24,"Vita");
        Burger burger5 = new PorkBurger("Pork Burger",20,"Porc");

        ArrayList<Burger> burgers = new ArrayList<>();
        burgers.add(burger);
        burgers.add(burger1);
        burgers.add(burger2);
        burgers.add(burger3);
        burgers.add(burger4);
        burgers.add(burger5);

        burgers.add(burger1);


    }
}

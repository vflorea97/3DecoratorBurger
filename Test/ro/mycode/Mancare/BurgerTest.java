package ro.mycode.Mancare;

import org.junit.jupiter.api.Test;
import ro.mycode.Controller.ControllerBurger;
import ro.mycode.Mancare.Extra.Bacon;
import ro.mycode.Mancare.Extra.Jalapeno;

class BurgerTest {

    @Test
    void afisare() {

        Burger burger = new DoubleCheeseBurger("Double Cheese",20,"Vita");
        Burger burger1 = new HotBurger("Hot Burger",19,"Vita");

//        burger = new Bacon("Bacon",1,burger);
//        burger = new Jalapeno("Jalapeno",2,burger);

        ControllerBurger controllerBurger = new ControllerBurger();

        controllerBurger.afisare();
    }
}
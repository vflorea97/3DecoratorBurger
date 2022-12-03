package ro.mycode.Controller;

import ro.mycode.Mancare.Burger;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBurger {

    private ArrayList<Burger> burgers;

    public ControllerBurger(){
        burgers = new ArrayList<>();
        this.load();
    }
    public void load(){
        try{
            File file = new File("D:\\mycode\\HeadFirst\\Exercitii\\3DecoratorPatterEx\\src\\ro\\mycode\\Data\\Burger.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
//                Burger burger = new Burger(t);
//                this.burgers.add(burger);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
    public void afisare(){
        for (int  i = 0; i < burgers.size(); i++){
            burgers.get(i).afisare();
        }
    }
    public void addBurger(Burger burger){
        this.burgers.add(burger);
    }
}

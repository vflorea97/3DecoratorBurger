package ro.mycode.View;

import ro.mycode.Controller.ControllerBurger;

import java.util.Scanner;

public class View {

    private ControllerBurger controllerBurger;
    private Scanner scanner;

    public View(){
        controllerBurger = new ControllerBurger();
        scanner = new Scanner(System.in);
    }

    public void meniu(){
        System.out.println("Apasa 1 pentru a afisa burgerii");
        System.out.println("Apasa 2 pentru a alege un burger");
    }

    public void run() {
        boolean run = true;
        meniu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton){
                case 1:
                    break;
                case 2:
                    break;
            }
        }
    }
}

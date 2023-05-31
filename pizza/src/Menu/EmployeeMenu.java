package Menu;

import Pizza.PizzaMenu;

import java.util.Scanner;

public class EmployeeMenu {
    public void EmployeerMenu(){
        Scanner s = new Scanner(System.in);

        PizzaMenu pizzaMenu = new PizzaMenu();
        Menu menu = new Menu();

        System.out.println("Podaj PIN: ");
        int pin = s.nextInt();

        if (pin == 27280){
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodawanie nowej pizzy.");
            System.out.println("2. Powrót do menu");
            System.out.println("3. Zakończ działanie");

            int employeechoise = s.nextInt();

            switch (employeechoise){
                case 1:
                    pizzaMenu.addPizza();
                    System.out.println("Dodano nową pizzę do menu!");
                    System.out.println(pizzaMenu.toString());
                    menu.Menu();
                case 2:
                    menu.Menu();
                case 3:
                    break;
            }


        }else {
            System.out.println("Błędny pin");
            menu.Menu();
        }


    }
}

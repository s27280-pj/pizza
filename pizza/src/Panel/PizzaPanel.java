package Panel;

import Interfaces.IPanel;
import Pizza.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PizzaPanel implements IPanel {
    private List<Pizza> pizzas = new ArrayList<>();
    private int nextId = 10;

    public PizzaPanel() {
        pizzas.add(new PizzaPepperoni(1,"Pepperoni", Arrays.asList("sos", "ser", "papryka", "salami"), 2,"mała",30));
        pizzas.add(new PizzaPepperoni(2,"Pepperoni", Arrays.asList("sos", "ser", "papryka", "salami"), 2,"średnia",35));
        pizzas.add(new PizzaPepperoni(3,"Pepperoni", Arrays.asList("sos", "ser", "papryka", "salami"), 2,"duża",40));
        pizzas.add(new PizzaCapriciosa(4,"Capriciosa", Arrays.asList("sos", "ser", "szynka", "pieczarki"), 1,"mała",28));
        pizzas.add(new PizzaCapriciosa(5,"Capriciosa", Arrays.asList("sos", "ser", "szynka", "pieczarki"), 1,"średnia",33));
        pizzas.add(new PizzaCapriciosa(6,"Capriciosa", Arrays.asList("sos", "ser", "szynka", "pieczarki"), 1,"duża",38));
        pizzas.add(new PizzaVege(7,"Vege", Arrays.asList("sos", "ser", "szpinak", "pomidor"), 0,"mała",25));
        pizzas.add(new PizzaVege(8,"Vege", Arrays.asList("sos", "ser", "szpinak", "pomidor"), 0,"średnia",30));
        pizzas.add(new PizzaVege(9,"Vege", Arrays.asList("sos", "ser", "szpinak", "pomidor"), 0,"duża",35));
    }

    public Pizza getPizzaById(int id) {
        for (Pizza pizza : pizzas) {
            if (pizza.getId() == id) {
                return pizza;
            }
        }
        return null;
    }

    public void Show() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę nowej pizzy:");
        String name = scanner.nextLine();

        System.out.println("Podaj składniki nowej pizzy (oddzielone przecinkami):");
        String ingredientsInput = scanner.nextLine();
        List<String> ingredients = Arrays.asList(ingredientsInput.split(","));

        System.out.println("Podaj poziom ostrości nowej pizzy (0-2):");
        int spiciness = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Podaj rozmiar nowej pizzy:");
        String size = scanner.nextLine();

        System.out.println("Podaj cenę nowej pizzy:");
        double price = scanner.nextDouble();

        Pizza newPizza = new Pizza(nextId, name, ingredients, spiciness, size, price);
        pizzas.add(newPizza);

        System.out.println("Dodano nową pizzę do menu!");
        System.out.println(this.ShowMenu());

        nextId++;
    }

    public String ShowMenu() {
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("Menu:\n");
        for (Pizza pizza : pizzas) {
            menuBuilder.append(pizza.toString());
            menuBuilder.append("\n");
        }
        return menuBuilder.toString();
    }
}

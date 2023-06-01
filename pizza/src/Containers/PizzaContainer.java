package Containers;

import Pizza.Pizza;
import Pizza.PizzaCapriciosa;
import Pizza.PizzaPepperoni;
import Pizza.PizzaVege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaContainer {

    private List<Pizza> pizzas = new ArrayList<>();
    
    public PizzaContainer() {
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

    public Pizza FindPizzaById(int id) {
        for (Pizza pizza : pizzas) {
            if (pizza.getId() == id) {
                return pizza;
            }
        }
        return null;
    }

    public void AddNewPizza(Pizza pizza){
        pizzas.add(pizza);
        System.out.println("Dodano nową pizzę");
    }

    public void ShowAllPizzas() {
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("Menu:\n");
        for (Pizza pizza : pizzas) {
            menuBuilder.append(pizza.toString());
            menuBuilder.append("\n");
        }
        System.out.println(menuBuilder.toString());
    }

    public int PizzasCount(){
        return pizzas.size();
    }
}

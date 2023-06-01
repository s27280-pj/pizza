package Managers;

import Containers.PizzaContainer;

public class DataManager {
    private static PizzaContainer pizzaContainer = new PizzaContainer();

    public static PizzaContainer getPizzaContainer() {
        return pizzaContainer;
    }
}

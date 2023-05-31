package Cart;

import Pizza.Pizza;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Pizza> pizzaList = new ArrayList<>();
    private double deliveryCost;

    public Cart(boolean hasDelivery) {
        deliveryCost = hasDelivery ? 3.0 : 0.0;
    }

    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Pizza pizza : pizzaList) {
            total += pizza.getPrice();
        }
        total += deliveryCost;
        return total;
    }

    public void printReceipt() {
        for (Pizza pizza : pizzaList) {
            System.out.println("Nazwa: " + pizza.getName() +
                    ", Rozmiar: " + pizza.getSize() +
                    ", Cena: " + pizza.getPrice() + " zł");
        }
        if (deliveryCost > 0.0) {
            System.out.println("Dostawa: " + deliveryCost + " zł");
        }
        System.out.println("Razem: " + calculateTotal() + " zł");
    }

}

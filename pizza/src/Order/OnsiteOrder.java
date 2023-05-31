package Order;

import Pizza.PizzaMenu;

import java.util.Scanner;
import Cart.Cart;
import Pizza.*;

public class OnsiteOrder  implements Order {

    @Override
    public void MakeOrder() {
        Scanner s = new Scanner(System.in);

        Cart cart = new Cart(false);
        PizzaMenu pizzaMenu = new PizzaMenu();

        boolean ordering = true;

        while (ordering) {
            System.out.println("Wybierz swoją pizzę: ");
            System.out.println(pizzaMenu.toString());

            System.out.println("Podaj ID wybranej pizzy: ");
            int chosen = s.nextInt();

            Pizza chosenPizza = pizzaMenu.getPizzaById(chosen);
            if (chosenPizza != null) {
                cart.addPizza(chosenPizza);
                System.out.println("Pizza " + chosenPizza.getName() + " dodana do koszyka!");
            } else {
                System.out.println("Nie ma pizzy o takim ID.");
            }

            System.out.println("Czy chcesz zamówić kolejną pizzę? (tak/nie)");
            String nextOrder = s.next().toLowerCase();
            ordering = nextOrder.equals("tak");
        }

        cart.printReceipt();
    }

}




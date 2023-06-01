package Order;

import Enums.DeliveryType;
import Interfaces.IOrder;
import Managers.DataManager;

import java.util.Scanner;
import Cart.Cart;
import Pizza.*;

public class OnsiteIOrder implements IOrder {

    @Override
    public void MakeOrder() {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart(DeliveryType.ON_SITE);

        boolean ordering = true;

        while (ordering) {
            System.out.println("Wybierz swoją pizzę: ");
            DataManager.getPizzaContainer().ShowAllPizzas();

            System.out.println("Podaj ID wybranej pizzy: ");
            Pizza chosenPizza = DataManager.getPizzaContainer().FindPizzaById(scanner.nextInt());

            if (chosenPizza != null) {
                cart.addPizza(chosenPizza);
                System.out.println("Pizza " + chosenPizza.getName() + " dodana do koszyka!");
            }
            else {
                System.out.println("Nie ma pizzy o takim ID.");
            }

            System.out.println("Czy chcesz zamówić kolejną pizzę? (tak/nie)");
            String nextOrder = scanner.next().toLowerCase();
            ordering = nextOrder.equals("tak");
        }

        cart.printReceipt();
    }

}




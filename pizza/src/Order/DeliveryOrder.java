package Order;

import java.util.Random;
import java.util.Scanner;
import Cart.Cart;
import Pizza.*;

public class DeliveryOrder  implements Order{

    @Override
    public void MakeOrder() {
        Scanner s = new Scanner(System.in);

        Cart cart = new Cart(true);
        PizzaMenu pizzaMenu = new PizzaMenu();

        System.out.println("Podaj adres dostawy:");
        String address = s.nextLine();

        System.out.println("Podaj numer telefonu:");
        String phoneNumber = s.nextLine();

        System.out.println("Koszt dostawy to 3 zł.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
        System.out.println("Adres dostawy: " + address);
        Random random = new Random();
        int waitingTime = random.nextInt(171) + 30;
        System.out.println("Czas oczekiwania: " + waitingTime + " minut");
    }

}

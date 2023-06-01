package Order;

import java.util.Random;
import java.util.Scanner;
import Cart.Cart;
import Enums.DeliveryType;
import Interfaces.IOrder;
import Managers.DataManager;
import Pizza.*;

public class DeliveryIOrder implements IOrder {

    @Override
    public void MakeOrder() {
        Scanner scanner = new Scanner(System.in);

        Cart cart = new Cart(DeliveryType.FOR_DELIVERY);

        System.out.println("Podaj adres dostawy:");
        String address = scanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Koszt dostawy to 3 zł.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean ordering = true;

        while (ordering) {
            System.out.println("Wybierz swoją pizzę: ");
            DataManager.getPizzaContainer().ShowAllPizzas();

            System.out.println("Podaj ID wybranej pizzy: ");
            Pizza chosenPizza = DataManager.getPizzaContainer().FindPizzaById(scanner.nextInt());

            if (chosenPizza != null) {
                cart.addPizza(chosenPizza);
                System.out.println("Pizza " + chosenPizza.getName() + " dodana do koszyka!");
            } else {
                System.out.println("Nie ma pizzy o takim ID.");
            }

            System.out.println("Czy chcesz zamówić kolejną pizzę? (tak/nie)");
            String nextOrder = scanner.next().toLowerCase();
            ordering = nextOrder.equals("tak");
        }

        cart.printReceipt();
        System.out.println("Adres dostawy: " + address);
        Random random = new Random();
        int waitingTime = random.nextInt(171) + 30;
        System.out.println("Czas oczekiwania: " + waitingTime + " minut");
    }

}

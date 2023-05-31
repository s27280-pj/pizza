package Menu;

import Order.DeliveryOrder;
import Order.OnsiteOrder;

import java.util.Scanner;

public class Menu {
    public void Menu(){

        DeliveryOrder deliveryOrder = new DeliveryOrder();
        OnsiteOrder  onsiteOrder = new OnsiteOrder();
        EmployeeMenu employeeMenu = new EmployeeMenu();

        Scanner s = new Scanner(System.in);

        System.out.println("Wybierz opcję: ");
        System.out.println("1. Złóż zamówienie");
        System.out.println("2. Menu pracownicze (dodawanie nowej pizzy)");
        System.out.println("3. Zakończ");

        int choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println("1. Zamówienie na miejscu");
                System.out.println("2. Zamówienie z dostawą");

                int orderType = s.nextInt();

                if(orderType == 1) onsiteOrder.MakeOrder();
                else if (orderType == 2) {
                    deliveryOrder.MakeOrder();
                }else System.out.println("zły wybór");
            case 2:
                employeeMenu.EmployeerMenu();
        }

    }

}

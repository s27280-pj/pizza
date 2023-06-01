package Panel;

import Order.DeliveryIOrder;
import Order.OnsiteIOrder;
import Interfaces.IPanel;

import java.util.Scanner;

public class DefaultPanel implements IPanel{
    public void Show(){

        DeliveryIOrder deliveryOrder = new DeliveryIOrder();
        OnsiteIOrder onsiteOrder = new OnsiteIOrder();

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
                break;
            case 2:
                PanelManager.ChangePanel(PanelManager.getEmployeePanel());
                break;
        }

    }

}

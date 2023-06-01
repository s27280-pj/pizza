package Panel;

import Interfaces.*;

import java.util.Scanner;

public class EmployeePanel implements IPanel {
    public void Show(){
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj PIN: ");
        int pin = s.nextInt();

        if (pin == 27280){
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodawanie nowej pizzy.");
            System.out.println("2. Powrót do menu");
            System.out.println("3. Zakończ działanie");

            int employeechoise = s.nextInt();

            switch (employeechoise){
                case 1:
                    PanelManager.getPizzaPanel().Show();
                    PanelManager.ChangePanel(PanelManager.getDefaultPanel());
                    break;
                case 2:
                    PanelManager.ChangePanel(PanelManager.getDefaultPanel());
                    break;
                case 3:
                    break;
            }


        }else {
            System.out.println("Błędny pin");
            PanelManager.ChangePanel(PanelManager.getDefaultPanel());
        }


    }
}

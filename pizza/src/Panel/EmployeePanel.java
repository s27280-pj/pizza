package Panel;

import Interfaces.*;
import Managers.PanelManager;

import java.util.Scanner;

public class EmployeePanel implements IPanel {
    public void Show(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj PIN: ");

        if (scanner.nextInt() == 27280){
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodawanie nowej pizzy.");
            System.out.println("2. Powrót do menu");
            System.out.println("3. Zakończ działanie");


            switch (scanner.nextInt()){
                case 1:
                    PanelManager.getPizzaCreatorPanel().Show();
                    break;
                case 2:
                    PanelManager.getDefaultPanel().Show();
                    break;
                case 3:
                    break;
            }


        }else {
            System.out.println("Błędny pin");
            PanelManager.getDefaultPanel().Show();
        }


    }
}

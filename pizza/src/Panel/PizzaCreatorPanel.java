package Panel;

import Containers.PizzaContainer;
import Interfaces.IPanel;
import Managers.DataManager;
import Managers.PanelManager;
import Pizza.Pizza;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PizzaCreatorPanel implements IPanel {
    @Override
    public void Show() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj nazwę nowej pizzy:");
            String name = scanner.nextLine();

            System.out.println("Podaj składniki nowej pizzy (oddzielone przecinkami):");
            String ingredientsInput = scanner.nextLine();
            List<String> ingredients = Arrays.asList(ingredientsInput.split(","));

            System.out.println("Podaj poziom ostrości nowej pizzy (0-2):");
            int spiciness = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Podaj rozmiar nowej pizzy:");
            String size = scanner.nextLine();

            System.out.println("Podaj cenę nowej pizzy:");
            double price = scanner.nextDouble();

            int nextId = DataManager.getPizzaContainer().PizzasCount() + 1;

            Pizza newPizza = new Pizza(nextId, name, ingredients, spiciness, size, price);

            DataManager.getPizzaContainer().AddNewPizza(newPizza);
            DataManager.getPizzaContainer().ShowAllPizzas();

            PanelManager.getDefaultPanel().Show();

    }
}

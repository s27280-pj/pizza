package Managers;

import Interfaces.IPanel;
import Panel.DefaultPanel;
import Panel.EmployeePanel;
import Panel.PizzaCreatorPanel;

public class PanelManager {
    private static IPanel defaultPanel = new DefaultPanel();
    private static IPanel employeePanel = new EmployeePanel();
    private static IPanel pizzaCreatorPanel = new PizzaCreatorPanel();

    public static IPanel getDefaultPanel() {
        return defaultPanel;
    }

    public static IPanel getEmployeePanel() {
        return employeePanel;
    }

    public static IPanel getPizzaCreatorPanel() {
        return pizzaCreatorPanel;
    }
}

package Panel;

import Interfaces.IPanel;

public class PanelManager {
    private static DefaultPanel defaultPanel = new DefaultPanel();
    private static EmployeePanel employeePanel = new EmployeePanel();
    private static PizzaPanel pizzaPanel = new PizzaPanel();

    public static DefaultPanel getDefaultPanel() {
        return defaultPanel;
    }

    public static EmployeePanel getEmployeePanel() {
        return employeePanel;
    }

    public static PizzaPanel getPizzaPanel() { return pizzaPanel; }

    public static void ChangePanel(IPanel panel){
        panel.Show();
    }

}

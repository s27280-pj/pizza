import Panel.*;
import Order.DeliveryIOrder;
import Order.OnsiteIOrder;
import Panel.PizzaPanel;

public class Main {

    public static void main(String[] args) {
        DeliveryIOrder deliveryOrder = new DeliveryIOrder();
        OnsiteIOrder onsiteOrder = new OnsiteIOrder();
        EmployeePanel employeePanel = new EmployeePanel();
        PizzaPanel pizzaPanel = new PizzaPanel();

        DefaultPanel defaultPanel = new DefaultPanel();
        defaultPanel.Show();
    }
}

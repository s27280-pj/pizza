package Pizza;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> components;
    private int spicy;
    private String size;
    private double price;

    public Pizza(String name, List<String> components, int spicy, String size, double price) {
        this.name = name;
        this.components = components;
        this.spicy = spicy;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

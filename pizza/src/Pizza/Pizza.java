package Pizza;

import java.util.List;

public class Pizza {
    private int id;
    private String name;
    private List<String> components;
    private int spicy;
    private String size;
    private double price;

    public Pizza(int id, String name, List<String> components, int spicy, String size, double price) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "Nr:" + id +
                ", Nazwa: '" + name + '\'' +
                ", Składniki: " + components +
                ", Ostrość: " + spicy +
                ", rozmiar: " + size + '\'' +
                ", cena: " + price +
                '\n';
    }
}

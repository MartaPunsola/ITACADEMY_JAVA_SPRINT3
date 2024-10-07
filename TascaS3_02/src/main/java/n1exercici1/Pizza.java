package n1exercici1;

import n1exercici1.enums.*;

import java.util.ArrayList;

public class Pizza {

    private Size size;
    private DoughType doughType;
    private ArrayList<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<String>();
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public DoughType getDoughType() {
        return doughType;
    }

    public void setDoughType(DoughType doughType) {
        this.doughType = doughType;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(String topping) {
        this.toppings.add(topping);
    }

    private String showToppings() {
        String toppings = String.join(", ", this.toppings);
        return toppings;
    }

    @Override
    public String toString() {
        return "Size: " + this.size.getName() +
                ", DoughType: " + this.doughType.getName() +
                ", Toppings: " + this.showToppings() +
                '.';
    }
}

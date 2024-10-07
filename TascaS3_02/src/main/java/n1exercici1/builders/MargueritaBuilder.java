package n1exercici1.builders;

import n1exercici1.Pizza;
import n1exercici1.enums.DoughType;
import n1exercici1.enums.Size;

public class MargueritaBuilder implements PizzaBuilder {

   private Pizza pizza = new Pizza();

    @Override
    public void setPizzaSize(Size size) {
       this.pizza.setSize(size);
    }

    @Override
    public void setPizzaDough(DoughType doughType) {
        this.pizza.setDoughType(doughType);
    }

    @Override
    public void setPizzaToppings(String topping) {
        this.pizza.setToppings(topping);
    }

    public Pizza getResult() {
        return this.pizza;
    }
}

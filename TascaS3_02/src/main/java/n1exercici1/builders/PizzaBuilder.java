package n1exercici1.builders;

import n1exercici1.enums.*;

public interface PizzaBuilder {

    public void setPizzaSize(Size size);
    public void setPizzaDough(DoughType doughType);
    public void setPizzaToppings(String topping);

}

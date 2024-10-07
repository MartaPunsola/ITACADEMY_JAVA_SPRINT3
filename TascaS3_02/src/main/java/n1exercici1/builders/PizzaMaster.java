package n1exercici1.builders;

import n1exercici1.enums.DoughType;
import n1exercici1.enums.Size;

public class PizzaMaster {

    public void constructMarguerita(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaSize(Size.SMALL);
        pizzaBuilder.setPizzaDough(DoughType.WHITE);
        pizzaBuilder.setPizzaToppings("tomato");
        pizzaBuilder.setPizzaToppings("mozzarella");
    }

    public void constructCapricciosa(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaSize(Size.LARGE);
        pizzaBuilder.setPizzaDough(DoughType.GLUTENFREE);
        pizzaBuilder.setPizzaToppings("ham");
        pizzaBuilder.setPizzaToppings("mushrooms");
        pizzaBuilder.setPizzaToppings("olives");
        pizzaBuilder.setPizzaToppings("mozzarella");
    }

    public void constructVeggie(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaSize(Size.MEDIUM);
        pizzaBuilder.setPizzaDough(DoughType.WHOLEWEAT);
        pizzaBuilder.setPizzaToppings("eggplant");
        pizzaBuilder.setPizzaToppings("pepper");
        pizzaBuilder.setPizzaToppings("zucchini");
        pizzaBuilder.setPizzaToppings("mozzarella");
    }
}

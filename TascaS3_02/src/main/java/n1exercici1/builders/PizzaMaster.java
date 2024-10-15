package n1exercici1.builders;

import n1exercici1.enums.DoughType;
import n1exercici1.enums.Size;

public class PizzaMaster {

    public void constructMarguerita(MargueritaBuilder margueritaBuilder) {
        margueritaBuilder.setPizzaSize(Size.SMALL);
        margueritaBuilder.setPizzaDough(DoughType.WHITE);
        margueritaBuilder.setPizzaToppings("tomato");
        margueritaBuilder.setPizzaToppings("mozzarella");
    }

    public void constructCapricciosa(CapricciosaBuilder capricciosaBuilder) {
        capricciosaBuilder.setPizzaSize(Size.LARGE);
        capricciosaBuilder.setPizzaDough(DoughType.GLUTENFREE);
        capricciosaBuilder.setPizzaToppings("ham");
        capricciosaBuilder.setPizzaToppings("mushrooms");
        capricciosaBuilder.setPizzaToppings("olives");
        capricciosaBuilder.setPizzaToppings("mozzarella");
    }

    public void constructVeggie(VeggieBuilder veggieBuilder) {
        veggieBuilder.setPizzaSize(Size.MEDIUM);
        veggieBuilder.setPizzaDough(DoughType.WHOLEWEAT);
        veggieBuilder.setPizzaToppings("eggplant");
        veggieBuilder.setPizzaToppings("pepper");
        veggieBuilder.setPizzaToppings("zucchini");
        veggieBuilder.setPizzaToppings("mozzarella");
    }
}

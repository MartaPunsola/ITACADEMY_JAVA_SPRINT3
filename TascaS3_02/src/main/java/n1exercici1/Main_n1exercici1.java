package n1exercici1;

import n1exercici1.builders.CapricciosaBuilder;
import n1exercici1.builders.MargueritaBuilder;
import n1exercici1.builders.PizzaMaster;
import n1exercici1.builders.VeggieBuilder;

public class Main_n1exercici1 {
    public static void main(String[] args) {

        PizzaMaster pizzaMaster = new PizzaMaster();

        MargueritaBuilder margueritaBuilder = new MargueritaBuilder();
        pizzaMaster.constructMarguerita(margueritaBuilder);
        Pizza marguerita = margueritaBuilder.getResult();
        System.out.println("Pizza Marguerita: " + marguerita.toString());

        CapricciosaBuilder capricciosaBuilder = new CapricciosaBuilder();
        pizzaMaster.constructCapricciosa(capricciosaBuilder);
        Pizza capricciosa = capricciosaBuilder.getResult();
        System.out.println("Pizza Capricciosa: " + capricciosa.toString());

        VeggieBuilder veggieBuilder = new VeggieBuilder();
        pizzaMaster.constructVeggie(veggieBuilder);
        Pizza veggie = veggieBuilder.getResult();
        System.out.println("Pizza Veggie: " + veggie.toString());

    }
}

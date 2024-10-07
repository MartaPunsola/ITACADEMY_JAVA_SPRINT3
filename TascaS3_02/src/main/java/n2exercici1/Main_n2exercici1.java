package n2exercici1;

import n2exercici1.observers.StockAgencyA;
import n2exercici1.observers.StockAgencyB;
import n2exercici1.observers.StockAgencyC;

public class Main_n2exercici1 {
    public static void main(String[] args) {

        StockAgent stockAgent = new StockAgent();

        StockAgencyA stockAgencyA = new StockAgencyA(stockAgent);
        StockAgencyB stockAgencyB = new StockAgencyB(stockAgent);
        StockAgencyC stockAgencyC = new StockAgencyC(stockAgent);

        System.out.println("The stock has gone up.");
        stockAgent.setStock(1.25f);

        System.out.println("\nThe stock has gone down.");
        stockAgent.setStock(-0.5f);

        System.out.println("\nThe stock has gone up again, but now we only work with two agencies.");
        stockAgent.unsubscribe(stockAgencyC);
        stockAgent.setStock(0.6f);

    }
}

package n2exercici1.observers;

import n2exercici1.StockAgent;

public class StockAgencyB implements StockAgency {

    private float stock;

    public StockAgencyB(StockAgent stockAgent) {
        stockAgent.subscribe(this);
    }

    @Override
    public void update(float stock) {
        this.stock = stock;
        this.display();
    }

    private void display() {
        System.out.println("News from Agency B! We have been informed that the stock is currently at " + stock + "%.");
    }
}

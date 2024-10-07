package n2exercici1.observers;

import n2exercici1.StockAgent;

public class StockAgencyC implements StockAgency {

    private float stock;

    public StockAgencyC(StockAgent stockAgent) {
        stockAgent.subscribe(this);
    }

    @Override
    public void update(float stock) {
        this.stock = stock;
        this.display();
    }

    private void display() {
        System.out.println("News from Agency C! We have been informed that the stock is currently at " + stock + "%.");
    }
}

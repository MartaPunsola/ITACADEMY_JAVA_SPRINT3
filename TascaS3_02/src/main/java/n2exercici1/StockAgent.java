package n2exercici1;

import n2exercici1.observers.StockAgency;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private List<StockAgency> agencies = new ArrayList<StockAgency>();
    private float stock;

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
        this.notifyAgencies();
    }

    public void subscribe(StockAgency stockAgency) {
        this.agencies.add(stockAgency);
    }

    public void unsubscribe(StockAgency stockAgency) {
        this.agencies.remove(stockAgency);
    }

    public void notifyAgencies() {
        this.agencies.forEach(a -> a.update(this.stock));
    }
}

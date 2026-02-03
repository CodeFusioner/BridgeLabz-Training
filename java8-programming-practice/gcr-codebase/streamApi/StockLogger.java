package streamApi;

import java.util.List;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(120.5, 121.0, 119.8, 122.3);

        stockPrices.forEach(price ->
                System.out.println("Stock price update: " + price)
        );
    }
}

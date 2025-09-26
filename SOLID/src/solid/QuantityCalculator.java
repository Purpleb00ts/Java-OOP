package solid;

import solid.products.Drink;
import solid.products.Food;
import solid.products.Product;

import java.util.List;

public class QuantityCalculator implements Calculator {
    public QuantityCalculator() {
    }

    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::amountOfKilograms).sum();
    }

    public double average(List<Product> products) {
        return sum(products) / products.size();
    }
}

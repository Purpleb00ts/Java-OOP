package solid;

import solid.products.Product;
import java.util.List;

public class CalorieCalculator implements Calculator{
    public CalorieCalculator() {
    }

    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::amountOfCalories).sum();
    }

    public double average(List<Product> products) {
        return sum(products) / products.size();
    }
}

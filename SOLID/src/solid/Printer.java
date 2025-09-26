package solid;

import solid.products.Product;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    public void printSum(List<Product> products, Calculator calculator) {
        System.out.printf((SUM) + "%n", calculator.sum(products));
    }

    public void printAverage(List<Product> products, Calculator calculator) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }
}

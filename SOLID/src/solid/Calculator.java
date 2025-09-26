package solid;

import solid.products.Product;

import java.util.List;

public interface Calculator {
    double sum(List<Product> productList);
    double average(List<Product> productList);
}

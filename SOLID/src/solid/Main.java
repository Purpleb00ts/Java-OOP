package solid;

import solid.products.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product chips = new Chips(250);
        Product chocolate = new Chocolate(500);
        Product coke = new Coke(1000);
        Product lemonade = new Lemonade(2000);

        List<Product> productList = new ArrayList<>();

        productList.add(chips);
        productList.add(chocolate);
        productList.add(coke);
        productList.add(lemonade);

    }
}

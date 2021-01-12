package com.demo.composition.example1;

import java.util.ArrayList;
import java.util.List;

//Order can exists without products (theoretically)
//Product cannot without the order (in shopping cart context)
//If you remove 3 out of 5 products from the order, order still exists.
//if you delete order - it is gone, you can not order products.
public class OrderMain {

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        Order order = new Order(productList);

        System.out.println(order);
        System.out.println("remove one product - order still exists");
        order.getProducts().remove(product1);
        System.out.println(order);
        System.out.println("remove order - nothing left.");
        order = null;
        System.out.println(order);
    }
}

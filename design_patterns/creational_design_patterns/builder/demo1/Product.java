package design_patterns.creational_design_patterns.builder.demo1;

import java.util.LinkedList;
import java.util.List;

class Product {
    private List<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n Product completed as below");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}

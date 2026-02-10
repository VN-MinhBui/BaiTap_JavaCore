package asm3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("E01", "IPhoneXSMax", 18.000000, 24));
        products.add(new FoodProduct("F01", "Chả Mực", 480.000, 14));
        products.add(new ClotingProduct("C01", "Sơ mi lụa", 240.000, "M"));

        for (Product p : products){
            System.out.println(p.getInfo());
            System.out.println("Giá sau khi discount: " + p.calculateDiscountedPrice());
        }
    }
}

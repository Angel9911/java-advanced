package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String,Double>> shopProducts = new TreeMap<>();

        String readConsole = scanner.nextLine().replace(","," ");

        while (!readConsole.equals("Revision")){

            String[] parts = readConsole.split("\\s+");

            String shop = parts[0];
            String product = parts[1];
            String price = parts[2];

            LinkedHashMap<String, Double> products;
            if(shopProducts.containsKey(shop)){

                products = shopProducts.get(shop);

            } else{

                products = new LinkedHashMap<>();

            }
            products.put(product,Double.valueOf(price));
            shopProducts.put(shop,products);
            readConsole = scanner.nextLine().replace(","," ");
        }

        shopProducts.forEach((shop,products) ->{

            System.out.println(shop+"->");

            products.forEach((product,price)->{
                System.out.printf("Product: %s, Price: %.1f", product,price);
                System.out.println();
            });
        });
    }
}

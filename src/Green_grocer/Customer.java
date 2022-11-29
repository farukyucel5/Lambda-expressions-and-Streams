package Green_grocer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Customer {
    public static List<Product> product_mapping() {
        List<Product> products_list=new ArrayList<>();
        products_list.add(new Product("potatoes",10));
        products_list.add(new Product("tomato",12));
        products_list.add(new Product("onion",13));
        products_list.add(new Product("dragon fruit",30));
        return products_list;

    }
    public static void main(String[] args) {
        product_mapping();
        boolean value=true;
        double total=0;


        while (value)
        {
            System.out.println("What would you like to purchase: ");
            Scanner scan=new Scanner(System.in);
            String selection=scan.nextLine();
            System.out.println("How many kilos of "+selection+" would you like to buy");
            double kilo=scan.nextDouble();

            double sum=the_total_cost(selection,kilo);

            System.out.println("Would you like to take something else? yes or no");
            String respond=scan.next();

            if (respond.equals("no")) {
                total+=sum;
                value=false;
            }
            else if (respond.equals("yes"))
                total+=sum;

            else
                System.out.println("Excuse me!");

        }

        System.out.println("Total price: "+total);




    }

    private static double the_total_cost(String selection, double kilo) {

        List<Product>products_list=product_mapping();
        double sum=0;

        switch (selection)
        {
            case "potatoes":
                sum+=kilo*products_list.get(0).getPrice();
                break;


            case "tomato":
                sum+=kilo*products_list.get(1).getPrice();
                break;

            case "onion":
                sum+=kilo*products_list.get(2).getPrice();
                break;

            case "dragon fruit":
                sum+=kilo*products_list.get(3).getPrice();
                break;
            default:
                System.out.println("Sorry!");
        }


        return sum;
    }
}

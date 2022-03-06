package Week4;

import com.bethecoder.ascii_table.ASCIITable;

import java.util.Scanner;

public class CoffeeShopApp {

    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        NewYork n1 = new NewYork();
        Dehli n2 = new Dehli();
        Berlin n3 = new Berlin();

        String [] cityHead = { "City", "City code"};
        String[][] cityData = {{ "Berlin", "1"}, { "Delhi", "2"}, { "New York", "3"}};
        ASCIITable.getInstance().printTable(cityHead, cityData);
        System.out.print("What type of coffee would you like to order?: ");
        int i = order.nextInt();

        if (i == 1) {
            n1.getCoffee(n1.coffeeData);
            System.out.print("Choose your Coffee: ");
            i = order.nextInt();
            n1.coffeeWait();
            n1.makeCoffee("New York", "Coffee" );

        }
        if (i == 2) {
            n2.getCoffee(n1.coffeeData);
            System.out.print("Choose your Coffee: ");
            i = order.nextInt();
            n2.coffeeWait();
            n2.makeCoffee("Dehli", "Coffee" );
        }
        if (i == 3) {
            n3.getCoffee(n1.coffeeData);
            System.out.print("Choose your Coffee: ");
            i = order.nextInt();
            n3.coffeeWait();
            n3.makeCoffee("Berlin", "Coffee" );
        }
    }
}

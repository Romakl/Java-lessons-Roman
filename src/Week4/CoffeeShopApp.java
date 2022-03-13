package Week4;

import com.bethecoder.ascii_table.ASCIITable;

import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        NewYork ny = null;
        Dehli deh = null;
        Berlin ber = null;
        while (true){
            String[] cityHead = {"City", "City code"};
            String[][] cityData = {{"New York", "1"}, {"Delhi", "2"}, {"Berlin", "3"}};
            ASCIITable.getInstance().printTable(cityHead, cityData);
            System.out.print("What type of coffee would you like to order?: ");
            int city = order.nextInt();
            if (city == 1) {
                if (ny == null) {
                    ny = new NewYork();
                    ny.prepare();
                }
                ny.getCoffee();
                System.out.print("Choose your Coffee: ");
                int i = order.nextInt();
                if (i > ny.coffeeData.length){
                    ny.coffeeTotal();
                    continue;
                }
                ny.coffeeWait();
                if (ny instanceof Biscuits) {
                    System.out.print("Biscuits?(1 - yes, 2 - no): ");
                    int bis = order.nextInt();
                    if (bis == 1) {
                        ny.sellBiscuits();
                    }
                    ny.makeCoffee(i);
                }
            }
            else if (city == 2) {
                if (deh == null) {
                    deh = new Dehli();
                    deh.prepare();
                }
                deh.getCoffee();
                System.out.print("Choose your Coffee: ");
                int i = order.nextInt();
                if (i > deh.coffeeData.length){
                    deh.coffeeTotal();
                    continue;
                }
                deh.coffeeWait();
                if (deh instanceof Biscuits) {
                    System.out.print("Biscuits?(1 - yes, 2 - no): ");
                    int bis = order.nextInt();
                    if (bis == 1) {
                        deh.sellBiscuits();
                    }
                    deh.makeCoffee(i);
                }
            }
            else if (city == 3) {
                if (ber == null) {
                    ber = new Berlin();
                    ber.prepare();
                }
                ber.getCoffee();
                System.out.print("Choose your Coffee: ");
                int i = order.nextInt();
                if (i > ber.coffeeData.length){
                    ber.coffeeTotal();
                    continue;
                }
                ber.coffeeWait();
                ber.makeCoffee(i);
                }
            System.out.println("Do you want to continue?(1-yes 2-no)");
            int i = order.nextInt();
            if (i == 2)
                System.exit(1);
        }
    }
}

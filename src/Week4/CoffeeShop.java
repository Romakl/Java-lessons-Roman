package Week4;


import com.bethecoder.ascii_table.ASCIITable;

import java.util.Arrays;


abstract public class CoffeeShop {
    protected String city;
    protected int [] statistics;
    String [][] coffeeData;
    String [] coffeeHead = {"Coffee code", "Coffee", "Coffee price"};

    void getCoffee () {
        ASCIITable.getInstance().printTable(coffeeHead, coffeeData);
    }

    void coffeeWait () {
        for (int i =6; i>0; i--){
            System.out.println("Please, wait " + i*10 + " seconds...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    void makeCoffee(int i) {
        System.out.println ("Thanks for order in " + city + "! Take your " + coffeeData[i-1][1] + ". Bye!");
        statistics[Integer.parseInt(coffeeData[i-1][0])-1] += 1;
    }
    void prepare (String[][] coffeeData, String city) {
        this.coffeeData = coffeeData;
        this.city = city;
        this.statistics = new int [coffeeData.length];
    }
    void coffeeTotal () {
        int coffee = 0;
        float money = 0;
        System.out.println ("Statistics of " + city + " Coffee Shop: " + Arrays.toString(statistics));
        for (int i = 0; i < coffeeData.length; i++) {
            money += Float.parseFloat(coffeeData[i][2]) * statistics[i];
            coffee += statistics[i];
            System.out.println(coffeeData[i][1]+ " sold: " + statistics[i] + ", your earnings: " + (Float.parseFloat(coffeeData[i][2]) * statistics[i]));
        }
        System.out.println("Today you have sold: " + coffee + " coffee and you have earned: " + money);
    }

}

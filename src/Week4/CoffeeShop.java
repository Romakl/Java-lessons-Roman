package Week4;


import com.bethecoder.ascii_table.ASCIITable;

abstract public class CoffeeShop {


    String [] coffeeHead = { "Coffee", "Coffee code"};

    void getCoffee (String[][] coffeeData) {
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
    void makeCoffee (String city, String type) {
        System.out.println ("Thanks for order in " + city + "! Take your " + type + ". Bye!");
    }

}

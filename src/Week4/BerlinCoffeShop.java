package Week4;

public class BerlinCoffeShop {
    public void makeCoffee (String coffee) {
        for (int i =6; i>0; i--){
            System.out.println("Please, wait " + i*10 + " seconds...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Thanks for order in Berlin take your "+coffee+". Bye!");
    }
}

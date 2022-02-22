package Week4;

import com.bethecoder.ascii_table.ASCIITable;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        //Использовал библиотеку, что бы было немного красивее)
        String [] tableHead = { "City", "Coffee name"};
        String[][] tableData = {
                { "Berlin", "Latte"},
                { "Kiev", "Cappuccino"},
                { "New York", "Americano"},
                { "Delhi", "Espresso"},
                { "", "Doppio"}, //This type of coffee really exists, lol
        };
        ASCIITable.getInstance().printTable(tableHead, tableData);
        Scanner order = new Scanner(System.in);
        String city, coffee;
        System.out.print("Where do you want to order coffee?: ");
        city = order.nextLine();
        System.out.print("What type of coffee would you like to order?: ");
        coffee = order.nextLine();
        if (city.equals("Delhi")){
            DehliCoffeShop c = new DehliCoffeShop();
            c.makeCoffee(coffee);
        }
        else if (city.equals("Berlin")){
            BerlinCoffeShop c = new BerlinCoffeShop();
            c.makeCoffee(coffee);

        }
        else if (city.equals("New York")){
            NewYorkCoffeShop c = new NewYorkCoffeShop();
            c.makeCoffee(coffee);
        }
        else {
            System.out.println("We cant understand you, contact to us later");
        }

    }
}

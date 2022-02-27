package Week4;

import com.bethecoder.ascii_table.ASCIITable;

import java.util.Scanner;

//Так как мы делаем полноценную программу, то лучше назвать этот класс как-то осознанно, типа CoffeeShopApp
public class Lesson4 {
    public static void main(String[] args) {
//Использовал библиотеку, что бы было немного красивее) 
//Кстати, увидел классную фишку, если нажать на . в Github, то можно сразу открыть красивый браузерный кодовый редактор Vscode)
/*
+----------+-------------+
|   City   | Coffee name |
+----------+-------------+
|   Berlin |       Latte |
|    Delhi |  Cappuccino |
| New York |   Americano |
|          |    Espresso |
|          |      Doppio |
+----------+-------------+
*/
        String [] tableHead = { "City", "Coffee name"};
        String[][] tableData = {
                { "Berlin", "Latte"},
                { "Delhi", "Cappuccino"},
                { "New York", "Americano"},
                { "", "Espresso"},
                { "", "Doppio"}, //This type of coffee really exists, lol
        };
        ASCIITable.getInstance().printTable(tableHead, tableData);
        Scanner order = new Scanner(System.in);
        String city, coffee;
        System.out.print("Where do you want to order coffee?: ");
        city = order.nextLine();
        System.out.print("What type of coffee would you like to order?: ");
        coffee = order.nextLine();
        //тут лучше закрыть сканнер, так как дальше он не используется
        //если вариантов 5 или меньше лучше использовать if-else
        //ты не проверяешь какой кофе ввел пользователь. Если он введет некорректные данные то программа все равно будет работать
        switch (city) {
            case "Delhi" -> {
                DehliCoffeShop c = new DehliCoffeShop();
                c.makeCoffee(coffee);
                break;
            }
            case "Berlin" -> {
                BerlinCoffeShop c = new BerlinCoffeShop();
                c.makeCoffee(coffee);

                break;
            }
            case "New York" -> {
                NewYorkCoffeShop c = new NewYorkCoffeShop();
                c.makeCoffee(coffee);
                break;
            }
            default -> System.out.println("We cant understand you, contact to us later");
        }

    }
}

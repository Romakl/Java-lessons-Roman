package Week4;

public class Berlin extends CoffeeShop{
    String[][] coffeeData = {{"1", "Americano", "4.75"}, {"2" ,"Latte", "3.5"}, {"3", "Espresso", "1.05"}};
    public void prepare () {
        prepare(coffeeData, "Delhi");
    }
}

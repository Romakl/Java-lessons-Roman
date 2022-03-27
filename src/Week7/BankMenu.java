package Week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMenu {
    public void showStartMenu(){
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        //тут не хватает пункта меню для выхода, у тебя он вроде под номером 3
        System.out.print("Choose method:\n1 - Login\n2 - Register");
        String choice = "";
        try {
            choice = rd.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // не хватает какого-то вывода информации юзеру если он ввел некорректный пункт меню, можно просто через else
        if (choice.equals("1")) {
            showLogin();
        }
        else if (choice.equals("2")) {
            showRegister();
        }
        else if (choice.equals("3")) {
            System.out.println("See you later, good bye:)");
            System.exit(0);
        }
    }
    private void showLogin() {}
    private void showRegister() {}
    public void showBankMenu() {}
}

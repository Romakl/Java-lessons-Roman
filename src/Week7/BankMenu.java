package Week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class BankMenu {
    private Bank bank;
    public void showStartMenu(){
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Choose method:\n1 - Login\n2 - Register\n3 - Exit");
        String choice = "";
        try {
            choice = rd.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        else  {
            System.out.println("I cant understand you:)");
            System.exit(0);
        }
    }
    private void showLogin() {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String email = "";
        String password = "";
        boolean valid = false;
        try {
            System.out.println("What is your email");
            email = rd.readLine();
            System.out.println("What is your password");
            password = rd.readLine();
        } catch (IOException e) {
            //пользователь не знает что такое "IOException", нужно написать что-то внятное
            System.out.println("IOException");
        }

        valid = bank.doLogin(email, password);
        
        //немного излишний синтаксис. можно просто if (valid)
        if (valid == true) {
            System.out.print("Good");
        } else {
            System.out.println("Your entered invalid values:)");
        }
    }
    
    //тут не доделал
    private void showRegister() {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        String firstName = "";
        String lastName = "";
        String email = "";
        String password = "";
        Boolean gender = Boolean.valueOf("");
        String birthday = "";
        User user = new User();
        bank.doRegister(user);
    }
    public void showBankMenu() {}
}

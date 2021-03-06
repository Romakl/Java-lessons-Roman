package Week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BankMenu {
    private Bank bank;
    private User user;

    public BankMenu(Bank bank) {
        this.bank = bank;
        bank.start();
    }

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
            System.out.println("Неправильный ввод");
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
        try {
            String firstName = rd.readLine();
            String lastName = rd.readLine();
            String email = rd.readLine();
            String password = rd.readLine();
            boolean gender = Boolean.parseBoolean(rd.readLine());
            Date birthday = stringToDate(rd.readLine());
            User user = new User(firstName, lastName, birthday, gender, email, password);
        } catch (IOException e) {
            //пользователь не знает что такое "IOException", нужно написать что-то внятное
            System.out.println("Неправильный ввод");
        }

        bank.doRegister(user);
    }
    public void showBankMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelect one:\n1 Info\n2Loan\n3 Debit card");
        int choose = sc.nextInt();
        if (choose == 0){
            System.exit(0);
        }
        if (choose == 1){
            showBankMenu();
        }
        if (choose == 2){
            AddLoan();
            showBankMenu();
        }
        if (choose == 3){
            AddDebitCard();
            showBankMenu();
        }
        else {
            System.out.println("I didn't understood:(");
        }
    }

    private void AddDebitCard() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balance");
        Double balance = sc.nextDouble();

        //здесь уже можно не ситать номер карты и CVV из консоли, у нас есть для этого новые методы, нужно их вызывать
        System.out.print("Card nuber");
        String cardNumber = sc.nextLine();

        System.out.print("End date");
        String endDate = sc.nextLine();

        System.out.print("CVV");
        int cvv = sc.nextInt();

        sc.close();
        DebitCard debitCard = new DebitCard(balance, cardNumber, endDate, cvv);
    }
    public void AddLoan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Date of loan");
        String date = sc.nextLine();

        System.out.print("Loan Amount");
        Double sum = sc.nextDouble();

        System.out.print("Loan Amount");
        double interestRate = sc.nextDouble();

        System.out.print("Term of loan");
        int month = sc.nextInt();

        int monthly = (int) ((sum + (sum * interestRate * month)) / month);
        Loan loan = new Loan(date, sum, interestRate, month, monthly);
        sc.close();
        bank.addLoan(loan, user);
    }
    private Date stringToDate(String date) {
        try {
            return new SimpleDateFormat("d-M-yyyy").parse(date);
        } catch (ParseException e) {
            System.out.println("IDK");
            return stringToDate(date);
        }
    }
    public void generateCardNumber(){
        Random rand = new Random();
        String yourValue = String.format((Locale)null,
                "52%02d-%04d-%04d-%04d",
                rand.nextInt(100),
                rand.nextInt(10000),
                rand.nextInt(10000),
                rand.nextInt(10000));
    }
    public void generateCVV(){
        Random random = new Random();
        int x = random.nextInt(900) + 100;
    }
}

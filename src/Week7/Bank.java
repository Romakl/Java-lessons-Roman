package Week7;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<User> users;
    private User user;
    private final String user_data= "src/Week7/users/db.data";

    public void start() {
        deserializeUsers();
        User admin = new User("admin", "admin",
                new Date(), true,
                "admin@admin", "admin");

        users.add(admin);
        serializeUsers(users);
    }

    private void serializeUsers(List<User> users) {
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(user_data))) {
            os.writeObject(users);
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    //тут все отлично, только пользователь не поймет если ему в консоль высыпет весь стектрейс в последнем catch блоке
    private List<User> deserializeUsers() {
        List<User> userList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(user_data);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            userList = (List<User>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return userList;

    }

    //тут все верно, но немного лишнего кода
    public boolean doLogin(String email, String password) {
        Scanner sc = new Scanner(System.in);
        for (User users : users) {
            System.out.print("Your Password: ");
            if (users.getEmail().equals(email)) {
                String pd = sc.nextLine();
                if (users.getPassword().equals(pd)) {
                    user = users;
                    return true;
                } else {
                    System.out.println("Wrong password or user not exists");
                    return false;
                }
            }
        }
        System.out.println("User not exists");
        return false;
    }
    public void addLoan(Loan loan) {
        user.makeLoan(loan);
        serializeUsers(users);
    }

    public void addDebitCard(DebitCard debitCard) {
        user.makeCard(debitCard);
        serializeUsers(users);
    }
    public void doRegister(User user) {
        users.add(user);
        serializeUsers(users);
    }

    public void addLoan(Loan loan, User user) {
        users.add(user);
        serializeUsers(users);
    }
}

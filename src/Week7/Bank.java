package Week7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String db = "user.db";

    private List<User> users;
    private User user;
    public void start () {
    }

    private void serializeUsers(List<User> users) {
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(db))) {
            os.writeObject(users);
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    private void deserializeUsers() {
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(db))) {
            this.users = (ArrayList<User>) os.readObject();
        } catch (FileNotFoundException e) {
            this.users = new ArrayList<User>();
            serializeUsers(users);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public boolean doLogin(String email, String password) {
        boolean valid = false;
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                valid = true;
                this.user = user;
                break;
            }
        }
        return valid;
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

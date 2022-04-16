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

    //тут все отлично, только пользователь не поймет если ему в консоль высыпет весь стектрейс в последнем catch блоке
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

    //тут все верно, но немного лишнего кода
    public boolean doLogin(String email, String password) {
        //эта переменная не нужна
        boolean valid = false;
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                //тут можно сначала сделать this.user = user; а потом просто return true, тогда break не нужен будет
                valid = true;
                this.user = user;
                break;
            }
        }
        //а здесь просто return false;
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

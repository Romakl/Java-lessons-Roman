package Week7;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    @Serial
    private String firstName;
    private String lastName;
    private Date birthday;
    private boolean gender;
    private String email;
    private String password;
    private List<Loan> loan = new ArrayList<>();
    private List<DebitCard> card = new ArrayList<>();
    public User(String firstName, String lastName, Date birthday, boolean gender, String email, String password) {
        this.lastName = lastName;
        this.lastName = lastName;
        this.birthday = birthDate;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
    public String getFirst () {
        return firstName;
    }
    public void setFirst (String first_name) {
        this.firstName = first_name;
    }

    public String getLast () {
        return lastName;
    }
    public void setLast (String last_name) {
        this.lastName = last_name;
    }

    public Date getBirthday () {
        return birthday;
    }
    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    public boolean getGender () {
        return gender;
    }
    public void setGender (boolean gender) {
        this.gender = gender;
    }

    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }

    public List<Loan> getLoanList () {
        return loan;
    }
    public void setLoanList (List<Loan> loan) {
        this.loan = loan;
    }

    public List<DebitCard> getDbtCardList () {
        return card;
    }
    public void setDbtCardList (List<DebitCard> card) {
        this.card = card;
    }
    @Override
    public String toString() {
        return "_____________________________________________\n" +
                "New User is: " +
                "\nFirst Name: " + firstName +
                "\nLast name: " + lastName +
                "\nBirthday: " + birthday +
                "\nGender: " + gender +
                "\nEmail: " + email +
                "\nPassword: " + password +
                "\nLoan: " + loan +
                "\nCard: " + card +
                "\n---------------------------------------------\n";
    }
}

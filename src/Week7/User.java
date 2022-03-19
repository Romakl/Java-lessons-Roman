package Week7;

import java.util.Date;
import java.util.List;

public class User {

    private String first_name;
    private String last_name;
    private Date birthday;
    private boolean gender;
    private String email;
    private String password;
    private List<Loan> loan;
    private List<DebitCard> card;

    @Override
    public String toString() {
        return ("Name: " + first_name + "\nSurname: " + last_name + "\nBirth Date: " + birthday + "\nGender: " + gender +  "\nE-mail: " + email + "\nPassword: " + password + "Loans: " + loan + "\nDebit Card: " + card);
    }

    public String getFirst () {
        return first_name;
    }
    public void setFirst (String first_name) {
        this.first_name = first_name;
    }

    public String getLast () {
        return last_name;
    }
    public void setLast (String last_name) {
        this.last_name = last_name;
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

}
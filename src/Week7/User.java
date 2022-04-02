package Week7;

import java.util.Date;
import java.util.List;

public class User {

    //если имя переменной состоит из 2 слов то принято писать их camelCase'ом
    // в остальном все супер
    private String firstName;
    private String lastName;
    private Date birthday;
    private boolean gender;
    private String email;
    private String password;
    private List<Loan> loan;
    private List<DebitCard> card;


    @Override
    public String toString() {
        return ("Name: " + firstName + "\nSurname: " + lastName + "\nBirth Date: " + birthday + "\nGender: " + gender +  "\nE-mail: " + email + "\nPassword: " + password + "Loans: " + loan + "\nDebit Card: " + card);
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

}

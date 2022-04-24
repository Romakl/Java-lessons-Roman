package Week7;
import java.util.Date;

public class Loan {
    //имена переменных - с маленькой буквы
    private Date registrationDate;
    private double amount;
    private double interestRate;
    private int takeMonths;
    private double monthlyPayment;
    public Loan(Date registrationDate, double amount, double interestRate, int takeMonths, double monthlyPayment) {
        this.registrationDate = registrationDate;
        this.amount = amount;
        this.interestRate = interestRate;
        this.takeMonths = takeMonths;
        this.monthlyPayment = monthlyPayment;
    }

    public Date getDate () {
        return Date;
    }
    public void setDate (Date Date) {
        this.Date = Date;
    }

    public double getSum () {
        return sum;
    }
    public void setSum (double sum) {
        this.sum = sum;
    }

    public double getRate () {
        return percent;
    }
    public void setRate (double percent) {
        this.percent = percent;
    }

    public int getTerm () {
        return term;
    }
    public void setTerm (int term) {
        this.term = term;
    }

    public double getPayment () {
        return payment;
    }
    public void setPayment (double payment) {
        this.payment = payment;
    }

    public String toString() {
        return "_____________________________________________"  +
                "\nRegistration date: " + registrationDate +
                "\nLoan amount: " + amount +
                "\nInterest rate: " + interestRate +
                "\nCredit taken for months: " + takeMonths +
                "\nEvery month payment: " + monthlyPayment +
                "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";

}

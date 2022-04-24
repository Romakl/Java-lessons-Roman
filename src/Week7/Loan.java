package Week7;
import java.util.Date;
public class Loan {
    //имена переменных - с маленькой буквы
    private Date Date;
    private double sum;
    private double percent;
    private int term;
    private double payment;

    public Loan(String date, Double sum, double interestRate, int month, int monthly) {
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getRate() {
        return percent;
    }

    public void setRate(double percent) {
        this.percent = percent;
    }

    public String toString() {
        return "_____________________________________________" +
                "\nRegistration date: " + Date +
                "\nLoan amount: " + sum +
                "\nInterest rate: " + percent +
                "\nCredit taken for months: " + term +
                "\nEvery month payment: " + payment +
                "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";

    }
}
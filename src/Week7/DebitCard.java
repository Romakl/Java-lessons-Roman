package Week7;
import java.util.Date;

public class DebitCard {
    private double balance;
    private String card_number;
    private Date date;
    private int cvv;

    public DebitCard(Double balance, String cardNumber, String endDate, int cvv) {
    }
    public double getBalance () {
        return balance;
    }
    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getCardNumber () {
        return card_number;
    }
    public void setCardNumber (String card_number) {
        this.card_number = card_number;
    }

    public Date getDate () {
        return date;
    }
    public void setExpDate (Date date) {
        this.date = date;
    }

    public int getCvv () {
        return cvv;
    }
    public void setCvv (int cvv) {
        this.cvv = cvv;
    }
    public String toString() {
        return ("____________________________________________" +
                "Current Balance: " + balance +
                "\n Card Number: " + card_number +
                "\n End Date: " + date +
                "\n CVV: " + cvv +
                "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"
                }
        );
    }

}

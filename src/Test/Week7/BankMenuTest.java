package Week7;

import static org.junit.jupiter.api.Assertions.*;

class BankMenuTest {

    //логика тестов не реализована
    @org.junit.jupiter.api.Test
    void generateCardNumber() {
        String cardNumber = bankMenu.generateCardNumber();

        assertEquals(12, cardNumber.length());
    }

    @org.junit.jupiter.api.Test
    void generateCVV() {
        int CVV = bankMenu.generateCVV();
        boolean expected = CVV >= 111 && CVV <= 999;

        assertTrue(expected);
    }
}

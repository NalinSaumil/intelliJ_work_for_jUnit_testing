import java.math.BigDecimal;

public class ATM{
    boolean transferButton = false;
    long bankAccount = 0;
    double amount = 0.0;

    public boolean transferButtonPressed(boolean press) {
        transferButton = press;
        return transferButton;
    }

    public boolean validBankAcc(long bank) {
        bankAccount = bank;
        int len = countDigits(bankAccount);
        if(len >= 5 && len <= 17) {
            return true;
        }
        return false;
    }

    public boolean validAmtTransf(double amt){
        amount = amt;
        double decimalPart = extractDecimalPart(amount);
        if (decimalPart == 0 || decimalPart * 100 == Math.floor(decimalPart * 100)) {
            return true;
        }
        return false;
    }

    public boolean valid(boolean press, long bank, double amt) {
        if(transferButtonPressed(press) && validBankAcc(bank) && validAmtTransf(amt)) {
            return true;
        }
        return false;
    }

    public static int countDigits(long number) {
        String numberStr = Long.toString(number);
        int numDigits = numberStr.length();
        return numDigits;
    }

    public static double extractDecimalPart(double input) {
        BigDecimal inputBigDecimal = BigDecimal.valueOf(input);
        BigDecimal integerPart = inputBigDecimal.setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal decimalPart = inputBigDecimal.subtract(integerPart);
        return decimalPart.doubleValue();
    }
}
package bootcamp.labexercise.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrincipalCalculator {
    public static BigDecimal calculatePrincipal (BigDecimal amount, BigDecimal exchangeRate){
        BigDecimal principal;
        principal = amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_EVEN);
        return principal;
    }
}

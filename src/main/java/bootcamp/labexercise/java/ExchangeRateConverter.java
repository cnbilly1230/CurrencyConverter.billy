package bootcamp.labexercise.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class ExchangeRateConverter {
    public static BigDecimal convertExchangeRate (Currency inputCurrency, Currency targetCurrency, Map<Currency, BigDecimal> euroExchangeRate){
        BigDecimal exchangeRate;
        if(inputCurrency == targetCurrency){
            return new BigDecimal("1");
        }
        if(inputCurrency == Currency.EURO){
            exchangeRate = euroExchangeRate.get(inputCurrency);
        }
        if(targetCurrency == Currency.EURO){
            exchangeRate = new BigDecimal("1").divide(euroExchangeRate.get(inputCurrency),RoundingMode.HALF_EVEN);
        }

        exchangeRate = (euroExchangeRate.get(targetCurrency)).divide(euroExchangeRate.get(inputCurrency),6, RoundingMode.HALF_EVEN);
        return exchangeRate;
    }
}

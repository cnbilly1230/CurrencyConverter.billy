package bootcamp.labexercise.java;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

public class CurrencyConverterTest {
    @Test
    public void shouldGiveExpectedValue(){
        Map<Currency, BigDecimal> euroExchangeRate;
        Currency fromCurrency = Currency.valueOf("USD");
        Currency toCurrency = Currency.valueOf("HKD");
        BigDecimal amount =  new BigDecimal("10000");
        euroExchangeRate = ExchangeRateExtractor.parsXml("fx-rates.xml");
        BigDecimal calculatedExchangeRate;
        calculatedExchangeRate = ExchangeRateConverter.convertExchangeRate(fromCurrency,toCurrency,euroExchangeRate);
        BigDecimal principal;
        principal = PrincipalCalculator.calculatePrincipal(amount,calculatedExchangeRate);
        System.out.println(principal);
    }
}

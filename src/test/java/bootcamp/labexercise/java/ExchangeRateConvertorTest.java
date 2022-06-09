package bootcamp.labexercise.java;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExchangeRateConvertorTest {
    @Test
    public void shouldAnswerWithTrue() {
        Map<Currency, BigDecimal> testingMap = new HashMap<>(){{
            put(Currency.USD, new BigDecimal("1.0577"));
            put(Currency.JPY, new BigDecimal("135.34"));
            put(Currency.BGN, new BigDecimal("1.9558"));
            put(Currency.CZK, new BigDecimal("24.670"));
            put(Currency.DKK, new BigDecimal("7.4424"));
            put(Currency.GBP, new BigDecimal("0.84820"));
            put(Currency.HUF, new BigDecimal("382.93"));
            put(Currency.PLN, new BigDecimal("4.6365"));
            put(Currency.RON, new BigDecimal("4.9477"));
            put(Currency.SEK, new BigDecimal("10.4915"));
            put(Currency.CHF, new BigDecimal("1.0280"));
            put(Currency.ISK, new BigDecimal("138.50"));
            put(Currency.NOK, new BigDecimal("10.2620"));
            put(Currency.HRK, new BigDecimal("7.5335"));
            put(Currency.TRY, new BigDecimal("16.8201"));
            put(Currency.AUD, new BigDecimal("1.4980"));
            put(Currency.BRL, new BigDecimal("5.1989"));
            put(Currency.CAD, new BigDecimal("1.3526"));
            put(Currency.CNY, new BigDecimal("7.0638"));
            put(Currency.HKD, new BigDecimal("8.2999"));
            put(Currency.IDR, new BigDecimal("15501.99"));
            put(Currency.ILS, new BigDecimal("3.5330"));
            put(Currency.INR, new BigDecimal("82.1617"));
            put(Currency.KRW, new BigDecimal("1340.58"));
            put(Currency.MXN, new BigDecimal("21.0314"));
            put(Currency.MYR, new BigDecimal("4.6422"));
            put(Currency.NZD, new BigDecimal("1.6518"));
            put(Currency.PHP, new BigDecimal("55.181"));
            put(Currency.SGD, new BigDecimal("1.4588"));
            put(Currency.THB, new BigDecimal("36.284"));
            put(Currency.ZAR, new BigDecimal("16.7131"));
        }};
        System.out.println(ExchangeRateConverter.convertExchangeRate(Currency.USD,Currency.HKD,testingMap));

    }
}

package bootcamp.labexercise.java;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrincipalCalculatorTest {
    @Test
    public void shouldReturnExpectedValue(){
        BigDecimal calculatedPrinciple =PrincipalCalculator.calculatePrincipal(new BigDecimal("1000"),new BigDecimal("2.3"));
        assertEquals(new BigDecimal("2300.00"),calculatedPrinciple);
    }

}

package bootcamp.labexercise.java;

import org.apache.commons.cli.*;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class CurrencyConvertor {
    public static void main(String[] args) {

        Options options = new Options();

        Option inputAmount = new Option("a", "amount", true, "amount");
        inputAmount.setRequired(true);
        options.addOption(inputAmount);

        Option inputCurrency = new Option("f", "from", true, "from currency");
        inputCurrency.setRequired(true);
        options.addOption(inputCurrency);

        Option inputFilePath = new Option("i", "input", true, "input file path");
        inputFilePath.setRequired(true);
        options.addOption(inputFilePath);

        Option targetCurrency = new Option("t", "to", true, "to currency");
        targetCurrency.setRequired(true);
        options.addOption(targetCurrency);

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("Please enter all fields !", options);
            System.exit(1);
        }

        Map<Currency, BigDecimal> euroExchangeRate;
        String inputPath = cmd.getOptionValue("input");
        Currency fromCurrency = Currency.valueOf(cmd.getOptionValue("from"));
        Currency toCurrency = Currency.valueOf(cmd.getOptionValue("to"));
        BigDecimal amount =  new BigDecimal(cmd.getOptionValue("amount"));
        euroExchangeRate = ExchangeRateExtractor.parsXml(inputPath);
        BigDecimal calculatedExchangeRate;
        calculatedExchangeRate = ExchangeRateConverter.convertExchangeRate(fromCurrency,toCurrency,euroExchangeRate);
        BigDecimal principal;
        principal = PrincipalCalculator.calculatePrincipal(amount,calculatedExchangeRate);
        System.out.println(principal);

    }
}

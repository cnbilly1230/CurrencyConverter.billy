package bootcamp.labexercise.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeRateExtractor {


    public static Map<Currency, BigDecimal> parsXml(String inputPath) {
        Map<Currency, BigDecimal> euroExchangeRate = new HashMap<>();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputPath);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Cube");
            for (int value = 0; value < nList.getLength(); value++) {
                Node nNode = nList.item(value);
                if (nNode.getAttributes().getNamedItem("currency") != null) {
                    euroExchangeRate.put(Currency.valueOf(nNode.getAttributes().getNamedItem("currency").getNodeValue()),
                            new BigDecimal(nNode.getAttributes().getNamedItem("rate").getNodeValue()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return euroExchangeRate;
    }

}

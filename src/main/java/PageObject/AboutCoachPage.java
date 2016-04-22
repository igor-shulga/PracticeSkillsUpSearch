package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;
import java.util.Map;


public class AboutCoachPage {
    private WebDriver driver;

    public AboutCoachPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String Mapp(String x) {
        Map<String, String> Map = new HashMap<String, String>();
        Map.put("key", "1234");
        Map.put("Михаил Чокан", "michael-chokan");
        Map.put("Александр Галковский", "alexander-galkovskiy");

        String x1 = null;
        for (String key: Map.keySet()) {
            x1 = Map.get(x);
            return x1;
        }
        return x1;
    }

}
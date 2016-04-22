package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PageCoach {
    private WebDriver driver;
    private String basePage = "http://skillsup.ua"; // base url page
    private By aboutUs = By.xpath(".//*[@id='menu3039']/a");
    private By ourTeam = By.xpath(".//*[@id='menu3039']/ul/li[1]/a");
    private By skillsUpTeam = new By.ByClassName("name");// or "member" if data with position needed

    public PageCoach(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openCoachPage() {
        driver.navigate().to(basePage);
        WebElement hoverElement = driver.findElement(aboutUs);
        WebElement clickElement = driver.findElement(ourTeam);
        Actions openTeamPage = new Actions(driver);
        openTeamPage.moveToElement(hoverElement).perform();
        openTeamPage.moveToElement(clickElement).click().perform();
    }


    public List<String> getCoachList() {
        List coachCards = new ArrayList();
        List<WebElement> element = driver.findElements(skillsUpTeam);
        for (WebElement i : element) {
            coachCards.add(i.getText());
        }
        return coachCards;
    }
    public String openPersonalCoachPage(String S){
        String qwe = "a[href*="+S+"]";
        driver.findElement(By.cssSelector(qwe)).click();
        return null;
    }



}


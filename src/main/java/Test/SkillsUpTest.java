package Test;

import org.junit.Test;
import PageObject.PageCoach;


public class SkillsUpTest extends BaseTest {
    PageCoach pageCoach;

    @Test
    public void testLookingForArtem() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertFalse("Why is Artem here?!", pageCoach.getCoachList().contains("Артем Карпов"));
    }

    @Test
    public void testLookingForMisha() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertTrue("Misha not found ", pageCoach.getCoachList().contains("Михаил Чокан"));
    }

    @Test
    public void testLookingForAlexander() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertTrue("Alexander Galkovski not found ", pageCoach.getCoachList().contains("Александр Галковский"));
    }


}

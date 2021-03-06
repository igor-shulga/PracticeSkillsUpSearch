package Test;

import PageObject.AboutCoachPage;
import org.junit.Test;
import PageObject.PageCoach;


public class SkillsUpTest extends BaseTest {
    PageCoach pageCoach;
    AboutCoachPage aboutCoachPage;

    @Test
    public void testLookingForArtem() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertFalse("Why is Artem here?!", pageCoach.getCoachList().contains("Артем Карпов"));
     //   boolean coachIsFound =false;
      //  if(coachIsFound==true){
      //      pageCoach.openPersonalCoachPage("artem-karpov");
        //}
    }

    @Test
    public void testLookingForMisha() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertTrue("Misha not found ", pageCoach.getCoachList().contains("Михаил Чокан"));
        pageCoach.openPersonalCoachPage("michael-chokan");
        aboutCoachPage = new AboutCoachPage(driver);
       // String s = AboutCoachPage.credentials("Михаил Чокан");
      //  System.out.println(s);
        String xx = aboutCoachPage.Mapp("Михаил Чокан");
        System.out.println(xx);


        //  boolean coachIsFound =true;
       // if(coachIsFound==true){
          //  pageCoach.openPersonalCoachPage("michael-chokan");
       // }
    }

    @Test
    public void testLookingForAlexander() {
        pageCoach = new PageCoach(driver);
        pageCoach.openCoachPage();
        assertTrue("Alexander Galkovski not found ", pageCoach.getCoachList().contains("Александр Галковский"));
     //   boolean coachIsFound =true;
        //if(coachIsFound==true){
       //     pageCoach.openPersonalCoachPage("alexander-galkovskiy");
       // }
    }

}

package script;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillaryDemoLoginPage;
import pomPages.SkillaryLoginPage;

public class Testcase extends BaseClass {
	@Test
	public void tc1()
	{
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbtn();
		s.skillarydemo();
		
		utilites.switchingtabs(driver);
		
		SkillaryDemoLoginPage s1 = new SkillaryDemoLoginPage(driver);
		utilites.mouseHover(driver,s1.getCoursetab());
		s1.seleniumtraining();
		
		AddtoCartPage ac = new AddtoCartPage(driver);
		utilites.doubleclick(driver,ac.getAddbtn());
		ac.addtocart();
		utilites.alertPopup(driver);
		System.out.println("Modified");
	}
	

}

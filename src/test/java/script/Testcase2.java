package script;


import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillaryDemoLoginPage;
import pomPages.SkillaryLoginPage;
import pomPages.Testing;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException
	{
		SkillaryLoginPage s =new SkillaryLoginPage(driver);
		s.gearsbtn();
		s.skillarydemo();
		
		
		
		SkillaryDemoLoginPage sd = new SkillaryDemoLoginPage(driver);
		utilites.switchingtabs(driver);
		utilites.dropdown(sd.getCoursetab(),pdata.getPropertydata("courseadd"));
		
		Testing tp = new Testing(driver);
		utilites.dragdrop(driver,tp.getSeleniumtraining() , tp.getCartdragdrop());
		Point loc = tp.getFacebook().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		utilites.scrollBar(driver, x, y);
		tp.facebook();
		
	}
	

}

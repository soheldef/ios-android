package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import Pages.contactsearchpage;

public class searchname_test2 extends BaseClass{

	contactsearchpage contactsearchpage;

	@Test(priority = 1,enabled=true)
	public void SearchSara2() throws InterruptedException  {
		Thread.sleep(2000);
		contactsearchpage = new contactsearchpage(driver);
		contactsearchpage.search("sara");
		String name = contactsearchpage.validsearchresult();
		Assert.assertEquals(name, "Sara Alston");
	}
	
	@Test(priority = 2,enabled=true)
	public void SearchTamim2() throws InterruptedException  {
		//Thread.sleep(2000);
		contactsearchpage = new contactsearchpage(driver);
		contactsearchpage.search("tamim");	
		String asd = contactsearchpage.invalidsearchresult();
		Assert.assertEquals(asd, "No contacts found with tamim in the name");
	}
	
}

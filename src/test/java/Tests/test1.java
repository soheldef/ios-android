package Tests;

import org.testng.annotations.Test;
import Pages.calculator1;

public class test1 extends BaseClass{

	calculator1 calculator1;

	@Test
	public void sampletest() {
		calculator1 = new calculator1(driver);
		calculator1.number1();
		calculator1.plus();
		calculator1.number2();
		
	}

}

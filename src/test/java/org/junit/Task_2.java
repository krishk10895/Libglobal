package org.junit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Task_2 extends BaseClass {
	@Before
	public void startbrowser() {
		webdrive("chrome");
		Get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		Pojo_1 p=new Pojo_1();
		WebElement redid = p.getRedid();
		toclick(redid);
		WebElement signIn = p.getSignIn();
		toclick(signIn);
		WebElement frame = p.getFrame();
		driver.switchTo().frame(frame);
		WebElement mobil = p.getMobil();
		toSendKey(mobil,toReadData("testcase", "Sheet1", 1, 3));
		Assert.assertTrue("validate", mobil.getAttribute("value").equals("8885555999"));
		WebElement frm = p.getFrm();
		driver.switchTo().frame(frm);
		WebElement check = p.getCheck();
		toclick(check);
	

	}
}

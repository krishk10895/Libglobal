package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Task_1 extends BaseClass {
	@Before
	public void startbrowser() {
		webdrive("chrome");
		Get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void tc1() throws IOException {
		Pojo_1 p = new Pojo_1();
		WebElement txt = p.getTxt();
		toSendKey(txt, toReadData("testcase", "Sheet1", 4, 1));
		Assert.assertEquals("tovalidate the testcase", toReadData("testcase", "Sheet1", 4, 1),
				txt.getAttribute("value"));
		String attribute = txt.getAttribute("value");
		Assert.assertTrue(attribute.equals("krish@123"));
		WebElement pas = p.getPas();
		toSendKey(pas, toReadData("testcase", "Sheet1", 4, 0));
		Assert.assertEquals("tovalidate the testcase", toReadData("testcase", "Sheet1", 4, 0),
				pas.getAttribute("value"));
		WebElement click = p.getClick();
		toclick(click);
	}
}

package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Task_3 extends BaseClass{
	@Before
	public void startbrowser() {
		webdrive("chrome");
		Get("https://www.toolsqa.com/selenium-training/#enroll-form");
		driver.manage().window().maximize();
	}
	@Test
	public void tc1() throws IOException {
		Pojo_1 p=new Pojo_1();
		WebElement name = p.getName();
		toSendKey(name, toReadData("testcase", "Sheet1", 1, 0));
		WebElement last = p.getLast();
		toSendKey(last, toReadData("testcase", "Sheet1", 1, 1));
		WebElement mail = p.getMail();
		toSendKey(mail, toReadData("testcase", "Sheet1", 1, 2));
		WebElement mobile = p.getMobile();
		toSendKey(mobile,toReadData("testcase", "Sheet1", 1, 3));
		WebElement count = p.getCount();
		toSendKey(count, toReadData("testcase", "Sheet1", 1, 4));
		Assert.assertTrue(toReadData("testcase", "Sheet1", 1, 4).equals("India"));
		

	}
}

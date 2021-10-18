package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String str;
	public static String web;

	public static void webdrive(String web) {
//Weddrivermanager
		if (web == "chrome") {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (web == "firefox") {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Driver is not available please check passed argument string");
		}

	}
//geturl
	public static void Get(String url) {
		driver.get(url);
	}
//sendkeys
	public static void toSendKey(WebElement pass, String str) {
		pass.sendKeys(str);
	}
//click
	public static void toclick(WebElement button) {
		button.click();

	}
//Gettext
	public static void toGetText(WebElement text) {
		String sttext = text.getText();
		System.out.println(sttext);

	}
//getAttribute
	public static void toGetAtt(WebElement attribute) {
		String attri = attribute.getAttribute("value");
		System.out.println(attri);

	}
//Drag and drop
	public static void toDragandDrop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
//Actions concept using method
	public static void Act(WebElement loc, String str) {
		Actions ac = new Actions(driver);
		if (str == "moveOver") {
			ac.moveToElement(loc).perform();
		} else if (str == "context") {
			ac.contextClick(loc).perform();
		} else if (str == "doubleclick") {
			ac.doubleClick(loc);
		} else if (str == "click") {
			ac.click(loc).perform();
		} else {
			System.out.println("Check inside argument mismatch");

		}

	}
//Robot concept
	public static void toKeyboard(String str) throws AWTException {
		Robot ro = new Robot();
		if (str == "copy") {
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_C);
			ro.keyPress(KeyEvent.VK_C);
			ro.keyRelease(KeyEvent.VK_CONTROL);
		} else if (str == "paste") {
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);

		}
	}
//screenshot
	public static void Screen(String str) throws IOException {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File screenshotAs = scr.getScreenshotAs(OutputType.FILE);
		File fil = new File(str);
		FileUtils.copyFile(screenshotAs, fil);
		
	}
//javascript click
	public static void javascrToclick(String str, WebElement element) {
		JavascriptExecutor jav = (JavascriptExecutor) driver;
	
			jav.executeScript(str, element);
		}
//scrollup and down
	public static void javaScrpt(String str,WebElement scrol) {
		JavascriptExecutor jar=(JavascriptExecutor)driver;
		if (str.equalsIgnoreCase("scrollUp")) {
			jar.executeScript("arguments[0].scrollIntoView()",scrol );
		}
		else if (str.equalsIgnoreCase("scrollDown")) {
			jar.executeScript("arguments[0].scrollIntoView(false)", scrol);
		}

	}
	public static String toReadData(String data,String shet,int row,int cel) throws IOException {
		String value;
		File fi=new File("C:\\Users\\krishnan\\eclipse-workspace\\Datadrive\\Excel\\"+data+".xlsx");
		FileInputStream in=new FileInputStream(fi);
		Workbook work=new XSSFWorkbook(in);
		Sheet sht = work.getSheet(shet);
		Row ro = sht.getRow(row);
		Cell cell = ro.getCell(cel);
		int cellType = cell.getCellType();
		if (cellType==1) {
			value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat d=new SimpleDateFormat("dd/MMM/yyyy");
			value = d.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}
	
}


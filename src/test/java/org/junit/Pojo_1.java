package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo_1 extends BaseClass{
public Pojo_1() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement txt;

@FindBy(id="pass")
private WebElement pas;

@FindBy(name="login")
private WebElement click;

@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
private WebElement scrol;
@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
private WebElement down;
@FindBy(xpath="//a[text()='COURSES']")
private WebElement mover;

//redbus
@FindBy(id="select_box_sign")
private WebElement redid;
@FindBy(xpath="//li[contains(text(),'Sign In/Sign Up')]")
private WebElement signIn;
@FindBy(id="mobileNoInp")
private WebElement mobil;
@FindBy(xpath="//iframe[@class='modalIframe']")
private WebElement frame;
@FindBy(xpath="(//iframe[@title='reCAPTCHA'])[1]")
private WebElement frm;
@FindBy(xpath="(//span[@id='recaptcha-anchor'])[1]")
private WebElement check;
@FindBy(id="first-name")
private WebElement name;
@FindBy(id="last-name")
private WebElement last;
@FindBy(id="email")
private WebElement mail;
@FindBy(id="mobile")
private WebElement mobile;
@FindBy(xpath="//select[@name='country']")
private WebElement count;
public WebElement getName() {
	return name;
}
public WebElement getLast() {
	return last;
}
public WebElement getMail() {
	return mail;
}
public WebElement getMobile() {
	return mobile;
}
public WebElement getCount() {
	return count;
}
public WebElement getCheck() {
	return check;
}
public WebElement getFrame() {
	return frame;
}
public WebElement getFrm() {
	return frm;
}
@FindBy(id="otp-container")
private WebElement generate;

public WebElement getRedid() {
	return redid;
}

public WebElement getSignIn() {
	return signIn;
}

public WebElement getMobil() {
	return mobil;
}

public WebElement getGenerate() {
	return generate;
}

public WebElement getMover() {
	return mover;
}

public WebElement getCorej() {
	return corej;
}

public WebElement getTrain() {
	return train;
}

public WebElement getText() {
	return text;
}
@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement corej;
@FindBy(xpath="//span[text()='Java Training']")
private WebElement train;
@FindBy(xpath="//h2[contains(text(),'Anitha')]")
private WebElement text;
@FindBy(xpath="//a[contains(text(),'CONTACT US')]")
private WebElement contact;
@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
private WebElement line;
@FindBy(xpath="//p[contains(text(),'Copyright ©')]")
private WebElement copyright;




public WebElement getContact() {
	return contact;
}

public WebElement getLine() {
	return line;
}

public WebElement getCopyright() {
	return copyright;
}

public WebElement getScrol() {
	return scrol;
}

public WebElement getDown() {
	return down;
}

public WebElement getTxt() {
	return txt;
}

public WebElement getPas() {
	return pas;
}

public WebElement getClick() {
	return click;
}
}

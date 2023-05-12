package My_Website_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class payment_page {
	WebDriver driver;

	payment_page (WebDriver driver) {
		this.driver=driver;
	}
	//First name line
	WebElement FirstName() {
		return driver.findElement(By.name("firstname"));
	}
	//Type text in first number line
	void typeFirstName(String fname) {
		FirstName().sendKeys(fname);
	}
	//Get the input in first number line
	String FirstNameValue() {
		return FirstName().getAttribute("value");
	}
	//last name line
	WebElement LastName() {
		return driver.findElement(By.name("lastname"));
	}
	//Type text in last number line
	void typeLastName(String lname) {
		LastName().sendKeys(lname);
	}
	//Get the input in first number line
	String LastNameValue() {
		return LastName().getAttribute("value");
	}
	//ID line
	WebElement ID() {
		return driver.findElement(By.name("IDn"));
	}
	//Type text in ID line
	void typeID(String number) {
		ID().sendKeys(number);
	}
	//Get the input in ID line
	String IDValue() {
		return ID().getAttribute("value");
	}
	//AreaCodePhone option
	WebElement AreaCodePhone() {
		return driver.findElement(By.name("phone"));
	}
	//Select AreaCodePhone from the drop down selection
	void SelectCodeAreaNumber(String CA) {
		Select CodeAreaDropDown=new Select(AreaCodePhone());
		CodeAreaDropDown.selectByVisibleText(CA);
	}
	//Get the input in AreaCodePhone option
	String AreaCodePhoneValue() {
		return AreaCodePhone().getAttribute("value");
	}
	//Rest Of Phone Numbers line
	WebElement RestOfPhoneNumbers() {
		return driver.findElement(By.name("PhoneNumbers"));
	}
	//Type a number in RestOfPhoneNumbers line
	void typeRestOfPhoneNumbers(String number) {
		RestOfPhoneNumbers().sendKeys(number);
	}
	//Get the input in RestOfPhoneNumbers line
	String RestOfPhoneNumbersValue() {
		return RestOfPhoneNumbers().getAttribute("value");
	}
	//Address line
	WebElement Address() {
		return driver.findElement(By.name("adress"));
	}
	//Type text in Address line
	void typeAddress(String Address) {
		Address().sendKeys(Address);
	}
	//Get the input in Address line
	String AddressValue() {
		return Address().getAttribute("value");
	}
	//Visa card option
	WebElement VisaCard() {
		return driver.findElement(By.cssSelector("[value='visa']"));
	}
	//Click on visa card option
	void SelectVisaCard() {
		VisaCard().click();
	}
	//Visa card option is marked
	boolean VisaCardValue() {
		return VisaCard().isSelected();
	}
	//Master Card option
	WebElement MasterCard() {
		return driver.findElement(By.cssSelector("[value='Master card']"));
	}
	//Click on Master Card option
	void SelectMasterCard() {
		MasterCard().click();
	}
	//Master Card option is marked
	boolean MasterCardValue() {
		return MasterCard().isSelected();
	}
	//Card Number line
	WebElement CardNo() {
		return driver.findElement(By.name("CardN"));
	}
	//Type text in card number line
	void typeCardNo(String number) {
		CardNo().sendKeys(number);
	}
	//Get the input in card number line
	String CardNoValue() {
		return CardNo().getAttribute("value");
	}
	//CVV line
	WebElement CVV(){
		return driver.findElement(By.name("cvv"));
	}
	//Type text in CVV line
	void typeCvv(String number) {
		CVV().sendKeys(number);
	}
	//Get the input in CVV line
	String CVVValue() {
		return CVV().getAttribute("value");
	}
	//Expired Date by month option
	WebElement ExpiredDateMonth() {
		return driver.findElement(By.name("Month"));
	}
	//Choose a month from the drop down selection
	void SelectExpiredDateMonth(String expMonth) {
		Select ExpiredDateMonthDropDown=new Select(ExpiredDateMonth());
		ExpiredDateMonthDropDown.selectByVisibleText(expMonth);
	}
	//Get the input in "month" option
	String ExpiredDateMonthValue() {
		return ExpiredDateMonth().getAttribute("value");
	}
	//Expired Date by year option
	WebElement ExpiredDateYear() {
		return driver.findElement(By.name("Year"));
	}
	//Choose a year from the drop down selection
	void SelectExpiredDateYear(String expYear) {
		Select ExpiredDateYearDropDown=new Select (ExpiredDateYear());
		ExpiredDateYearDropDown.selectByVisibleText(expYear);
	}
	//Get the input in "year" option
	String ExpiredDateYearValue() {
		return ExpiredDateYear().getAttribute("value");
	}
	//"I agree" check box
	WebElement agreement() {
		return driver.findElement(By.id("agreement"));
	}
	//Click on "I agree" check box
	void selectagreement() {
		agreement().click();
	}
	//"I agree" check box is marked
	boolean agreementValue() {
		return agreement().isSelected();
	}
	//Pay button
	WebElement Pay() {
		return driver.findElement(By.cssSelector("[value='pay']"));
	}
	//Click on pay button
	void clickPay() {
		Pay().click();
	}
	//Clean button
	WebElement Clean() {
		return driver.findElement(By.cssSelector("[value='clean']"));
	}
	//Click on clean button
	void ClickClean() {
		Clean().click();
	}
	//Return to home button
	WebElement ReturnToHome() {
		return driver.findElement(By.linkText("Return to home"));
	}
	//Click on return to home button in payment page
	void clickRerurnToHome() {
		ReturnToHome().click();
	}

	//A text in home page
	WebElement textinhomepage() {
		return driver.findElement(By.id("welcome"));
	}

	//Get the text in home page
	String TextTestHomePage() {
		return textinhomepage().getText(); 
	}

	//Check how much elements of radio buttons is in payment page
	int AmountOfRadioButtons() {
		return driver.findElements(By.cssSelector("input[type='radio']")).size();
	}
	//Check how much elements of check boxes is in payment page
	int AmountOfCheckbox() {
		return driver.findElements(By.cssSelector("[type='checkbox']")).size();
	}

}
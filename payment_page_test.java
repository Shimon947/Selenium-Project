package My_Website_Project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class payment_page_test {
	WebDriver driver;

	@BeforeEach
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		//Create a webdriver object - open the browser
		driver = new ChromeDriver();

		//Go to the required URL
		driver.get("file:///C:/Users/shimo/Desktop/project-s_phone/payment%20page.html?gender=749%24");

		driver.manage().window().maximize();

		//Define a timeout: In case an element is not found in the program,
		//wait up to 10 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	//Checking Payment Page Default 
	void DefaultsOfPaymentPage() {
		payment_page payment_page=new payment_page(driver);

		assertEquals("", payment_page.FirstNameValue());
		assertEquals("", payment_page.LastNameValue());
		assertEquals("", payment_page.IDValue());
		assertEquals("", payment_page.AddressValue());
		assertEquals("050", payment_page.AreaCodePhoneValue());
		assertEquals("", payment_page.RestOfPhoneNumbersValue());
		assertTrue(payment_page.VisaCardValue());
		assertFalse(payment_page.MasterCardValue());
		assertEquals("", payment_page.CardNoValue());
		assertEquals("", payment_page.CVVValue());
		assertEquals("january", payment_page.ExpiredDateMonthValue());
		assertEquals("2023", payment_page.ExpiredDateYearValue());
		assertFalse(payment_page.agreementValue());

	}

	@Test
	//Fill Out The Payment Page
	void PaymentPageForm() {
		payment_page payment_page=new payment_page(driver);

		payment_page.typeFirstName("shimon");
		payment_page.typeLastName("korkus");
		payment_page.typeID("302222668");
		payment_page.SelectCodeAreaNumber("052");
		payment_page.typeRestOfPhoneNumbers("2365598");
		payment_page.typeAddress("jabutinski 77/2");
		payment_page.SelectMasterCard();
		payment_page.typeCardNo("4580333212125454");
		payment_page.typeCvv("459");
		payment_page.SelectExpiredDateMonth("02");
		payment_page.SelectExpiredDateYear("2024");
		payment_page.selectagreement();
		payment_page.clickPay();

	}

	@Test
	//Check Elements Of Check-box And Radio Button Type
	void ElementsOfCheckboxAndRadioButtonType() {
		payment_page payment_page=new payment_page(driver);


		assertEquals(2, payment_page.AmountOfRadioButtons());
		assertEquals(1, payment_page.AmountOfCheckbox());
	}

	@Test	
	//Click on "return to HomePage" button,check if the content is correct and print him 
	void HomePage() {
		payment_page payment_page=new payment_page(driver);

		payment_page.clickRerurnToHome();
		assertEquals("Welcome to S phone store", payment_page.TextTestHomePage());
		System.out.println(payment_page.TextTestHomePage());
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2500);
		driver.close();

	}
}

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Sign_Up_Selenium {

	public static void main(String[] args) {
		
		 //WebDriver driver = new HtmlUnitDriver(true);
		 //driver.setJavascriptEnabled(true);
		 
		WebDriver driver = new FirefoxDriver();

		String test_case_id_01 = "TC-01.01";
		String test_case_id_02 = "TC-01.02";
		String test_case_id_03 = "TC-01.03";
		String test_case_id_04 = "TC-01.04";
		String test_case_id_05 = "TC-01.05";
		String test_case_id_06 = "TC-01.06";
		String test_case_id_07 = "TC-01.07";
		String test_case_id_08 = "TC-01.08";
		String test_case_id_09 = "TC-01.09";
		String test_case_id_10 = "TC-01.10";
		String test_case_id_11 = "TC-01.11";
		String test_case_id_12 = "TC-01.12";
		String test_case_id_13 = "TC-01.13";
		String test_case_id_14 = "TC-01.14";
		String test_case_id_15 = "TC-01.15";
		String test_case_id_16 = "TC-01.16";
		String test_case_id_17 = "TC-01.17";
		String test_case_id_18 = "TC-01.18";
		String test_case_id_19 = "TC-01.19";
		String test_case_id_20 = "TC-01.20";
		String test_case_id_21 = "TC-01.21";
		String test_case_id_22 = "TC-01.22";
		String test_case_id_23 = "TC-01.23";
		String test_case_id_24 = "TC-01.24";
		String test_case_id_25 = "TC-01.25";
		String test_case_id_26 = "TC-01.26";
		String test_case_id_27 = "TC-01.27";
		String test_case_id_28 = "TC-01.28";
		String test_case_id_29 = "TC-01.29";
		String test_case_id_30 = "TC-01.30";
		String test_case_id_31 = "TC-01.31";
		String test_case_id_32 = "TC-01.32";
		String test_case_id_33 = "TC-01.33";
		String test_case_id_34 = "TC-01.34";
		String test_case_id_35 = "TC-01.35";
		String test_case_id_36 = "TC-01.36";
		String test_case_id_37 = "TC-01.37";
		String test_case_id_38 = "TC-01.38";
		String test_case_id_39 = "TC-01.39";
		String test_case_id_40 = "TC-01.40";
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String title_sign_up_expected = "Welcome to Sign Up";
		String app_title_expected  = "Sign Up";
		String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
		String error_fname_empty_expected = "Please enter First Name";
		String error_phone_empty_expected = "Please enter Phone Number";
		int expected_width = 60;
		int expected_height=60;
		String fname = "John";
		String lname = "Smith";
		String email = "JohnSmith@gmail.com";
		String phone = "478 117-1818";

		// TC-01.01

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=========================================");
		}
		
		// TC-01.02

				
				String app_title_actual = driver.findElement(By.id("id_f_title")).getText();

				if (app_title_actual.equals(app_title_expected)) {
					System.out.println("Test Case ID: \t\t" + test_case_id_02
							+ " - PASSED");
					System.out.println("App title Expected/Actual: \t"
							+ app_title_expected + "/" + app_title_actual);
					System.out.println("=========================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_02
							+ " - FAILED");
					System.out.println("App title Expected/Actual: \t"
							+ app_title_expected + "/" + app_title_actual);
					System.out.println("=========================================");
				}

		// TC-01.03

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();

		if (quote != null) {
			System.out.println("Test Case ID: \t\t" + test_case_id_03
					+ " - PASSED");
			System.out.println("\t\t\tPage contains quote ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_03
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains quote ");
			System.out.println("=========================================");
		}

		// TC-01.04

		driver.findElement(By.id("id_quotes")).getText();
		String quote_1 = driver.findElement(By.id("id_quotes")).getText();
		driver.navigate().refresh();
		String quote_2 = driver.findElement(By.id("id_quotes")).getText();

		if (quote_1.equals(quote_2)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_04
					+ " - FAILED");
			System.out.println("\t\t\tQuote doesn't updated ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_04
					+ " - PASSED");
			System.out.println("\t\t\tQuote updated ");
			System.out.println("=========================================");
		}

		// TC-01.05
		
		boolean first_name_present;
		try {
			driver.findElement(By.id("id_fname"));
			first_name_present = true;
		} catch (NoSuchElementException e) {
			first_name_present = false;
		}

		if (first_name_present == true) {
			System.out.println("Test Case ID: \t\t" + test_case_id_05
					+ " - PASSED");
			System.out.println("\t\t\tPage contains 'First Name' ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_05
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains 'First Name' ");
			System.out.println("=========================================");
		}
		// TC-01.06
		boolean last_name_present;
		try {
			driver.findElement(By.id("id_fname"));
			last_name_present = true;
		} catch (NoSuchElementException e) {
			last_name_present = false;
		}
		if (last_name_present==true) {
			System.out.println("Test Case ID: \t\t" + test_case_id_06
					+ " - PASSED");
			System.out.println("\t\t\tPage contains 'Last Name' ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_06
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains 'Last Name' ");
			System.out.println("=========================================");
		}
		// TC-01.07
		
		boolean email_present;
		try {
			driver.findElement(By.id("id_fname"));
			email_present = true;
		} catch (NoSuchElementException e) {
			email_present = false;
		}

		if (email_present = true) {
			System.out.println("Test Case ID: \t\t" + test_case_id_07
					+ " - PASSED");
			System.out.println("\t\t\tPage contains 'Email Address' ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_07
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains 'Email Address' ");
			System.out.println("=========================================");
		}
		// TC-01.08
		boolean phone_present;
		try {
			driver.findElement(By.id("id_phone"));
			phone_present = true;
		} catch (NoSuchElementException e) {
			phone_present = false;
		}
		if (phone_present == true) {
			System.out.println("Test Case ID: \t\t" + test_case_id_08
					+ " - PASSED");
			System.out.println("\t\t\tPage contains 'Phone' ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_08
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains 'Phone' ");
			System.out.println("=========================================");
		}
		
		// TC-01.09
		
		boolean radio_male_present;
		try {
			driver.findElement(By.id("id_g_radio_01"));
			radio_male_present = true;
		} catch (NoSuchElementException e) {
			radio_male_present = false;
		}
		if (radio_male_present == true) {
			System.out.println("Test Case ID: \t\t" + test_case_id_09
					+ " - PASSED");
			System.out.println("\t\t\tPage contains 'Radio button Male' ");
			System.out.println("=========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_09
					+ " - FAILED");
			System.out.println("\t\t\tPage doesn't contains 'Radio button Male' ");
			System.out.println("=========================================");
		}
		// TC-01.10, TC-01.25-32
		
				boolean radio_female_present;
				try {
					driver.findElement(By.id("id_g_radio_02"));
					radio_female_present = true;
				} catch (NoSuchElementException e) {
					radio_female_present = false;
				}
				if (radio_female_present == true) {
					System.out.println("Test Case ID: \t\t" + test_case_id_10
							+ " - PASSED");
					System.out.println("\t\t\tPage contains 'Radio button Female' ");
					System.out.println("=========================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_10
							+ " - FAILED");
					System.out.println("\t\t\tPage doesn't contains 'Radio button Female' ");
					System.out.println("=========================================");
				}
				
				// TC-01.11 - TC-01.16
				
				boolean state_present;
				try {
					driver.findElement(By.id("id_state"));
					state_present = true;
				} catch (NoSuchElementException e) {
					state_present = false;
				}
				if (state_present == true) {
					System.out.println("Test Case ID: \t\t" + test_case_id_11
							+ " - PASSED");
					System.out.println("\t\t\tPage contains drop-down list 'State' ");
					System.out.println("=========================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_11
							+ " - FAILED");
					System.out.println("\t\t\tPage doesn't contains drop-down list 'State' ");
					System.out.println("=========================================");
				}
				
				// TC-01.17 - TC-01.20
				
				
				String actual_width=(driver.findElement(By.id("id_img_facebook")).getAttribute("width"));
				String actual_height=(driver.findElement(By.id("id_img_facebook")).getAttribute("height"));
				int actual_width_1 = Integer.parseInt(actual_width);
				int actual_height_1 = Integer.parseInt(actual_height);		
				

				if (actual_width_1 == expected_width && actual_height_1 == expected_height) {
					System.out.println("Test Case ID: \t\t" + test_case_id_17
							+ " - PASSED");
					System.out.println("\t\t\tImage size: "+actual_width+"x"+actual_height);
					System.out.println("=========================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_17
							+ " - FAILED");
					System.out.println("\t\t\tImage size: "+actual_width+"x"+actual_height);
					System.out.println("=========================================");
				}
				
				// TC-01.21 - TC-01.24
				 
				driver.findElement(By.id("id_img_facebook")).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				ArrayList<String> allTabs = new ArrayList<String>(
						driver.getWindowHandles());
				driver.switchTo().window(allTabs.get(1));
				String title_facebook_actual = driver.getTitle();
				driver.close();
				driver.switchTo().window(allTabs.get(0));
		 
				if (title_facebook_expected.equals(title_facebook_actual)) {
					System.out.println("Test Case ID: \t\t" + test_case_id_21
							+ " - PASSED");
					System.out.println("Title Expected/Actual: \t"
							+ title_facebook_expected + "/" + title_facebook_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_21
							+ " - FAILED");
					System.out.println("Title Expected/Actual: \t"
							+ title_facebook_expected + "/" + title_facebook_actual);
					System.out.println("=======================================");
				}
				
				// TC-01.33
				
				driver.findElement(By.id("id_quotes")).getText();
				String quote_lenght = driver.findElement(By.id("id_quotes")).getText();
				if (quote_lenght.length() < 103 && quote_lenght.length() > 36) {
					System.out.println("Test Case ID: \t\t" + test_case_id_33
							+ " - PASSED");
					System.out.println("\t\t\tQuote length: " + quote.length());
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_33
							+ " - FAILED");
					System.out.println("\t\t\tQuote length: " + quote.length());
					System.out.println("=======================================");
				}
				
				// TC-01.34
				 
				driver.findElement(By.id("id_submit_button")).click();
				String error_fname_empty_actual = driver
						.findElement(By.id("ErrorLine")).getText();
		 
				if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
					System.out.println("Test Case ID: \t\t" + test_case_id_34
							+ " - PASSED");
					System.out.println("Error Expected/Actual: \t"
							+ error_fname_empty_expected + "/"
							+ error_fname_empty_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_34
							+ " - FAILED");
					System.out.println("Error Expected/Actual: \t"
							+ error_fname_empty_expected + "/"
							+ error_fname_empty_actual);
					System.out.println("=======================================");
				}
				
				// TC-01.37
				 
				driver.findElement(By.id("id_fname")).sendKeys(fname);
				driver.findElement(By.id("id_lname")).sendKeys(lname);
				driver.findElement(By.id("id_email")).sendKeys(email);
				driver.findElement(By.id("id_submit_button")).click();
				String error_phone_empty_actual= driver.findElement(By.id("ErrorLine")).getText();
				
				if (error_phone_empty_actual.equals(error_phone_empty_expected)) {
					System.out.println("Test Case ID: \t\t" + test_case_id_37
							+ " - PASSED");
					System.out.println("Error Expected/Actual: \t"
							+ error_phone_empty_expected + "/"
							+ error_phone_empty_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_37
							+ " - FAILED");
					System.out.println("Error Expected/Actual: \t"
							+ error_phone_empty_expected + "/"
							+ error_phone_empty_actual);
					System.out.println("=======================================");
				}
		 

	}

}

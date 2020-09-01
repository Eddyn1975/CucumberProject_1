package page;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkybluebackgroundPage {
	WebDriver driver;

	public SkybluebackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//div[@class='advance-controls']//descendant::button[contains(text(),'Set SkyBlue Background')]")
	WebElement SET_SKY_BLUE_BACKGROUND_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[@class='advance-controls']//descendant::button[contains(text(),'Set SkyBlue Background')]")
	WebElement SETSKYBLUEBACKGROUNDBUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement BACKGROUND_COLOR_FIELD;

	// Methods to interact with the elements

	public void existsElement() {
		if (!driver.findElements(By.xpath("//div[@class='advance-controls']//descendant::button[contains(text(),'Set SkyBlue Background')]")).isEmpty()) {
			System.out.println("Element is present ");
		} else {
			System.out.println("Element is not present ");
		}
	}

	public void clickOnTheSetSkyBlueBackgroundButton() {
		SET_SKY_BLUE_BACKGROUND_BUTTON.click();

	}

	public void validateskyBlueBackgroungColor() {

		WebElement element = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']"));
		String Color = element.getCssValue("color");
		// String hex = Color.substring(Color).asHex();
		// System.out.println(hex);
		System.out.println(Color);
		String backgroundColor = element.getCssValue("background-color");
		System.out.println(backgroundColor);
		/*
		 * //getting color attribute with getCssValue() String colr = driver.findElement
		 * (By.xpath("//body[@style]")).getCssValue("color"); //getting background color
		 * attribute with getCssValue() String bckgclr = driver.findElement(
		 * By.xpath("//body[@style]")).getCssValue("background-color");
		 * System.out.println(colr); System.out.println(bckgclr);
		 */

		/*
		 * WebElement elements =
		 * driver.findElement(By.xpath("/body[@style='background-color: skyblue']"));
		 * 
		 * String hex = Color.fromString(color).asHex(); System.out.println(hex); /*
		 * String backgroundColor =elements.getCssValue("background-color");
		 * System.out.println("The background color is :" + backgroundColor);
		 */

	}

	// Methods to interact with the elements

}

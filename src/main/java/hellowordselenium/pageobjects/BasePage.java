package hellowordselenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hellowordselenium.util.Navegacao;

public abstract class  BasePage {

	protected WebDriver driver = Navegacao.FirefoxDriver();
	
	public WebElement getElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement getElementByCssSelector(String cssSelector) {
		return driver.findElement(By.cssSelector(cssSelector));
	}

	public WebElement getElementById(String id) {
		return driver.findElement(By.id(id));
	}
}
	
	


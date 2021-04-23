package hellowordselenium.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {
	private String invalid = "//span[contains(.,'Invalid credentials')]";
	private String campoUsername = "//input[@id='txtUsername']";
	private String campoPassword = "#txtPassword";
	private String botaoLogin = "btnLogin";

	public WebElement getCampoUsername() {
		return getElementByXpath(campoUsername);
	}

	public WebElement getCampoPassword() {
		return getElementByCssSelector(campoPassword);
	}

	public WebElement getCampoBotaoLogin() {
		return getElementById(botaoLogin);

	}

	public void realizaLogin(String usuario, String senha) {
		getCampoUsername().sendKeys(usuario);
		getCampoPassword().sendKeys(senha);
		getCampoBotaoLogin().click();
	}


	public void toLogin() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");

	}
	public WebElement getelementoerro() {
		return getElementByXpath(invalid);
	}
	
	public void invalidCredencial() {
		Assert.assertTrue(getelementoerro().isDisplayed());
	}
}
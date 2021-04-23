package hellowordselenium.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class PaginaInicialPage extends BasePage {

	private String painelQuickLaunch = "//b[contains(text(),'Dashboard')]";
	private String opcaoMenuAdmin = "//*[@id='menu_admin_viewAdminModule']/b";

	Actions action = new Actions(this.driver);

	
	public void estouNaPaginaInicial() {
		Assert.assertTrue(getElementByXpath(painelQuickLaunch).isDisplayed());
	}
	public void acessaMenuAdmin() {
		action.click(getElementByXpath(opcaoMenuAdmin)).perform();
	}

	}

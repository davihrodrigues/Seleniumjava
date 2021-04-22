package hellowordselenium.pageobjects;

import org.junit.Assert;

public class PaginaInicialPage extends BasePage {

	private String painelQuickLaunch = "//b[contains(text(),'Dashboard')]";
	private String opcaoMenuAdmin = "//*[@id='menu_admin_viewAdminModule']/b";

	public void estouNaPaginaInicial() {
		Assert.assertTrue(getElementByXpath(painelQuickLaunch).isDisplayed());
	}


	}

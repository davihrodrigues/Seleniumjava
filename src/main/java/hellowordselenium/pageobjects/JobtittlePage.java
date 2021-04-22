package hellowordselenium.pageobjects;

import org.openqa.selenium.WebElement;


public class JobtittlePage extends BasePage {

	private String botaoAdmin = "btnAdmin";
	private String botaoTittlelist = "#menu_admin_viewJobTitleList";
	
	private String botaoAdd = "btnAdd";
	private String campoTexttittle = "#jobTitle_jobTitle";
	private String campoTittlelist = "#menu_admin_viewJobTitleList";
	private String botaoDelete = "btnDelete";
	private String botaoCancel = "btnCancel";
	private String botaoSave = "btnSave";

	public WebElement botaoAdmin() {
		return getElementById(botaoAdmin);
	}
	
	public WebElement getCampoBotaoLogin() {
		return getElementByCssSelector(botaoTittlelist);

	}
	
		
	public void toLogin() {
		driver.navigate() .to("https://opensource-demo.orangehrmlive.com/index.php");
		
	}
	}


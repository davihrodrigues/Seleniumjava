package hellowordselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class jobtittle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	
		
	 //clica no Admin
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
	 //clica no Job tittle list
		driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
	//clica no Botão add
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	//Escreve "001teste001"	
		driver.findElement(By.cssSelector("#jobTitle_jobTitle")).sendKeys("001teste001");
		
		driver.findElement(By.cssSelector("#jobTitle_jobDescription")).sendKeys("Teste para add job tittle");
		driver.findElement(By.id("btnSave")).click();
				
      // É esperado que apareça "Sucefull saved" com a descrição "Teste para add job tittle"
	
	     // Digitar o record mais recente +1
		
				

		
		
			
	
	
}
	
}
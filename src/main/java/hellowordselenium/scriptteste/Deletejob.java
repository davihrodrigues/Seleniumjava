package hellowordselenium.scriptteste;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Deletejob {

	public static void sapato(String[] args) {
		
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
				
				
				// Digitar o record mais recente +1, ex(34)
		//driver.findElement(By.xpath("//a[contains(text(),'001teste001')]")).click();
				driver.findElement(By.cssSelector("#ohrmList_chkSelectRecord_26")).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
			
	
	  // É esperado a mensagem "Successfully Deleted", e o job tittle "001teste001" sair da tela.
	}				
}
package metodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodos22 {
	
	WebDriver driver;
	
	public void abrirNavegador ( String url) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}
public void clicar (Object object) {
	driver.findElement((By) object).click();
}
public void pausar ( int tempo)throws InterruptedException {
	Thread.sleep(2000);
	
}
public void preenchertexto (By elemento , String texto) {
	
	driver.findElement(elemento).sendKeys(texto);
}
}




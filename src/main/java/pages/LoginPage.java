package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator
	private final By usernameField = By.id("Email");
	private final By passwordField = By.id("Password");
	private final By loginButton = By.className("login-button");
	
	public void EnterUserName(String username) {
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void EnterPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void ClickLoginButton() {
		driver.findElement(loginButton).click();
	}

}

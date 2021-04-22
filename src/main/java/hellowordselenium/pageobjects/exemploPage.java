package hellowordselenium.pageobjects;

public class exemploPage {
	public void realizaLogin(String[] args) {
		LoginPage login = new LoginPage();
		login.toLogin();
		login.realizaLogin("Admin", "admin123");
	
}
	public void realizaLoginFalha(String[] args) {
		LoginPage login = new LoginPage();
		login.toLogin();
		login.realizaLogin("ssss", "asdf123");
}
}


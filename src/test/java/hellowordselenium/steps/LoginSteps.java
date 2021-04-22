package hellowordselenium.steps;

import java.util.Map;

import hellowordselenium.pageobjects.LoginPage;
import hellowordselenium.pageobjects.PaginaInicialPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();
	PaginaInicialPage paginaInicialPage = new PaginaInicialPage();
	LoginPage falhaLogin = new LoginPage();
	
	@Dado("^que o usuario esteja na pagina de login$")
	public void queOUsuarioEstejaNaPaginaDeLogin() {
		loginPage.toLogin();
	}

	@Quando("^o usuario inputar as credenciais na pagina$")
	public void oUsuarioInputarAsCredenciaisNaPagina(DataTable data) {
		for (Map<Object, Object> map : data.asMaps(String.class, String.class)) {
			loginPage.realizaLogin(map.get("usuario").toString(), map.get("senha").toString());

		}
	}

	@Entao("^o usuario deve acessar a pagina inicial do Orange HR$")
	public void UsuarioDeveAcessarAPaginaInicialDoOrangeHR() {
		paginaInicialPage.estouNaPaginaInicial();
	}
	
	
	
	
	@Quando("^o usuario inputar as credenciais erradas na pagina$")
	public void oUsuarioInputarAsCredenciaisErradasNaPagina(DataTable data) {
		loginPage.realizaLogin("ssss", "asdf123");
		}
	
	
	@Entao("^o usuario deve receber Invalid credentials na pagina de login$")
	public void oUsuarioDeveReceberInvalidCredentialsNaPaginaDeLogin() {
		loginPage.invalidCredencial();
	}	
}

package hellowordselenium.steps;

import hellowordselenium.pageobjects.NacionalitiePage;
import hellowordselenium.pageobjects.PaginaInicialPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NacionalitiesSteps {
	PaginaInicialPage paginaInicialPage = new PaginaInicialPage();
	NacionalitiePage nacionalitiesPage = new NacionalitiePage();

	@Dado("^que o usuario esteja na pagina Nacionalities$")
	public void queOUsuarioEstejaNaPaginaNacionalities() throws Throwable {
		paginaInicialPage.estouNaPaginaInicial();
		nacionalitiesPage.acessaOpcaoMenuNacionalities();
	}

	@Quando("^adicionar a nacionalitie \"([^\"]*)\"$")
	public void adicionarANacionalitie(String nacionalitie) throws Throwable {
		nacionalitiesPage.cadastraNacionalitie(nacionalitie);
	}

	@Entao("^a nacionalidade sera exibida na lista$")
	public void aNacionalidadeSeraExibidaNaLista() throws Throwable {
		nacionalitiesPage.verificaNacionalidadeCadastrada();
	}

	@Dado("a nacionalitie {string} nao exista")
	public void aNacionalitieNaoExista(String nacionalidade) {
		nacionalitiesPage.validaNacionalidadeNaoExistenteNaLista(nacionalidade);
	}
	
	@Quando("^adicionar a nacionalitie vazia")
	public void adicionarANacionalitieVazia(String nacionalitie) throws Throwable {
		nacionalitiesPage.cadastraNacionalitie("");
	}
	
	@Entao("exibira a mensagem abaixo de name {string}")
	public void exibiraAMensagemAbaixoDeName(String string) throws Throwable {
		nacionalitiesPage.Required();
	}
}
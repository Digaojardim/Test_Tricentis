package Trincentis;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browsers;
import pages.EnterInsurantData;
import pages.EnterProductData;
import pages.EnterVehicleData;
import pages.Metodos;
import pages.SendQuote;
import pages.SlectPriceOption;

public class Exemplo {

	Browsers browser = new Browsers();
	Metodos metodos = new Metodos();
	EnterVehicleData verhi = new EnterVehicleData();
	EnterInsurantData enter = new EnterInsurantData();
	EnterProductData produc = new EnterProductData();
	SlectPriceOption slect = new SlectPriceOption();
	SendQuote send = new SendQuote();

	@Given("que entre no site da empreasa trincentis para cotacao {string}")
	public void que_entre_no_site_da_empreasa_trincentis_para_cotacao(String site) {
		browser.acessarSite(site);
		metodos.evidencia(site);

	}

	@Given("clico na opcao desejada")
	public void clico_na_opcao_desejada() {
		metodos.clicar(null);

	}

	@When("preencho os dados Enter vechile data")
	public void preencho_os_dados_enter_vechile_data() {

		verhi.preencherFormularioVehicle();

	}

	@When("preencho os dados Enter insurant data")
	public void preencho_os_dados_enter_insurant_data() {

		enter.preencherFormularioInsurant();

	}

	@When("preencho os dados Enter product dat")
	public void preencho_os_dados_enter_product_dat() {

		produc.preencherFormularioProduct();

	}

	@When("preencho os dados  Select prince option")
	public void preencho_os_dados_select_prince_option() {

		slect.preencherFormularioPrice();
        metodos.evidencia(null);
	}

	@When("preencho os dados  Send quote")
	public void preencho_os_dados_send_quote() {
        
		send.preencherFormularioSendQuote();
		metodos.evidencia(null);

	}

	@Then("verifico a mensagem {string}")
	public void verifico_a_mensagem(String string) {
		metodos.evidencia(string);
		metodos.fecharNavegador();
	}

}

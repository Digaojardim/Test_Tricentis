package pages;


import org.openqa.selenium.By;

import runner.Executa;

public class EnterProductData extends Executa{
	
	Metodos metodos =  new Metodos();
	By enter01 = By.id("enterproductdata");
	By start = By.xpath("//input[contains(@name,'Start Date')]");
	By insurance = By.xpath("//select[contains(@name,'Insurance Sum')]");
	By merit = By.name("Merit Rating");
	By damage = By.xpath("//select[contains(@name,'Damage Insurance')]");
	By optional = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[6]/select[1]");
	By euro = By.xpath("//input[@id='EuroProtection']");
	By courtesy = By.xpath("//select[contains(@name,'Courtesy Car')]");
	By yes = By.xpath("//option[@value='Yes']");
	By next01 = By.id("nextselectpriceoption");
	
	
	
	
	public void preencherFormularioProduct() {
		
		metodos.escrever(start, "12/12/2022");
		metodos.escrever(insurance, "3.000.000,00");
		metodos.escrever(merit, "Malus 17");
		metodos.escrever(damage, "No Coverage");
		metodos.clicar(optional);
		metodos.escrever(euro, "Euro Protection");
		metodos.clicar(courtesy);
		metodos.clicar(yes);
		metodos.clicar(next01);
	
	}

}

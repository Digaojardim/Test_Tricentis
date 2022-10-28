package pages;


import org.openqa.selenium.By;

import runner.Executa;

public class SlectPriceOption extends Executa{

	Metodos metodos = new Metodos();
	
	By select = By.id("selectpriceoption");
	By ultimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");

	
	
	
	
	

	public void preencherFormularioPrice() {
		metodos.clicar(select);
		metodos.clicar(ultimate);

		
		

	}

}

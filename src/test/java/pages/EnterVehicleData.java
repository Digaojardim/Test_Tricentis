package pages;



import org.openqa.selenium.By;

import runner.Executa;

public class EnterVehicleData extends Executa{
	

	Metodos metodos = new Metodos();

	
	  By menuAutomabile = By.id("nav_automobile");
	  By make = By.id("make");
	  By audi = By.xpath("//option[@value='Audi']");
	  By engine = By.id("engineperformance");
	  By dateof = By.xpath("//input[@id='dateofmanufacture']");
	  By number = By.id("numberofseats");
	  By valor = By.xpath("//option[@value='1']");
	  By fuel = By.id("fuel");
	  By diesel = By.xpath("//option[@value='Diesel']");
	  By list = By.id("listprice");
	  By license = By.id("licenseplatenumber");
	  By annual = By.id("annualmileage");
	  By next = By.id("nextenterinsurantdata");
	  
	 
	 
		
		public void	preencherFormularioVehicle() {
			metodos.clicar(menuAutomabile);
			metodos.clicar(make);
			metodos.clicar(audi);
			metodos.escrever(engine, "1234");
		    metodos.escrever(dateof, "12/08/2015");
		    metodos.clicar(number);
		    metodos.clicar(valor);
		    metodos.clicar(fuel);
		    metodos.clicar(diesel);
		    metodos.escrever(list, "30000");
		    metodos.escrever(license, "1000");
		    metodos.escrever(annual, "200");
		    metodos.clicar(next);
	
			
		}



		
	}



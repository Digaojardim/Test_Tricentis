package pages;


import org.openqa.selenium.By;

import runner.Executa;

public class EnterInsurantData extends Executa {
	
	Metodos metodos = new Metodos();
	

	    By enter = By.id("enterinsurantdata");
		By firstname = By.name("First Name");
		By lastname = By.name("Last Name");
		By dateof01 = By.id("birthdate");
		By gender = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]");
		By street = By.name("Street Address");
		By country = By.name("Country");
		By zip = By.id("zipcode");
		By city = By.name("City");
		By occupation = By.name("Occupation");
		By hobbies = By.xpath("(//span[@class='ideal-check'])[1]");
		By website = By.name("Website");
		By nexxt = By.name("Next (Enter Product Data)");
	
	

	
		public void	preencherFormularioInsurant() {
		
		metodos.clicar(enter);
		metodos.escrever(firstname, "Paulo");
		metodos.escrever(lastname, "Santos");
		metodos.clicar(dateof01);
		metodos.escrever(dateof01, "06/01/1989");
		metodos.clicar(gender);
		metodos.escrever(street, "Morrinhos");
		metodos.escrever(country, "Brazil");
		metodos.escrever(zip, "06246090");
		metodos.escrever(city, "São Paulo");
		metodos.clicar(occupation);
		metodos.escrever(occupation, "Employee");
	    metodos.clicar(hobbies);
	    metodos.escrever(website, "http://sampleapp.tricentis.com/101/app.php");
        metodos.clicar(nexxt);
	  
		
		
	}
}

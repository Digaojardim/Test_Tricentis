package pages;


import org.openqa.selenium.By;

import runner.Executa;

public class SendQuote extends Executa{

	Metodos metodos = new Metodos();
	By send = By.id("sendquote");
	By email = By.name("E-Mail");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.name("Password");
	By conpassword = By.name("Confirm Password");
	By comments = By.name("Comments");
	By sendemail = By.id("sendemail");
	
	

	public void	preencherFormularioSendQuote() {
		 metodos.clicar(send);
		 metodos.escrever(email, "Paulo.jj@gmail.com");
		 metodos.escrever(phone, "119563738");
		 metodos.escrever(username, "Paulo");
		 metodos.escrever(password, "Paulo@1989");
		 metodos.escrever(conpassword, "Paulo@1989");
		 metodos.escrever(comments, "Olá, meu nome é Diógenes Jardim, e estou fazendo essa automação de teste, \r\n"
		    		+ "obs: o botão Next >> da pagina, Select Price Option\r\n"
		    		+ "não esta reconhecendo \"id, name, e xpath\" não conseguir clicar nele, cliquei direto na aba \"Send Quote\".");
		 metodos.clicar(sendemail);
		 metodos.pausa(20000);
		


	}

}

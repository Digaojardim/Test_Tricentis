# Test_Tricentis

## DESAFIO TÉCNICO AUTOMAÇÃO - SPECIALIZED
Este é o teste de WEB que esta automatizado

##  Requisitos :book:

 * Java 11.0.16 + JDK deve estar instalado
 * cucumber-java 7.3.4
 * cucumber-junit 7.3.4
 * ashot 1.5.4
 * junit 4.13.1
 
 ## Como executar a aplicação :arrow_forward:
 A aplicação estará disponível através da URL ["http://sampleapp.tricentis.com/101/app.php"]


## Execução do Teste
 Para executar o teste completo, **Executa**

@RunWith(Cucumber.class)
@CucumberOptions(
		 // camainho das features
		 features = "src/test/resources/features/",
		// caminho dos steps de testes
		 glue = "Trincentis",
		//tag para indicar qual teste deverá ser executado
		 tags = "@executa",
		// pretty deixar o console igual a execução cucumber | html para
		 plugin = { "pretty", "html:target/report.html" },
		 //não executar o teste, validar se foi incluso algum novo bdd,
		 // FALSE
		 dryRun = false,
		 monochrome = true
		
		
)
public class Executa extends Browsers{

}


## Obs: :exclamation:
  Na raiz do plojeto Contem uma pasta de 
**Evidências*** duas imagens e um video.

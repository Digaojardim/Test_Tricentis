# Test_Tricentis

## DESAFIO TÉCNICO AUTOMAÇÃO - SPECIALIZED
Este é o teste de WEB que esta automatizado

##  Requisitos :book:

 * Java 11.0.16 + JDK deve estar instalado
 * rest-assured 4.0.0 
 * junit 4.12
 * gson 2.9.1
 * json-schema-validator 4.0.0
 
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
Algumas requisições deram erros nos estatusCode
* **DeletarSimulacaoTest** era pra retornar 204, retorno 200

package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.Browsers;

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

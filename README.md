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
 Para executar o teste completo, **Suite.classe**

* @RunWith(org.junit.runners.Suite.class)
* @SuiteClasses({
	* RestricaoTest.class,
	* CadastroTest.class,
	* AtualizaumaSimulaçãoTest.class,
	* NovaSimulacaoTest.class,
	* SimulacaoTest.class,
	* DeletarSimulacaoTest.class,

## Obs: :exclamation:
Algumas requisições deram erros nos estatusCode
* **DeletarSimulacaoTest** era pra retornar 204, retorno 200

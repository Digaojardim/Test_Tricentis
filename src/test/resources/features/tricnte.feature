#Author:diogenesjardim

@executa
Feature: Eu como usuario quero acessar o site para fazer cotacao
  

  @executa
  Scenario: Cotacao automobile
    Given que entre no site da empreasa trincentis para cotacao "http://sampleapp.tricentis.com/101/app.php"
    And clico na opcao desejada
    When preencho os dados Enter vechile data
    And preencho os dados Enter insurant data
    And preencho os dados Enter product dat 
    And preencho os dados  Select prince option
    And preencho os dados  Send quote
    Then verifico a mensagem "Sending e-mail sucecess!"
   

 

    
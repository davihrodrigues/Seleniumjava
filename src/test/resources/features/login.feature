#language: pt
#Version: 1.0
#Author: Davi Haubricht
#Encoding: UTF-8

@Login @OrangeHRM
Funcionalidade: Login

  @LoginSucesso
  Cenario: Login com sucesso no Orange HRM
    Dado que o usuario esteja na pagina de login
    Quando o usuario inputar as credenciais na pagina
      | usuario | senha    |
      | Admin   | admin123 |
    Entao o usuario deve acessar a pagina inicial do Orange HR
      
   @LoginFalha
  Cenario: Login com falha no Orange HRM
	  Quando o usuario inputar as credenciais na pagina
      | usuario | senha    |
      | asdf   | asdf123 |
    Entao o usuario deve receber Invalid credentials na pagina de login
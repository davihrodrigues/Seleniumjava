#language: pt
#Version: 1.0
#Author: Adilson Ferreira
#Encoding: UTF-8
@Nacionalities @Regressivo
Funcionalidade: Nacionalities

  Contexto: 
    Dado que o usuario esteja na pagina de login
    E o usuario inputar as credenciais na pagina
      | usuario | senha    |
      | Admin   | admin123 |

	@IncluirNacionalidade
  Cenario: Cadastrar Nacionalidade
    Dado que o usuario esteja na pagina Nacionalities
    E a nacionalitie "Brasileira" nao exista
    Quando adicionar a nacionalitie "Brasileira"
    Entao a nacionalidade sera exibida na lista

  Cenario: Cadastrar Nacionalidade já cadastrada
    Dado que o usuario esteja na pagina Nacionalities
    Quando adicionar a nacionalitie "Brasileira"
    Entao exibira a mensagem para a nacionalitie "Already exists"
	
	@Nacionalidadevazio
  Cenario: Cadastrar Nacionalidade Vazia
  	Dado que o usuario esteja na pagina Nacionalities
    Quando adicionar a nacionalitie ""
    Entao exibira a mensagem abaixo de name "Required"
    


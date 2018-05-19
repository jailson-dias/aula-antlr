## Configurações para gerar os classes java com o antlr pelo eclipse

### Instalando dependências

#### Importando o antlr runtime para o projeto
O antlr runtime é utilizado para gerar as classes lexer, parser e visitor que serão utilizadas no projeto e também é utilizado pelo eclipse para executar o projeto da ativiade 4.

Primeiro baixe o antlr runtime na versão 4.4, disponivel em http://www.antlr.org/download/antlr-runtime-4.4.jar, em seguida execute os passos abaixo.

1. Click com o botão direito na pasta do projeto
2. Click em **Propeties** 

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/import-antlr-1.png)

Na janela que abrir faça:
1. No menu lateral esquerdo selecione a opção **Java Build Path**
2. No menu horizontal no centro da janela selecione a opção **Libraries**
3. No menu lateral direito click em **Add External JARs** 

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/import-antlr-2.png)

Depois que estiver selecionado o arquivo .jar, click em **Apply and close**, como mostra a imagem abaixo.

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/import-antlr-3.png)

#### Instalando o plugin Antlr4 no eclipse

O plugin antlr4 é utilizado para o eclipse reconhecer a extensão .g4 do antlr, assim o eclipse sinalizando as palavras reservadas do antlr, as variáveis utilizadas no código entre outras melhorias, além de gerar os arquivos lexer, parser e visitor para serem utilizados na atividade.

* Instalando o plugin antlr4:

1. Click no menu **Help** do eclipse
2. Selecione a opção **Eclipse Marketplace**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/install_antlr1.png)

1. No campo de pesquisa digite **antlr 4**
2. Aperte a tecla *enter* ou click no botão **go**
3. Procure o plugin **ANTLR 4 IDE 0.3.6** e click em **install**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/install_antlr2.png)

Nesta janela que abriu click em **Finish**
![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/install_antlr3.png)

Nesse modal click em **Install anyway**
![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/install_antlr4.png)

Por fim click em **Restart Now**
![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/install_antlr5.png)

#### Configurando o plugin antlr4 no eclipse 

Configurando o plugin antlr4 no eclipse para gerar os arquivos java com o padrão de projeto visitor, ou seja, gerar os arquivos lexer, parser e visitor que são necessários na atividade 4.

1. Click com o botão direito na pasta do projeto
2. Click em Propeties 

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/import-antlr-1.png)

Em seguida, na janela que abrir, faça:
1. No menu lateral esquerdo selecione a opção **ANTLR 4** e dentro dela a opção **Tool**
2. Marque o checkbox **Enable project specific settings** em **2**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/visitor-2.png)

Marcando o checkbox vai ser possível editar as opções do plugin, assim faça:
1. Click no menu **Options** e desmarque o checkbox **Generate a parse tree listener (-listener)** e marque o checkbox **Generate a parse tree visitors (-visitor)** como pode ser visto em **1**
2. Click em **Apply and close**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/visitor-3.png)

#### Gerando os arquivos do antlr

Primeiro é necessário criar um arquivo .g4 dentro do diretório **br.ufpe.cin.if688.minijava.main**, como pode ser visto em **1**, sendo que o nome da gramática e o nome do arquivo tem que ser iguais, como pode ser visto em **1** e **2**. Neste arquivo .g4 é necessário que tenha especificado qual é o pacote onde os arquivos lexer, parser e visitor vão ficar, como está feito em **3** que o pacote tem o mesmo nome que **4**. Por fim é necessário mover as classes **BaseVisitor.java, Lexer.java, Parser.java e Visitor.java** em **5** para o pacote **br.ufpe.cin.if688.minijava.main** em **6**.


![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/atividade4/arquivos-antlr.png)

Agora o seu projeto já está configurado e com todas as dependências instaladas.

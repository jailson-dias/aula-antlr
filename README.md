## Projeto de Antlr

### Instalando dependências

#### Antlr4

O plugin antlr4 é utilizado para o eclipse reconhecer a extensão .g4 do antlr, assim o eclipse sinalizando as palavras reservadas do antlr, as variáveis utilizadas no código entre outras melhorias.

##### Instalando o plugin antlr4:

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


#### Importar o projeto no Eclipse

Na barra lateral do eclipse, na área do projeto, click com o botão direito do mouse e selecione a opção **Import...**
![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/import_project.png)

1. Na janela que abrir click na pasta **Maven**
2. Selecione a opção **Existing Maven Projects**
3. Click no botão **Next >**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/import_project2.png)

1. Nesta janela click no botão **Browse...** e selecione a pasta onde está o projeto que foi baixado do github
2. Click no botão **Finish**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/import_project3.png)

##### Possível erro

caso no projeto apareça um diretório **target/generated-sources/antlr4/antlr** como o da imagem abaixo, você deve excluir este diretório.

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/import_project_error.png)


#### Gerando os arquivos do antlr

1. Click com o botão direito na pasta do projeto, no caso da imagem abaixo é **compiladores-antlr**
2. Selecione a opção **Run As**
3. Por fim click em **Maven generate-sources**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/generate_antlr.png)

#### Movendo os arquivos *.java*
Para o projeto funcionar é necessário que as classes *AntlrLexer.java, AntlrListener.java e AntlrParser.java* geradas pelo antlr estejam no pacote *antlr* de *src/test/java*, assim é preciso copiar as classes que esto selecionadas em **1** na imagem a baixo para o pacote em **2**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/move_classes.png)

#### Executando os testes
Para executar os testes é necessário que todas os passos anteriores já tenham sido executados. Nesta etapa vai ser executado todos os arquivos de testes que estejam no diretório *src/test/resources*, assim é importante que tenha apenas arquivos de testes nesta pasta, pois caso tenha algum outro arquivo que não seja arquivo de teste, ele também vai ser executado como sendo um arquivo de teste, assim podendo levar a execução do teste a falhar.

Para executar os testes é necessário fazer:
1. Click com o botão direito na pasta do projeto, no caso da imagem abaixo é **compiladores-antlr**
2. Selecione a opção **Run As**
3. Por fim click em **Maven build**

![](https://raw.githubusercontent.com/jailson-dias/aula-antlr/master/imagens/run_test.png)

<a id="about"></a>

## Sobre


   2ª Avaliação referente a disciplina de Padrões de Projeto, ministrada pelo professor [Frederico Barboza](http://lattes.cnpq.br/2897532678011764), por meio do repositorio que se encontra [aqui](https://github.com/pooinf008/INF011-2022.1).

<a id="features"></a>

## Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

<h3> Expecificação 🟠</h3>
     <p>
      Uma rede de academias está solicitando a confecção de um sistema, que suporte a prescrição de programas de treinamento, 
      aulas, agendamento de avaliação, etc. Num primeiro momento, o foco é a prescrição de programas de treinamento. Para isso, 
      a equipe de projeto propôs o seguinte esquema de classes, que descreve os tipos de equipamentos disponíveis na academia, 
      os exercícios e as classes necessárias para prescrição dos programas de treinamento. 
      <br><br> Neste ponto do projeto, o objetivo é permitir que os clientes da academia tenham acesso e controle dos seus programas de treinamentos.</br></br> </p>
	
    
   <ul>
        <li> I. Escreva o conjunto de métodos necessários para que um programa possa retornar a próxima Série a
	ser executada. Considere que o programa comporta-se de forma diferente a depender do seu status.
	Um programa do tipo full workout, deve retornar a próxima série na lista de séries, considerando-se
	o conjunto completo de séries que compõem o programa, caso seja Segunda/Quarta/Sexta e
	nenhuma série nos demais dias (repouso). 🟠
	<li> II. Se o tipo do programa for ABCD, ele deve retornar os exercícios que trabalhem com os grupos
	musculares: A – Segunda – Ombros / Abdominal; B – Terça - Membros Inferiores; C- Quarta -
	Peitoral / Tríceps; D – Quinta – Costa / Bíceps, e nenhum de Sexta a Domingo.
	Por fim, se o tipo do programa for treinamento cardio, devem ser retornados os exercícios da
	categoria cardio às Segunda, Quarta e Sexta e nenhum nos demais dias.  🔴	
	<li> III. Modifique a aplicação para que ela possa permitir que o programa possa manter mecanismos de
	notificação para todos os interessados, que o programa foi finalizado (não há mais nenhuma série
	disponível para execução), informando a data e hora da finalização e o tipo do programa wur foi
	executado. 🔴
	<li> IV. Modifique a aplicação para que possa ser possível a criação de Exercícios combinados, que são
	Exercícios que podem ser compostos por outros Exercícios, em uma estrutura de vários níveis de
	profundidade (Ex: Combinado ‘Apoio-Barra’). Neste caso, a categoria e os grupos musculares dos
	exercícios combinados é formado pela união dos exercícios que os compõem. 🔴
	<li> V. Considere a classe Série e acrescente um método executar. O método executar atualmente imprime a
	descrição de qual exercício precisa ser feito, o número de repetições e a quantidade de vezes. Deseja 
	acrescentar, além disso a exibição do vídeo de execução do exercício, que inicialmente foi modelada
	como um atributo adicionado a classe exercício. Contudo, a aplicação começou a experimentar
	problemas de desempenho devido ao incremento demasiado do uso de memória. Modifique a
	aplicação para permitir a exibição do vídeo (como exercício, considere que a exibição do vídeo é
	apenas a impressão da string “[VIDEO DO EXERCÍCIO descrição]” junto a descrição de qual
	exercício precisa ser feito, o número de repetições e a quantidade de vezes, que ele deve ser
	executado), mas compartilhando o objeto vídeo quando ele for comum a várias instâncias do
	exercício (considerando, que o exercício é igual, quando eles tiverem a mesma descrição).  🔴
     </ul>         
                
##### Legenda
- 🟢 = `Feito`.
- 🟠 = `Fazendo`.
- 🔴 = `Pendente/Falta`.

<a id="technologies-used"></a>

## Tecnologias Utilizadas

Esse projeto foi desenvolvido utilizando a seguinte tecnologia, e pacotes:

- [Java](https://www.java.com/pt-BR/)

<a id="how-to-use"></a>

## Como clonar e importar

- Faça um fork do projeto
- Abra o terminal do Visual Studio Code
- Digite (troque cerqueirav pelo nome do seu usuário): git clone https://github.com/cerqueirav/design-patterns-2/
- Nome da pasta: design-patterns


<a id="how-to-contribute"></a>

## Como contribuir

- Fork este repositório,
- Crie sua branche com sua contribuição: `git checkout -b my-feature`
- Commit suas mudanças: `git commit -m 'feat: My new feature' `
- Push sua branch: `git push origin my-feature`

<h4 align="center">
	Made by <a href="https://github.com/cerqueirav" target="_blank">Victor Cerqueira </a> & <a href="https://github.com/snuknu" target="_blank">Eric Carvalho </a>
</h4>

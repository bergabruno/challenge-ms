
INTEGRANTES:

Nome: Bruno Bergamasco RM: 86434
<br>
Nome: Enzo Manzo Carelli RM: 85311
<br>
Nome: Giovanni Kenji Mendes RM: 86038
<br>
Nome: Guilherme de Souza Finochio dos Santos RM: 82457
<br>
Nome: Isadora Alves Lino de Oliveira RM: 84246
<br>

<h1>Diagrama de classe:</h1>

<img src="https://github.com/bergabruno/challenge-ms/blob/b603545fe9e5eef9f5e965d653a7c6de14839194/classe.png" alt="some text">

<h1>Relacionamento das entidades:</h1>
<img src="https://github.com/bergabruno/challenge-ms/blob/4c1e6f8ab348e8d5d1dddae61cdf8ee1b5b57bfc/relacionamento_bd.jpeg" alt= "some text">


Explicacao do projeto:
<p>
A solução consiste em uma aplicação online, contendo ferramentas para montagem de caminhões apropriados para diferentes situações. Isto é, haverá a tela de seleção do caminhão-base e após isso, poderá ser escolhida as peças pelo usuário e função de seu negócio. 
Ao terminar a seleção de peças. é concebido ao usuário a possibilidade de exportar o projeto para o site da Scania, e para seu e-mail, gerando um orçamento.

</p>


Atualização para o 2 entregavel:
Bom, a tela inicial:
http://localhost:8090/api/v1/caminhao

Apos escolher o caminhao -> 
Tela de confirmacao de upgrade 
Se sim -> 
Ir para tela de upgrade
depois ->
Ir para formulario para receber as informacoes sobre o cmainhao no email

Se não ->
Ir para formulario para receber as informacoes sobre o cmainhao no email

Apos preencher os dados, sera enviado uma mensagem em seu email com os dados do seu caminhao, junto ao valor (nao esta implementado ainda)
mas o estilo do email está em: templates/envioEmail.html

# AEDS_03 - Tp01

Neste trabalho prático foi adcionado uma nova classe "Tarefa" para as funções do CRUD em que é gerenciado através de um Hash com índice direto

## Classes e Métodos criados

### Classe Tarefa

uma das entidades principais do CRUD iqual à Pet e Pessoa

* ## Atributos:

  - Int id
  - String nome
  - LocalDate dataCriacao
  - LocalDate dataConclusao
  - Byte status // 0 - Pendente, 1 - Em progresso e 2 - Concluida
  - Byte prioridade // 0 - Baixa, 1 - Média e 2 - Alta
 
* ## Métodos:

  - setId(int id)
  - getId()
  - setNome(String nome)
  - getNome()
  - toByteArray()
  - fromByteArray(byte[] b)
  - toString()
  - compareTo(Object p)

## Experiência

  Achamos que a lápide estava com algum bug, porque após deletar continuava marcando que estava lá, mas era o reorganizar que estava causando isso.

## Perguntas

  - O trabalho possui um índice direto implementado com a tabela hash extensível? Sim
  - A operação de inclusão insere um novo registro no fim do arquivo e no índice e retorna o ID desse registro? Sim 
  - A operação de busca retorna os dados do registro, após localizá-lo por meio do índice direto? Sim
  - A operação de alteração altera os dados do registro e trata corretamente as reduções e aumentos no espaço do registro? Sim
  - A operação de exclusão marca o registro como excluído e o remove do índice direto? Sim
  - O trabalho está funcionando corretamente? Sim
  - O trabalho está completo? Sim
  - O trabalho é original e não a cópia de um trabalho de outro grupo? Sim

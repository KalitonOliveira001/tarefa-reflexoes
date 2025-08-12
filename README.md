 Tarefa Reflexões - Leitura de Annotation com Reflection

 Objetivo
Criar uma annotation personalizada chamada `@Tabela`, associar ela a uma classe, 
e depois ler o valor dessa annotation em **tempo de execução** usando **Reflection** em Java.

 Estrutura do Projeto
  Tabela.java  Annotation personalizada que guarda o nome de uma tabela.
  Produto.java Classe anotada com `@Tabela`.
  LeitorAnotacao.java Código que usa Reflection para ler o valor da annotation.

 Como funciona
Criamos a annotation `@Tabela(nome = "tb_produtos")`
Aplicamos ela na classe `Produto`.
Usamos `Reflection` para verificar se a classe tem a annotation e, se tiver, ler o valor do campo `nome`.

 Como executar
1. Compile e execute a classe `LeitorAnotacao.java`.
2. No console, o resultado esperado é:
Nome da tabela: tb_produtos

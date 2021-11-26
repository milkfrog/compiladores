# Trabalho EP1 de Construção de Compiladores (INE5426)

## Grupo:

- Marcelo Pietro Grutzmacher Contin (19150807)
- Matheus Leonel Balduino (17202305)

## Rodando o Analisador Léxico:

Para Rodar o programa basta executar o Makefile da seguinte forma:

```
make argumento="<nomeArquivo.lcc>"
```

> OBS1: O arquivo deve estar dentro do diretório /teste  
> OBS2: É permitido rodar apenas 1 arquivo por execução  
> OBS3: Somente é permitido argumentos do tipo .lcc  
> OBS4: A linguagem utilizada é o Java rodando na versão 11.0.10 como solicitado pelo Professor  

## Saída:

A saída do programa consiste em 2 arquivos (Tabela de Simbolos e tabela de Tokens).  
Os mesmos são gerados na pasta /saida_lexico.

## Exemplos de arquivos testes já incluídos:

```
make argumento="arrays.lcc"
make argumento="calculator.lcc"
make argumento="factorial.lcc"
```

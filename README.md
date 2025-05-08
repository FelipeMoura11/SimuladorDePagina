# Simulador de Algoritmos de Substituição de Páginas

Este projeto é um simulador escrito em Java para comparar o desempenho de diferentes algoritmos de substituição de páginas utilizados em sistemas operacionais com gerenciamento de memória virtual.

## 📌 Algoritmos Implementados

- **FIFO (First-In, First-Out)**
- **LRU (Least Recently Used)**
- **Clock (Segunda Chance)**
- **NFU (Not Frequently Used)**

> O algoritmo Ótimo foi removido por não ser viável em aplicações reais.

## 🎯 Objetivo

O objetivo é simular os algoritmos e calcular o número de faltas de página que ocorrem durante a execução dos algoritmos, dado um número de quadros de página e uma sequência de páginas a serem carregadas.

## Algoritmos Implementados
FIFO (First In, First Out):
 - **A página mais antiga é a primeira a ser substituída quando ocorre uma falta de página.**

LRU (Least Recently Used):
- **Substitui a página que foi menos recentemente usada, com base no histórico de uso.**

Clock (Second Chance):
- **Uma abordagem intermediária entre FIFO e LRU, usando um "relógio" circular para rastrear páginas e dar uma segunda chance antes de substituí-las.**

NFU (Not Frequently Used):
 - **Substitui a página com a menor contagem de referências. Para cada página, um contador é mantido, que é incrementado cada vez que a página é acessada. A página com o contador mais baixo é a substituída quando ocorre uma falta de página.**

## Como Usar:
Entrada:
O programa solicita ao usuário que insira uma sequência de páginas separadas por vírgula e o número de quadros de página disponíveis na memória.

Exemplo de Entrada:
```
Digite a sequência de páginas separadas por vírgula (ex: 1,2,3,4,1,2): 1, 2, 3, 4, 1, 2
Digite o número de quadros de página (ex: 3): 3
```
Saída Esperada:
O programa exibe o número de faltas de página para cada algoritmo de substituição:
```
Resultados:
FIFO - 4 faltas de página
LRU - 4 faltas de página
Clock - 4 faltas de página
NFU - 4 faltas de página
```

## Instruções para Execução
Compilação:
Compile o código usando o comando:
```
javac Main.java
```
Execução:
Após a compilação, execute o programa com:
```
java Main
```
Testando o Programa:
O programa solicita a entrada de uma sequência de páginas e o número de quadros. Após a entrada, ele irá calcular o número de faltas de página para os quatro algoritmos e exibir os resultados.

## Estrutura do Código : 
Main.java: Arquivo principal que executa o programa e recebe a entrada do usuário.

Algoritmos:

- **Cada algoritmo (FIFO, LRU, Clock e NFU) é implementado em sua própria classe.**

- **O método simular() de cada classe é responsável por simular o algoritmo e calcular o número de faltas de página.**

## Conclusão
Este simulador oferece uma forma simples de comparar o desempenho de diferentes algoritmos de substituição de páginas. Através da comparação dos resultados, é possível avaliar qual algoritmo é mais eficiente em diferentes cenários.

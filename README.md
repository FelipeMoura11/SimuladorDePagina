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

A página mais antiga é a primeira a ser substituída quando ocorre uma falta de página.

LRU (Least Recently Used):

Substitui a página que foi menos recentemente usada, com base no histórico de uso.

Clock (Second Chance):

Uma abordagem intermediária entre FIFO e LRU, usando um "relógio" circular para rastrear páginas e dar uma segunda chance antes de substituí-las.

NFU (Not Frequently Used):

Substitui a página com a menor contagem de referências. Para cada página, um contador é mantido, que é incrementado cada vez que a página é acessada. A página com o contador mais baixo é a substituída quando ocorre uma falta de página.

## 2. Compile os arquivos:
```
javac *.java
```

## 3. Execute o programa:
```
java Main
```
Exemplo de uso:
```
Digite a sequência de páginas separadas por vírgula (ex: 1,2,3,4,1,2):
7, 0, 1, 2, 0, 3, 0, 4, 2, 3
Digite o número de quadros de página (ex: 3):
3

Resultados:
FIFO - 8 faltas de página
LRU - 7 faltas de página
Clock - 7 faltas de página
```

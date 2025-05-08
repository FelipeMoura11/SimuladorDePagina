# Simulador de Algoritmos de Substituição de Páginas

Este projeto é um simulador escrito em Java para comparar o desempenho de diferentes algoritmos de substituição de páginas utilizados em sistemas operacionais com gerenciamento de memória virtual.

## 📌 Algoritmos Implementados

- **FIFO (First-In, First-Out)**
- **LRU (Least Recently Used)**
- **Clock (Segunda Chance)**

> O algoritmo Ótimo foi removido por não ser viável em aplicações reais.

## 🎯 Objetivo

Simular o comportamento dos algoritmos e contar o número de faltas de página para uma sequência de páginas fornecida pelo usuário.

## 1. 🧩 Estrutura
```bash
SimuladorPaginas/
├── src/
│ ├── Main.java
│ ├── FIFO.java
│ ├── LRU.java
│ └── Clock.java
├── README.md
```

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

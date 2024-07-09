# TP de Prog III

Este projeto consiste em um trabalho prático de Programação III, dividido em várias entregas. A primeira entrega tem como objetivo a leitura e armazenamento de dados coletados de vídeos no TikTok em uma estrutura de dados.

## Objetivo da Primeira Entrega

O principal objetivo da primeira entrega é realizar a leitura dos dados coletados de vídeos no TikTok e armazená-los de forma estruturada. Para isso, será necessário:

1. Ler os dados dos vídeos.
2. Separar os atributos de cada vídeo.
3. Armazenar esses dados em uma estrutura adequada.

## Estrutura de Dados

Os dados dos vídeos são compostos por vários atributos, separados por vírgulas. Esses atributos podem incluir, mas não se limitam a:

- ID do vídeo
- Autor
- Número de curtidas
- Número de compartilhamentos
- Número de comentários
- Descrição

## Principais Desafios

A principal dificuldade encontrada nesta primeira entrega foi entender o critério de quebra para separar os atributos dos vídeos. Especificamente, o campo "descrição" continha vírgulas, que também foram usadas como critério de quebra para separar os demais atributos. Isso exigiu um cuidado extra na implementação para garantir que as vírgulas dentro das descrições não fossem interpretadas incorretamente como separadores de atributos.

## Instruções de Uso

Para executar este projeto, siga os passos abaixo:

1. Certifique-se de ter o ambiente de desenvolvimento configurado corretamente.
2. Faça o download dos dados dos vídeos do TikTok no formato especificado.
3. Execute o script de leitura de dados, que irá processar os arquivos e armazenar as informações em uma estrutura de dados.
4. Verifique os dados armazenados para garantir que todos os atributos foram capturados corretamente, especialmente aqueles contidos nas descrições.

## Estrutura do Repositório

- `/data`: Diretório onde os dados dos vídeos do TikTok serão armazenados.
- `/scripts`: Diretório contendo os scripts de leitura e processamento dos dados.
- `/docs`: Documentação adicional sobre o projeto.

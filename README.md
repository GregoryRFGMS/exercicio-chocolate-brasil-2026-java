# 🍫 Exercício: Sistema de Fiscalização "Chocolate Real"

## 📝 Contexto Histórico e Legislativo

Este exercício foi adaptado com base na notícia:

*Chocolate no Brasil está pior? Como saber se você está comendo um Ovo de Páscoa 'fake'*

Recentemente, a Câmara dos Deputados avançou com um projeto de lei para elevar a qualidade do chocolate nacional. 

Atualmente, muitos produtos que compramos como "chocolate" (especialmente bombons famosos e ovos de Páscoa) possuem um teor de cacau tão baixo que são tecnicamente classificados apenas como "produto sabor chocolate", sendo compostos majoritariamente por gordura e açúcar.

Para garantir que o consumidor não seja enganado na Páscoa, a nova lei estabelece percentuais rígidos de sólidos de cacau para cada categoria.

Fonte: **BBC Brasil**, acesso em: 2026/04/04.

url: https://www.bbc.com/portuguese/articles/cj60r43xklzo

---

## 💻 O Desafio
Você deve desenvolver um programa em **Java** que auxilie um fiscal do Ministério da Agricultura a classificar os produtos coletados em uma fábrica de doces.

### Requisitos do Programa

O sistema deve processar três situações distintas utilizando `if`, `else if` e `else`, lidando com entradas de dados do tipo `int`, `double` e `String`.

**1ª Situação: Classificação por Teor de Cacau (Uso de `double`)**
O fiscal insere a porcentagem de sólidos de cacau encontrada na amostra.
* **Regras:**
    * Se o teor for **menor que 25%**: Exibir
    
      "ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'".
    * Se o teor estiver **entre 25% (inclusive) e 35% (exclusive)**: Exibir
    
      "Chocolate Comum (Padrão Nacional Atual)".
    * Se o teor for **35% ou mais**: Exibir
    
      "Chocolate de Alta Qualidade (Padrão Internacional/UE)".

**2ª Situação: Verificação de Categoria e Rótulo (Uso de `String` e `int`)**
O sistema recebe o tipo de chocolate ("AO_LEITE" ou "AMARGO") e a quantidade de gramas de açúcar por porção (int).
* **Regras:**
    * Se o tipo for **"AO_LEITE"** e o açúcar for **maior que 15g**: Exibir
    
      "Classificação: Doce de leite com cacau (Excesso de açúcar)".
    * Caso contrário, exibir
    
      "Classificação: Chocolate balanceado".

**3ª Situação: Precificação de Exportação (Uso de `double` e Operadores Lógicos)**
O sistema recebe o preço do ovo de Páscoa (double) e a nota de pureza (de 0 a 10).
* **Regras:**
    * Se o preço for **maior que R$ 100.00** OU a nota de pureza for **menor que 5**: Exibir
    
      "REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões".
    * Caso contrário: Exibir
    
      "APROVADO: Produto competitivo para o mercado externo".

---

## 🚀 Instruções para Entrega

1.  Cliquem em Fork no repositorio em que se encontra.
2.  Crie uma classe chamada `FiscalizacaoChocolate.java`.
3.  Utilize a classe `Scanner` para receber os dados do usuário.
4.  Lembre-se: para comparar o conteúdo de `String`, utilize o método `.equalsIgnoreCase()`.
5.  O código deve estar indentado e conter comentários explicando a lógica dos blocos `if/else`.
6.  Capture um print do console com o programa rodando e faça o `git commit` do arquivo `.java` + imagem.

### Exemplo de Saída Esperada
```text
--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---
Digite o percentual de cacau da amostra: 22.5
Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'.

Digite o tipo de chocolate (AO_LEITE/AMARGO): AO_LEITE
Gramas de açúcar: 18
Status: Classificação: Doce de leite com cacau (Excesso de açúcar).
-------------------------------------------
```

---

## 🛠️ Critérios de Avaliação
* Uso correto de `Scanner` e tipos de dados (`int`, `double`, `String`).
* Aplicação precisa de operadores relacionais (`>=`, `<`, `==`) e lógicos (`||`, `&&`).
* Formatação de saída clara para o usuário.

> "Um bom sistema, assim como um bom chocolate, não pode ter falhas na sua composição básica. Atenção aos parênteses e chaves!" — *Prof. Daniel Paiva*

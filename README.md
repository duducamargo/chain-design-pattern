
# Projeto: Chain of Responsibility Encapsulado

## 🎯 Objetivo
O objetivo deste projeto é implementar o **padrão de projeto Chain of Responsibility (Cadeia de Responsabilidade)** de forma **encapsulada**, garantindo que o programador de borda não precise conhecer a sequência do encadeamento nem instanciar manualmente os objetos concretos.

---

## 🧩 Estrutura do Projeto
```
src/
 ├── chain/
 │    └── HandlerChain.java
 ├── models/
 │    ├── absHandler.java
 │    ├── compradorHandler.java
 │    ├── gerenteHandler.java
 │    └── diretorHandler.java
 └── App.java
```

---

## 🧠 Explicação do Padrão

O **Chain of Responsibility** permite passar uma solicitação por uma cadeia de manipuladores (handlers) até que um deles possa tratá-la.  
Cada handler decide se processa a requisição ou a encaminha para o próximo da cadeia.

No contexto deste projeto, temos três níveis hierárquicos:
- **Comprador** → aprova valores baixos
- **Gerente** → aprova valores médios
- **Diretor** → aprova valores altos

---

## 🧱 Encapsulamento da Cadeia

A montagem da cadeia é feita dentro da classe `HandlerChain`, localizada no pacote `chain`.  
O programador de borda precisa apenas instanciar `HandlerChain` e chamar o método `processRequest(valor)`.

### Exemplo:

```java
import chain.HandlerChain;

public class App {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.processRequest(500);
    }
}
```

---

## ⚙️ Regras de Implementação

1. **A classe `HandlerChain`** deve criar internamente todos os objetos (`compradorHandler`, `gerenteHandler`, `diretorHandler`).
2. **O método `processRequest`** é a única interface pública exposta ao programador.
3. O programador **não deve** conhecer a sequência ou construir os objetos concretos.
4. O projeto deve seguir boas práticas de encapsulamento e separação de responsabilidades.

---

## 🧾 Entrega

- Repositório Git contendo todos os arquivos `.java`
- Estrutura conforme mostrada acima
- Classe `HandlerChain` implementando a lógica de montagem automática da cadeia
- Arquivo `README.md` explicando o funcionamento e a arquitetura do projeto

---

## 📚 Conceitos Envolvidos

- Design Patterns (GoF)
- Encapsulamento e abstração
- Programação orientada a objetos (POO)
- Cadeia de responsabilidade e inversão de controle

---

## ✅ Resultado Esperado

Ao executar o programa, a cadeia deve processar a requisição de acordo com o valor passado.  
Por exemplo, uma solicitação de **500** será tratada pelo **comprador**, enquanto valores mais altos serão escalonados para o gerente ou diretor.

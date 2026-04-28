# Diagrama de classes UML

## Diagrama da classe AgendaTelefonica

```mermaid

classDiagram
    
    direction LR
    
    App "1" *-- "1" AgendaTelefonica
    AgendaTelefonica "1" *-- "0..*" Contatos
    Contatos "1" *-- "0..*" Email
    Contatos "1" *-- "0..*" Telefones
    
    class App {
        - agenda: Agenda
        + main()
        +menu()
    }
    
    class AgendaTelefonica {
        -contatos: ArrayList<Contato>
        +Agenda()
        +addContato(c: Contato): boolean
        +findContato(nome: String, sobreNome: String): ArrayList<Contato>
        +removeContato(indiceContatoNaLista : int): boolean
        +addTelefone(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
        +addEmail(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
        +updateTelefone(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
        +updateEmail(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
        +removeTelefone(rotulo: String, indiceContatoNaLista : int): boolean
        +removeEmail(rotulo: String, indiceContatoNaLista : int): boolean
        +toString(): String
    }
    
    class Contatos {
        -nome: String
        -sobrenome: String
        -dataNasc: LocalDate
        -telefones: ColecaoTelefone
        -emails: ColecaoEmail
        +Contato(nome: String, sobrenome: String, dN : LocalDate)
        +addTelefone(rotulo: String, valor: String): boolean
        +addEmail(rotulo: String, valor: String): boolean
        +removeTelefone(rotulo : String): boolean
        +removeEmail(rotulo: String): boolean
        +updateTelefone(rotulo: String, valor: String): boolean
        +updateEmail(rotulo: String, valor: String): boolean
        +toString(): String
    }
    
    class Email {
        -dados: HashMap<String><String>
        +add(rotulo: String, valor: String): boolean
        +remove(rotulo: String): boolean
        +update(rotulo: String, valor: String): boolean
        +toString(): String
    }
    
    class Telefones {
        -dados: HashMap<String><String>
        +add(rotulo: String, valor: String): boolean
        +remove(rotulo: String): boolean
        +update(rotulo: String, valor: String): boolean
        +toString(): String
    }
    
```
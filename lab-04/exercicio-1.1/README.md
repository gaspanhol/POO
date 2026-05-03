# Diagrama de classes UML

## Diagrama da classe comercioEletronico

```mermaid

classDiagram
    
    direction LR
    
    Cliente "1" *-- "0..*" Pedido
    Cliente "1" *-- "1..*" Endereco
    Pedido "1" o-- "1..*" Produto
    
    class Cliente {
        -nome: String
        -email: String
        -enderecos: ArrayList<Endereco>
        -pedido: ArrayList<Pedido>
        +Cliente(String nome, String email, Endereco endereco)
        +addPedido(pedido) boolean
        +removePedido(pedido) boolean
        +alterarEmail(String email) boolean
        +alterarEndereco(enderecos) boolean
        +consultarPedidos() ArrayList<Pedido>
    }

    class Endereco {
        -String rua
        -int numeroEndereco
        -String cidade
        -String estado
        -String tipoLocal
        +Endereco(String rua, int numeroEndereco, String Cidade, String estado, String tipoLocal)
    }
    
    class Pedido {
        -data: LocalDate
        -situacao: String
        -produto: HashMap<Produto, qtdProdutos> 
        +Pedido(data LocalDate, String situacao, qtdProdutos, Produto produto)
        +AdicionarProduto(int qtdProdutos, Produtos produto)
        +RemoverProduto(produtos, qtdProdutos) boolean
        +AlterarData(LocalDate data) boolean
        +AlterarSituacao(String situacao) boolean
        +AlterarQuantidadeProdutos(int qtdProdutos)
    }
    
    class Produto {
        -int qtdEstoque
        -String descricao
        -double preco
        +Produto(int qtdEstoque, String descricao, double preco)
    }
```
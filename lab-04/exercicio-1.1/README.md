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
        -sobrenome: String
        -cpf: String
        -email: String
        -enderecos: ArrayList<Endereco>
        -pedidos: ArrayList<Pedido>
        +Cliente(String nome, String sobrenome, String cpf, String email, Endereco endereco)
        +addPedido(Pedido pedido) boolean
        +removePedido(int indiceDoPedido) boolean
        +adicionarProdutoAoPedido(int indicePedido, Produto produto, int qtdProdutos) boolean
        +removerProdutoDoPedido(int indicePedido, Produto produto, int qtdProdutos) boolean
        +alterarQuantidadeProdutoDoPedido(int indicePedido, Produto produto, int qtdProdutos) boolean
        +alterarProdutoDoPedido(int indicePedido, Produto produtoRemovido, Produto novoProduto, int qtdNovoProduto) boolean
        +addEndereco (Endereco endereco) boolean
        +alterarEndereco (int indiceDoEndereco, Endereco novoEndereco) boolean
        +consultarPedidos() String
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
        +Pedido(data LocalDate, String situacao, Produto produto, int qtdProdutos)
        +adicionarProduto(Produto produto, int qtdProdutos)
        +removerProduto(Produto produto) boolean
        +alterarQuantidadeProduto (Produto produto, int qtdProduto)
    }
    
    class Produto {
        -int qtdEstoque
        -String descricao
        -double preco
        +Produto(int qtdEstoque, String descricao, double preco)
    }
```
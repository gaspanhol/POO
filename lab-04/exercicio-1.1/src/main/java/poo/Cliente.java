package poo;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String sobrenome, String cpf, String email, Endereco endereco, Pedido pedido) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.enderecos = new ArrayList<>();
        enderecos.add(endereco);
        this.pedidos = new ArrayList<>();
        pedidos.add(pedido);
    }

    public boolean addPedido(Pedido pedido){
        pedidos.add(pedido);
        return true;
    }

    public boolean removePedido(int indiceDoPedido){
        pedidos.remove(indiceDoPedido);
        return true;
    }

    public boolean adicionarProdutoAoPedido(int indicePedido, Produto produto, int qtdProdutos) {
        pedidos.get(indicePedido).adicionarProduto(produto, qtdProdutos);
        return true;
    }

    public boolean removerProdutoDoPedido(int indicePedido, Produto produto, int qtdProdutos) {
        pedidos.get(indicePedido).removerProduto(produto);
        return true;
    }

    public boolean alterarQuantidadeProdutoDoPedido(int indicePedido, Produto produto, int qtdProdutos){
        pedidos.get(indicePedido).alterarQuantidadeProduto(produto, qtdProdutos);
        return true;
    }

    public boolean alterarProdutoDoPedido(int indicePedido, Produto produtoRemovido, Produto novoProduto, int qtdNovoProduto){
        pedidos.get(indicePedido).removerProduto(produtoRemovido);
        return pedidos.get(indicePedido).adicionarProduto(novoProduto, qtdNovoProduto);
    }

    public boolean addEndereco (Endereco endereco){
        enderecos.add(endereco);
        return true;
    }

    public boolean alterarEndereco (int indiceDoEndereco, Endereco novoEndereco){
        enderecos.set(indiceDoEndereco, novoEndereco);
        return true;
    }

    public String consultarPedidos() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pedidos:").append("\n");
        sb.append(pedidos.toString()).append("\n");
        return sb.toString();
    }
}

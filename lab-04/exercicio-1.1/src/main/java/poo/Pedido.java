package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Pedido {
    private LocalDate data;
    private String situacao;
    private HashMap<Produto, Integer> produtos;

    public Pedido(LocalDate data, String situacao, Produto produto, int qtdProdutos) {
        this.data = data;
        this.situacao = situacao;
        this.produtos = new HashMap<>();
        if (qtdProdutos<produto.getQtdEstoque()){
            this.produtos.put(produto, qtdProdutos);
            produto.setQtdEstoque(produto.getQtdEstoque() - qtdProdutos);
        }
    }

    public boolean adicionarProduto(Produto produto, int qtdProduto){
        if (qtdProduto<=produto.getQtdEstoque()){
            produto.setQtdEstoque(produto.getQtdEstoque() - qtdProduto);
            this.produtos.put(produto, qtdProduto);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerProduto(Produto produto){
        produto.setQtdEstoque(produto.getQtdEstoque() + this.produtos.get(produto));
        this.produtos.remove(produto);
        return true;
    }

    public boolean alterarQuantidadeProduto (Produto produto, int qtdProduto) {
        if (qtdProduto < produtos.get(produto)) {
            produto.setQtdEstoque(produto.getQtdEstoque() + (produtos.get(produto) - qtdProduto));
            this.produtos.put(produto, qtdProduto);
            return true;
        } else if (qtdProduto > produtos.get(produto)){
            if (produto.getQtdEstoque() > qtdProduto){
                produto.setQtdEstoque(produto.getQtdEstoque() - (qtdProduto - produtos.get(produto)));
                this.produtos.put(produto, qtdProduto);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pedido:").append("\n");
        sb.append("Data=").append(data).append("\n");
        sb.append("Situação=").append(situacao).append("\n");
        sb.append("Produtos=").append(produtos);
        return sb.toString();
    }
}

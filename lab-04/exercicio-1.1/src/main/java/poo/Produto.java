package poo;

public class Produto {
    private int qtdEstoque;
    private String descricao;
    private double preco;

    public Produto(int qtdEstoque, String descricao, double preco) {
        this.qtdEstoque = qtdEstoque;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Produto:").append("\n");
        sb.append("Descricao=").append(descricao).append("\n");
        sb.append("Preço=").append(preco);
        return sb.toString();
    }
}

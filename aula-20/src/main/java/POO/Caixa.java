package POO;

public class Caixa<T> {
    private T conteudo;

    public  Caixa(T obj) {
        this.conteudo = obj;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}

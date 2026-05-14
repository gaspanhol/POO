package poo.produtos;

public class Telefone {
    protected int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefone:\n");
        sb.append("Codigo=").append(codigo).append("\n");
        sb.append("NumSerie=").append(numSerie).append("\n");
        sb.append("Modelo=").append(modelo).append("\n");
        sb.append("Peso=").append(peso).append("\n");
        sb.append("Dimensao=").append(dimensao).append("\n");
        return sb.toString();
    }
}

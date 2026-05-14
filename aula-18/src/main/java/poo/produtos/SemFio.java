package poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao); //invoca as informações da classe que está herdando
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemFio:\n");
        sb.append(super.toString());
        sb.append("Frequencia=").append(frequencia).append("\n");
        sb.append("Canais=").append(canais).append("\n");
        sb.append("DistanciaOperacao=").append(distanciaOperacao).append("\n");
        return sb.toString();
    }
}

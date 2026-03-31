package POO;

public class Robo {
    private String nome;
    private final int numSerie; //só pode receber o valor uma única vez e após isso não pode mais ser mudado
    private static int contador = 0; //Existe um contador para todos os objetos

    public Robo(String nome) {
        this.nome = nome;
        contador++;
        this.numSerie = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSerie() {
        return numSerie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robo{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", numSerie=").append(numSerie);
        sb.append('}');
        return sb.toString();
    }

    public static int getTotalRobos(){
        return contador;
    }
}

package POO.Carro;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int v){
        propulsor.acelerar(v);
    }

    public int getGiroAtual() {
        return propulsor.getGiroAtual();
    }

    public Motor getPropulsor() {
        return propulsor;
    }

    public void trocarMotor(Motor m){
        this.propulsor = m;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Marca do Carro: ").append(marca).append("\n");
        sb.append("Motor do Carro: ").append(propulsor).append("\n");
        return sb.toString();
    }
}

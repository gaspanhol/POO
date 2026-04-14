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

    public void trocarMotor(Motor m){
        this.propulsor = m;
    }
}

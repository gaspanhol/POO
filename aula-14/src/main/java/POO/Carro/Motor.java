package POO.Carro;

public class Motor {
    private String marcaMotor;
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
        this.hp = 144;
        this.giroAtual = 0;
        this.cilindros = 16;
    }

    public void acelerar(int v){

        if (v>0) {
            for (int i = 0; i < v; i++) {
                giroAtual++;
            }
        } else {
            IO.println("Você não pode acelerar com valores negativos");
        }
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    @Override
    public String toString() {
        return marcaMotor;
    }
}

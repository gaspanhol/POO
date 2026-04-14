package POO.Carro;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
        this.hp = 144;
        this.giroAtual = 0;
        this.cilindros = 16;
    }

    public void acelerar(int v){
        if (v>0) {
            giroAtual++;
        } else {
            IO.println("Você não pode acelerar com valores negativos");
        }
    }
}

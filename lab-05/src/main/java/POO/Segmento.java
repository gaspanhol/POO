package POO;

public class Segmento {
    private boolean estado;

    public Segmento() {
        this.estado = false;
    }

    public boolean ligar(){
        this.estado = true;
        return estado;
    }

    public boolean desligar() {
        this.estado = false;
        return estado;
    }

    public boolean isLigado() {
        return estado;
    }
}

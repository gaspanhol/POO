package POO;

public class Ponto {

    //Atributos
    private int x;
    private int y;

    //métodos

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Ponto{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public double distanciaEntrePontos (Ponto b){
        return Math.sqrt(Math.pow(b.getX()- this.x, 2) + Math.pow(b.getY()- this.y, 2));
    }
}

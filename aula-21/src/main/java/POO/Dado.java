package POO;

import java.util.Random;

public class Dado {

    protected int face;
    protected int est;
    private Random r;

    public Dado(int face, int est) {
        this.face = face;
        this.est = est;
    }

    public int jogar() {
        this.face = r.nextInt(0,5);
        return (this.face+1);
    }
}

package POO;

public class DadoGrafico extends Dado implements  InterfaceGui{
    private double x;
    private double y;

    public DadoGrafico(int face, int est, double x, double y) {
        super(face, est);
        this.x = x;
        this.y = y;
    }


}

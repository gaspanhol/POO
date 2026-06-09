package POO;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {

    private double x;
    private double y;
    private boolean frente;

    public CartaGrafica(Naipes naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
        this.frente = true;
    }

    public void desenhar(Draw draw){
        draw.picture(x,y,"cartas/" + valor.inicial + naipe.inicial + ".png");
        draw.show();
    }

    public boolean virar() {
        this.frente = !frente;
        return frente;
    }

    public void clicouDentro(double x, double y, Draw draw) {
        if (x <= (this.x + 36) && x >= (this.x - 36) && y <= this.y + 48 && y >= this.y - 48 && frente) {
            draw.clear();
            draw.picture(this.x,this.y,"cartas/fundoa.png");
            draw.show();
            virar();
        } else if ((x <= (this.x + 36) && x >= (this.x - 36) && y <= this.y + 48 && y >= this.y - 48 && !frente)) {
            draw.clear();
            draw.picture(this.x,this.y,"cartas/" + valor.inicial + naipe.inicial + ".png");
            draw.show();
            virar();
        }
    }
}

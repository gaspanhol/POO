package POO;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements InterfaceGui {

    private double x;
    private double y;
    private boolean frente;

    public CartaGrafica(Naipes naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
        this.frente = false;
    }

    public void desenhar(Draw draw){
        if (!frente){
            draw.picture(this.x, this.y, "cartas/"+this.valor.inicial+this.naipe.inicial+".png");
            draw.show();
        }else{
            draw.picture(this.x, this.y, "cartas/fundoa.png");
            draw.show();
        }
    }

    public boolean virar() {
        this.frente = !frente;
        return frente;
    }

    public boolean clicouDentro(double x, double y){
        if(x <= (this.x+36) && x>= (this.x-36) && y<=(this.y+48) && y >= (this.y-48) ){
            this.virar();
            return true;
        }else{
            return false;
        }
    }
}

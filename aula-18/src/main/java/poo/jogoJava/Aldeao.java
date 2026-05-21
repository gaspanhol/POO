package poo.jogoJava;

public class Aldeao extends Personagem implements Guerreiro, Coletor{

    public Aldeao() {
        super(25, 1, 0.8);
    }

    public String mover(){
        return super.mover() + "o aldeão";
    }

    public String atacar(){
        return "O aldeão atacou com sua foice";
    }

    public String coletarMadeira(){return "O aldeão coletou madeira";}

    public String coletarOuro(){return "O aldeão coletou ouro";}
}

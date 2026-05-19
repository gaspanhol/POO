package poo.jogoJava;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    public String mover(){
        return super.mover() + "o cavaleiro";
    }

    public String atacar(){
        return "O cavaleiro atacou com sua espada";
    }
}

package poo.jogoJava;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro() {
        super(35, 2, 1);
    }

    public String mover(){
        return super.mover() + "o arqueiro";
    }

    public String atacar(){
        return "O arqueiro atirou uma flecha";
    }
}

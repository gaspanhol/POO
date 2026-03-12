package POO.Personagem;

public class Personagem {

    //Atributos
    private String nome;
    private String classe;
    private double altura;
    private String raca;
    private String sexo;
    private String atacar;
    private double position = 0;
    private int dado;

    //Métodos

    //set
    public void setNome(String n) {
        nome = n;
    }

    public void setClasse(String c) {
        classe = c;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public void setRaca(String r) {
        raca = r;
    }

    public void setSexo(String s) {
        sexo = s;
    }

    //actions

    public void rolarDado (String a, int valor){
        if (a.equals("rolar dado")) {
            dado = valor;
        }
    }

    public String andar (int x1, int y1, int x2, int y2){
        if (dado > 5){
            position = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
            return nome + " andou " + position + " metros";
        } else {
            return "O seu personagem não conseguiu se mover";
        }
    }

    public String atacar(boolean atacar){
        if (dado > 10){
            return nome + " realizou um ataque";
        } else {
            return nome + " não conseguiu atacar";
        }

    }

    public String defender(){
        if (dado > 15) {
            return nome + " realizou uma defesa";
        } else {
            return nome + " não conseguiu se defender";
        }
    }

    public String pular(){
        if (dado > 5) {
            return nome + " realizou um salto";
        } else {
            return nome + " não conseguiu realizar o salto";
        }
    }

    public String getFichaPersonagem(){
        return "Ficha do personagem\nNome: " + nome + "\nClasse: " + classe + "\nAltura: " + altura + "\nRaça: " + raca + "\nSexo: " + sexo;
    }

}

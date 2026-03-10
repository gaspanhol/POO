package poo;

public class Caneta {

    //Atributos
    private String cor; // Valor inicial = ""
    private double nivelTinta; // Valor inicial = 0.0
    private boolean aberta; // Valor inicial = false

    //Métodos:

    // Atributos de get
    public boolean abrirFechar (){
        aberta = !aberta;
        return aberta;
    }

    public void setCor (String c) {
        cor = c;
    }

    public void setNivelTinta (double nv) {
        nivelTinta = nv;
    }

    // Atributos de set
    public boolean isAberta () {return aberta;}
    public String getCor () {return cor;}
    public double getNivelTinta () {return nivelTinta;}

    //Atributo desenhar
    public String desenhar (int x1, int y1, int x2, int y2) {
        if(aberta) {
            double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
            if ((0.01 * distancia)<nivelTinta){
                nivelTinta -= (0.01 * distancia);
                return  String.format("Desenhei %.2f na cor %s", distancia, cor);
            }else{
                return "Você não tem tinta suficiente para desenhar a distância";
            }
        } else {
            return "A caneta está fechada!";
        }

    }

}
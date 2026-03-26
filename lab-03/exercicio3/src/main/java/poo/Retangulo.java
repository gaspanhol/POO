package poo;

import java.util.Objects;

public class Retangulo {
    private int altura;
    private int largura;
    private String codif;

    public Retangulo(int altura, int largura, String codif) {
        if (altura <= 0 || largura <= 0) {
            this.altura = 3;
            this.largura = 4;
        }
        if (Objects.equals(codif, "ASCII") || Objects.equals(codif, "UTF8")) {
            this.codif = codif;
        } else {
            this.codif = "ASCII";
        }
    }

    //TODO fazer os outros 6 passos do exercício 3
}

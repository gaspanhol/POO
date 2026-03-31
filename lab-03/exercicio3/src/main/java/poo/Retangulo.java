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

    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        this.codif = "ASCII";
    }

    public boolean setAltura(int altura) {
        if (altura<=0){
            this.altura = 3;
            return false;
        } else {
            this.altura = altura;
            return true;
        }
    }

    public boolean setLargura(int largura) {
        if (largura<=0){
            this.largura = 4;
            return false;
        } else {
            this.largura = largura;
            return true;
        }
    }

    public boolean setCodif(String codif) {
        if (Objects.equals("ASCII", codif) || Objects.equals("UTF8", codif)){
            this.codif = codif;
            return true;
        } else {
            this.codif = "ASCII";
            return false;
        }
    }

    public int getAltura(){
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCodif() {
        return codif;
    }

    public int areaRetangulo(){
        return this.largura * this.altura;
    }

    public int perimtroRetangulo(){
        return 2*(this.largura+this.altura);
    }

//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Retangulo{");
//        sb.append("altura=").append(altura);
//        sb.append(", largura=").append(largura);
//        sb.append(", codif='").append(codif).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public String toString(){
        String cantoEsq= "+";
        String cantoDir = "+";
        String meioTopo = "-";
        String meioCentro = "|";
        String cantoEsqB = cantoEsq;
        String cantoDirB = cantoDir;
        if (Objects.equals("UTF8", codif)) {
            cantoEsq= "\u250c";
            cantoDir= "\u2510";
            meioTopo= "\u2500";
            meioCentro= "\u2502";
            cantoEsqB = "\u2514";
            cantoDirB = "\u2518";
        }
        String linhaTopo = cantoEsq + meioTopo.repeat(this.largura - 2) + cantoDir + "\n";
        String miolo = meioCentro + " ".repeat(this.largura - 2) + meioCentro + "\n";
        String linhaBase = cantoEsqB + meioTopo.repeat(this.largura - 2) + cantoDirB;

        return linhaTopo + miolo.repeat(this.altura - 2) + linhaBase;
    }
}

package poo;

public enum Naipes {
    PAUS(4, "Pau"),
    OUROS(1, "Ouros"),
    COPAS(3, "Copas"),
    ESPADAS(4, "Espadas");

    public final int valor;
    public final String extenso;

    Naipes(int valor, String extenso) {
        this.valor = valor;
        this.extenso = extenso;
    }



}

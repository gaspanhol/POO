package POO;

public enum Naipes {
    OUROS(1, "Ouros", 'o'),
    ESPADAS(2, "Espadas", 'e'),
    COPAS(3, "Copas", 'c'),
    PAUS(4, "Pau", 'p');

    public final int valor;
    public final String extenso;
    public final char inicial;

    Naipes(int valor, String extenso, char inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }
}

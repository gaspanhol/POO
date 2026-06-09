package POO;

public enum Valor {
    AS(1, "Ás", "1"),
    DOIS(2, "Dois", "2"),
    TRES(3, "Três", "3"),
    QUATRO(4, "Quatro", "4"),
    CINCO(5, "Cinco", "5"),
    SEIS(6, "Seis", "6"),
    SETE(7, "Sete", "7"),
    OITO(8, "Oito", "8"),
    NOVE(9, "Nove", "9"),
    DEZ(10, "Dez", "10"),
    J(11, "Valete", "11"),
    Q(12, "Dama", "12"),
    K(13,"Rei", "13");

    public final int valor;
    public final String extenso;
    public final String inicial;

    Valor(int valor, String extenso, String inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }
}

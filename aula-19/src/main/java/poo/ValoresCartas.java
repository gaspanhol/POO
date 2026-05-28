package poo;

public enum ValoresCartas {
    AS(1, "Ás"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    J(11, "Valete"),
    Q(12, "Dama"),
    K(13,"Rei");

    public final int valor;
    public final String extenso;

    ValoresCartas(int valor, String extenso) {
        this.valor = valor;
        this.extenso = extenso;
    }
}

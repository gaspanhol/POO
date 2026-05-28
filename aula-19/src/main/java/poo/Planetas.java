package poo;

public enum Planetas {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    public final int posicao;
    public final String extenso;


    Planetas(int posicao, String extenso) {
        this.posicao = posicao;
        this.extenso = extenso;
    }

    public static Planetas getByCodigo(int posicao) {
        for (Planetas p : Planetas.values()) {
            if (p.posicao == posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }
}

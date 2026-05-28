package poo;

public enum DiasDaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERCA(3, "terça-feira"),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sábado");

    public final int codigo;
    public final String extenso;

    DiasDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiasDaSemana getByCodigo(int codigo) {
        for (DiasDaSemana dia : DiasDaSemana.values()) {
            if (dia.codigo == codigo){
                return  dia;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }

    @Override
    public String toString() {
        return extenso;
    }
}

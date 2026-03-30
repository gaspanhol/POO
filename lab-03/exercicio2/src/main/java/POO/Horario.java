package POO;

public class Horario {
    //Atributos
    private int hora;
    private int minutos;
    private int segundos;

    //métodos

    // Construtor padrão
    public Horario() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    private boolean validaHora (int hora) {
        return hora <= 23 && hora >= 0;
    }

    private boolean validaMinutos (int minutos) {
        return minutos <= 59 && hora >= 0;
    }

    private boolean validaSegundos (int segundos) {
        return segundos <= 59 && segundos >= 0;
    }

    public Horario(int hora) {
        this(hora,0,0);
    }

    public Horario(int hora, int minutos) {
        this(hora,minutos,0);
    }

    //Construtor de hora, minuto e segundos
    public Horario(int hora, int minutos, int segundos) {
        this();
        if(validaHora(hora) && validaMinutos(minutos) && validaSegundos(segundos)){
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    public boolean setHora(int hora) {
        if (validaHora(hora)) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinutos(int minutos) {
        if (validaMinutos(minutos)) {
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public boolean setSegundos(int segundos) {
        if (validaSegundos(segundos)) {
            this.segundos = segundos;
            return true;
        }
        return false;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(verificaZeroAntes(this.hora)).append(hora).append(":");
        sb.append(verificaZeroAntes(this.minutos)).append(minutos).append(":");
        sb.append(verificaZeroAntes(this.segundos)).append(segundos);
        return sb.toString();
    }

    private String verificaZeroAntes (int tempo) {
        if (tempo < 10) {
            return "0";
        } else {
            return "";
        }
    }

    public String tempoPorExtenso(){
        String hora = extensoValor(this.hora);
        String minutos = extensoValor(this.minutos);
        String segundos = extensoValor(this.segundos);
        return hora + " horas, " + minutos + " minutos, " + segundos + " segundos";
    }

    private String extensoValor (int valor){
       if (valor < 20){
           return converterParaExtenso(valor);
       } else {
           int dezena = valor/10;
           int unidade = valor % 10;
           if (unidade == 0) {
               return converterParaExtenso(dezena);
           } else {
               return converterParaExtenso(dezena*10) + " e " + converterParaExtenso(unidade);
           }
       }
    }

    private String converterParaExtenso(int valor) {
        return switch (valor){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public int horarioEmSegundos (){
        return (this.hora * 3600) + (this.minutos * 60) + this.segundos;
    }

    public int diferencaHorarios (Horario horario) {
        return this.horarioEmSegundos() - horario.horarioEmSegundos();
    }
}

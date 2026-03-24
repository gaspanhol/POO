package POO;

public class Horario {
    //Atributos
    private int hora;
    private int minutos;
    private int segundos;

    //métodos

    public Horario() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public boolean validaHora (int hora) {
        return (hora <= 24 || hora >= 0 ) ? true : false;
    }

    public boolean validaMinutos (int minutos) {
        return (minutos <= 59 || hora >= 0 ) ? true : false;
    }

    public boolean validaSegundos (int segundos) {
        return (segundos <= 24 || segundos >= 0 ) ? true : false;
    }

    //TODO fazer o construtor de hora
    public Horario(int hora) {

    }

    //TODO refazer o construtor de hora e minutos
    public Horario(int hora, int minutos) {
        if(hora > 24 || hora < 0 || minutos > 59 || minutos < 0){
            this.hora = 0;
            this.minutos = 0;
        } else {
            this.hora = hora;
            this.minutos = minutos;
        }
    }

    //TODO refazer o construtor de hora, minuto e segundos
    public Horario(int hora, int minutos, int segundos) {
        if(hora > 24 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0){
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        } else {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 24) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    //TODO refazer setMinutos
    public boolean setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            return false;
        } else {
            this.minutos = minutos;
            return true;
        }
    }

    //TODO refazer setSegundos
    public boolean setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            return false;
        } else {
            this.segundos = segundos;
            return true;
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(hora).append(":");
        sb.append(minutos).append(":");
        sb.append(segundos);
        return sb.toString();
    }

    private String converterParaExtenso(int valor) {

        return switch (valor){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
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
}

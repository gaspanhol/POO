package poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia) {
        this(dia,0,0);
    }

    public Data(int dia, int mes) {
        this(dia,mes,0);
    }

    public Data(int dia, int mes, int ano) {
        this();
        if (verificaDia(dia, this.mes, this.ano) && verificaMes(mes) && verificaAno(ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private boolean verificaDia(int dia, int mes, int ano){
        if (mes < 1 || mes > 12) return false;

        int diaMax;
        if (mes == 2) {
            if (verificaBissexto(ano)){
                diaMax = 29;
            } else {
                diaMax = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diaMax = 30;
        } else {
            diaMax = 31;
        }
        return dia > 0 && dia <= diaMax;
    }

    private boolean verificaMes(int mes){
        return mes < 13 && mes > 0;
    }

    private boolean verificaAno(int ano){
        return ano > 0;
    }

    private boolean verificaBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(int dia) {
        if (verificaDia(dia, this.mes, this.ano)) {
            this.dia = dia;
            return true;
        } else {
            return false;
        }
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if (verificaMes(mes) && verificaDia(this.dia, mes, this.ano)) {
            this.mes = mes;
            return true;
        } else {
            return false;
        }
    }

    public int getAno() {
        return ano;
    }

    public boolean setAno(int ano) {
        if (verificaAno(ano)) {
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String dataPorExtenso() {
        return String.format("%02d de %s de %04d", dia, mesExtenso(mes), ano);
    }

    private String mesExtenso(int mes){
        return switch (mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "";
        };
    }

    public int diferencaEmDias(Data data){
        return this.dataEmDias() - data.dataEmDias();
    }

    private int dataEmDias() {
        int diasTotais = 0;
        for (int i = 1; i < this.ano; i++) {
            diasTotais += (verificaBissexto(i) ? 366 : 365);
        }

        for (int i = 1; i < this.mes; i++) {
            diasTotais += diasNoMes(i, this.ano);
        }

        diasTotais += this.dia;

        return diasTotais;
    }

    private int diasNoMes(int mes, int ano) {
        if (mes == 2) {
            return verificaBissexto(ano) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}

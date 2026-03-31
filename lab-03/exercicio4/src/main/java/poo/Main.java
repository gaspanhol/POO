package poo;

public class Main {
    static void main() {
        Data d = new Data(1,1,2021);
        Data a = new Data(18,1,2021);
        IO.println(d.toString());
        d.setDia(30);
        d.setMes(12);
        IO.println(d.toString());
        d.setAno(-10);
        IO.println(d.toString());
        d.setMes(2);
        IO.println(d.toString());
        d.setDia(17);
        IO.println(d.toString());
        d.setMes(2);
        IO.println(d.toString());
        IO.println(d.dataPorExtenso());
        IO.println(d.diferencaEmDias(a));
    }
}

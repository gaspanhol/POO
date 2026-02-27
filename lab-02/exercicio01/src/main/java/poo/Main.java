package poo;

public class Main {
    static void main() {

        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ");

        if ((dia >= 21 && dia <= 31 && mes.equals("dezembro")) || (dia >= 1 && dia <= 31 && mes.equals("janeiro")) || (dia >= 1 && dia <= 28 && mes.equals("fevereiro")) || (dia >= 1 && dia <= 21 && mes.equals("março"))){
            IO.println("Verão");
        } else if ((dia >= 22 && dia <= 31 && mes.equals("março")) || (dia >= 1 && dia <= 30 && mes.equals("abril")) || (dia >= 1 && dia <= 31 && mes.equals("maio")) || (dia >= 1 && dia <= 22 && mes.equals("junho"))) {
            IO.println("Outono");
        }  else if ((dia >= 23 && dia <= 30 && mes.equals("junho")) || (dia >= 1 && dia <= 31 && mes.equals("julho")) || (dia >= 1 && dia <= 31 && mes.equals("agosto")) || (dia >= 1 && dia <= 23 && mes.equals("setembro"))) {
            IO.println("Inverno");
        } else if ((dia >= 24 && dia <= 30 && mes.equals("setembro")) || (dia >= 1 && dia <= 31 && mes.equals("outubro")) || (dia >= 1 && dia <= 30 && mes.equals("novembro")) || (dia >= 1 && dia <= 23 && mes.equals("dezembro"))) {
            IO.println("Primavera");
        } else {
            IO.println("Você digitou uma data inválida");
        }

        //Datas das trocas das estações
        //Verão (21/22 dez - 20/21 mar)
        //Outono (20/21 mar - 20/21 jun)
        //Inverno (20/21 jun - 22/23 set)
        //Primavera (22/23 set - 21/22 dez)

    }
}
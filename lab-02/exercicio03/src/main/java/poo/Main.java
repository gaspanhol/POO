package poo;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            IO.println("Não forneceu argumentos de linha de comando");
        }else{
            if (args[0].equals("triangulo")) {
                int arg2 = Integer.parseInt(args[1]);
                for (int i = 0; i < arg2; i++) {
                    IO.println("*".repeat(i+1));
                }

            } else if (args[0].equals("losango")) {
                int arg2 = Integer.parseInt(args[1]);
                for (int i = 0; i < arg2; i++) {

                }
            } else if (args[0].equals("retangulo")) {
                int arg2 = Integer.parseInt(args[1]);
                for (int i = 0; i < arg2; i++) {

                }
            }
        }
    }
}

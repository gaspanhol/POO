public class Argumentos {
    public static void main(String[] args) {
        if (args.length == 0){
            IO.println("Não forneceu argumentos de linha de comando");
        }else{
            int n = 0;
            for (int i = 0; i < args.length; i++) {
                IO.println((i+1) + " argumento: " + args[i]);
            }
        }
    }
}
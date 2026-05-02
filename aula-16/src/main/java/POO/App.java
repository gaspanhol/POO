package POO;

import java.time.LocalDate;

public class App {

    private AgendaTelefonica agenda;

    public static int menu(){
            IO.println("""
                    ..:: MENU ::..
                    1- Adicionar contato a agenda
                    2- Encontrar contatos
                    3- Remover contato da agenda
                    4- adicionar telefone a um contato
                    5- adicionar email a um contato
                    6- atualizar o telefone de um contato
                    7- atualizar o email de um contato
                    8- Remover o telefone de um contato
                    9- Remover o email de um contato
                    10- Mostrar lista completa de contatos
                    11- Sair da Agenda
                    """);
            return Integer.parseInt(IO.readln("Digite uma opção: "));
    }

    static void main() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        int opcao;
        do {
            opcao = menu();
            switch (opcao){
                case 1 -> {
                    String nome = IO.readln("Digite o nome: ");
                    String sobrenome = IO.readln("Digite o sobrenome: ");
                    String dataNasc = IO.readln("Digite a data de nascimento (AAAA-MM-DD): ");
                    Contato c = new Contato(nome, sobrenome, LocalDate.parse(dataNasc));
                    if (agenda.addContato(c)) {
                        IO.println("Contato adicionado!");
                    }else {
                        IO.println("Erro ao adicionar o contato");
                    }
                }
                case 2 -> {
                    String nome = IO.readln("Digite o nome: ");
                    String sobrenome = IO.readln("Digite o sobrenome: ");
                    IO.println(agenda.findContato(nome, sobrenome).toString());
                }
                case 3 -> {
                    IO.println(agenda);
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.removeContato(indice)){
                        IO.println("Contato removido");
                    }else {
                        IO.println("Não foi possivel remover o contato");
                    }
                }
                case 4 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    String valor = IO.readln("Digite o numero: ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.addTelefone(rotulo,valor,indice)){
                        IO.println("Telefone adicionado");
                    }else {
                        IO.println("Não foi possivel adicionar o telefone");
                    }
                }
                case 5 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    String valor = IO.readln("Digite o email: ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.addEmail(rotulo,valor,indice)){
                        IO.println("Email adicionado");
                    }else {
                        IO.println("Não foi possivel adicionar o Email");
                    }
                }
                case 6 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    String valor = IO.readln("Digite o telefone (\"+## (##) #####-####\"): ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.updateTelefone(rotulo,valor,indice)){
                        IO.println("Telefone atualizado");
                    }else {
                        IO.println("Não foi possivel atualizar o telefone");
                    }
                }
                case 7 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    String valor = IO.readln("Digite o Email: ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.updateEmail(rotulo,valor,indice)){
                        IO.println("Email atualizado");
                    }else {
                        IO.println("Não foi possivel atualizar o Email");
                    }
                }
                case 8 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.removeTelefone(rotulo,indice)){
                        IO.println("Telefone removido");
                    }else {
                        IO.println("Não foi possivel remover o telefone");
                    }
                }
                case 9 -> {
                    String rotulo = IO.readln("Digite o rotulo: ");
                    int indice = Integer.parseInt(IO.readln("Digite o indice do contato: "));
                    indice --;
                    if(agenda.removeEmail(rotulo,indice)){
                        IO.println("Email removido");
                    }else {
                        IO.println("Não foi possivel remover o Email");
                    }
                }
                case 10 -> IO.println(agenda);
                case 11 -> IO.println("Encerrando sistema...");
                default -> IO.println("Opção inválida");
            }
        } while (opcao != 11);
    }
}

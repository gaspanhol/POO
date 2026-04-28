package POO;

import java.util.ArrayList;

public class AgendaTelefonica {

    private ArrayList<Contatos> contatos = new ArrayList<>();

    public AgendaTelefonica() {
    }

    public ArrayList<Contatos> findContato(String nome, String sobrenome){
        //TODO fazer esse método
        return contatos;
    }

    public boolean removeContato(int IndiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean addTelefone (String rotulo, String valor, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean addEmail (String rotulo, String valor, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean updateTelefone (String rotulo, String valor, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean updateEmail (String rotulo, String valor, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean removeTelefone (String rotulo, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    public boolean removeTEmail (String rotulo, int indiceContatoNaLista){
        //TODO fazer esse método
        return true;
    }

    @Override
    public String toString() {
        //TODO fazer esse método
        return "teste";
    }
}

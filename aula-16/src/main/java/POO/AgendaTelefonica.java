package POO;

import java.util.ArrayList;

public class AgendaTelefonica {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public AgendaTelefonica() {
    }

    public boolean addContato (Contato contato) {
        return contatos.add(contato);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> contatosEncontrados = new ArrayList<>();
        contatos.forEach(contatos -> {
            if (contatos.getNome().equals(nome) && contatos.getSobrenome().equals(sobrenome)){
                contatosEncontrados.add(contatos);
            }
        });
        return contatosEncontrados;
    }

    public boolean removeContato(int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.remove(indiceContatoNaLista);
            return true;
        }else {
            return false;
        }
    }

    public boolean addTelefone (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).addTelefone(rotulo, valor);
            return true;
        }else {
            return false;
        }
    }

    public boolean addEmail (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).addEmail(rotulo, valor);
            return true;
        }else {
            return false;
        }
    }

    public boolean updateTelefone (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).updateTelefone(rotulo, valor);
            return true;
        }else {
            return false;
        }
    }

    public boolean updateEmail (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).updateEmail(rotulo, valor);
            return true;
        }else {
            return false;
        }
    }

    public boolean removeTelefone (String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).removeTelefone(rotulo);
            return true;
        }else {
            return false;
        }
    }

    public boolean removeEmail (String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            contatos.get(indiceContatoNaLista).removeEmail(rotulo);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("contatos=").append(contatos).append("\n");
        return sb.toString();
    }
}

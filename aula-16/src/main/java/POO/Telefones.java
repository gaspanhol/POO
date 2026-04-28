package POO;

import java.util.HashMap;

public class Telefones {

    private HashMap<String, String> telefones = new HashMap<>();

    public boolean add (String rotulo, String valor){
        if (telefones.containsKey(rotulo)) {
            return false;
        } else {
            if (verificarTelefones(valor)){
                telefones.put(rotulo, valor);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean remove (String rotulo) {
        if (telefones.containsKey(rotulo)) {
            telefones.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(String rotulo, String valor) {
        if (telefones.containsKey(rotulo) && verificarTelefones(valor)) {
            telefones.replace(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarTelefones (String valor){
        String eR = "^[0-9]+$";
        return valor.matches(eR);
    }

    @Override
    public String toString() {
        //TODO fazer o toString de telefones com a mascara dos slides
        return telefones.toString();
    }
    
}

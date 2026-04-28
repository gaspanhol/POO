package POO;

import java.util.HashMap;

public class Email {

    private HashMap <String, String> email = new HashMap<>();

    public boolean add (String rotulo, String valor){
        if (email.containsKey(rotulo)) {
            return false;
        } else {
            if (verificarEmail(valor)){
                email.put(rotulo, valor);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean remove (String rotulo) {
        if (email.containsKey(rotulo)) {
            email.remove(rotulo);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(String rotulo, String valor) {
        if (email.containsKey(rotulo) && verificarEmail(valor)) {
            email.replace(rotulo, valor);
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarEmail (String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return valor.matches(eR);
    }

    @Override
    public String toString() {
        //TODO fazer o toString de emails
        return email.toString();
    }
}

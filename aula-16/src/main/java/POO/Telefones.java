package POO;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
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

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        telefones.forEach((rotulo, valor) -> {
            sb.append(rotulo)
                    .append(": ")
                    .append(this.formata("+## (##) #####-####",valor))
                    .append("\n");
        });
        return sb.toString();
    }
    
}

package aula04;

public class SwitchCase {
    void main(){
        int i=1;
        String s = "";
        
        switch (i) {
            case 1:
                s = "Um";
            break;

            default:
                s = "Outro";
            break;
        }
        
       
        // String c = switch (i) {
        //     case 1 -> "Um";
        //     default -> "Outro";
        // };


    }
}

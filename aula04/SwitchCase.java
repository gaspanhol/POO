package aula04;

public class SwitchCase {
    void main(){
        int i=1;
        String s = "";
        /*
        switch (i) {
            case 1:
                s = "Um";
                System.out.println(s);
            break;

            default:
                s = "Outro";
                System.out.println(s);
            break;
        }
        */
       
        String c = switch (i) {
            case 1 -> "Um";
            default -> "Outro";
        };


    }
}

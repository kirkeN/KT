import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kirke on 28.01.2016.
 */
public class Kassa {
    private String kassapidaja;
    private ArrayList<String> tooted = new ArrayList();

    Kassa (String kassapidaja){
        this.kassapidaja = kassapidaja;
    }

    public void lisaToode(String toode){
        tooted.add(toode);
    }

    public void eemaldaToode (String toode){
        tooted.remove(toode);
    }

    public StringBuilder votaTooted(){
        StringBuilder sb = new StringBuilder();
        for (String s : tooted) {
            sb.append(s);
                sb.append("\n");
        }return sb;
    }

    public int votaToodeteArv(){
        int arv = tooted.size();
        return arv;
    }

    public String votaKassapidajaNimi(){
        return this.kassapidaja;
    }

    public void kliendilPoleRaha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Millisest tootest loobute?");
        String toode = sc.nextLine();
        tooted.remove(toode);
    }
}

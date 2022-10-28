import java.sql.Timestamp;
import java.util.*;

public class Main {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {

        Macchina parcheggio[] = new Macchina[10];

        System.out.println("inserire targa");
        parcheggio[0] = new Macchina(in.next(),
                System.currentTimeMillis());
        System.out.println("inserire targa");
        parcheggio[1] = new Macchina(in.next(),
                System.currentTimeMillis());
        System.out.println("inserire targa");
        parcheggio[2] = new Macchina(in.next(),
                System.currentTimeMillis());

        System.out.println("che macchina vuoi far uscire");
        String exit = in.next();
        long secondi;
        int i;
        for (i = 0; i < parcheggio.length; i++) {
            if (parcheggio[i] != null) {
                System.out.println("In posizione " + i + " veicolo " + parcheggio[i].getTarga() +
                        " al timestamp " + parcheggio[i].getIngresso().getTime());
                if (parcheggio[i].getTarga().equals(exit)) {
                    parcheggio[i].setUscita(System.currentTimeMillis());
                    secondi = (parcheggio[i].getUscita().getTime() - parcheggio[i].getIngresso().getTime()) / 1000;
                    System.out.println("sono passati " + secondi);
                    break;
                }
            }
        }
        parcheggio[i] = null;
    }
}
















//parcheggio da 10 macchine
//procedura per inserimento tappa
//che crea oggetto con timestamp attuale
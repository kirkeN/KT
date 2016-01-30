import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    //proovin midagi muuta ajeeeee
    public static void main(String[] args) {

        System.out.println(allaMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int allaMediaani(int[] ints) {
        int summa = 0;
        int allaMediaani=0;
        for (int i = 0; i < ints.length; i++) {
            if (60<ints[i]){
                ints[i]=60;
            }
            summa+=ints[i];
        }
        for (int i = 0; i <ints.length ; i++) {
            Arrays.sort(ints);
            int mediaan = ints[ints.length/2];
            if(ints[i]<mediaan){
                //System.out.println(ints[i]);
                allaMediaani+=1;
            }
        }
        return allaMediaani;
    }

}

import java.util.Arrays;
import java.util.List;

public class Liste3 {
    public static void main(String[] args) {

        //Klasa Arrays - klasa za rad nam nizovima


        int[] x = {1,3,2,5,4};
        System.out.println(Arrays.toString(x));  //Moze da ispise lakse niz ovako

        int[] y = {1,2,3,4,5};
        System.out.println(Arrays.equals(x,y));  //Da li su elementi isti kao i broj elemenata u ova dva niza

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));  //Njihovo sortiranje redom

        Arrays.sort(x,1,3);
        System.out.println(Arrays.toString(x));    //Sortiranje od indexa do indexa


        //Kreacija obicne liste

        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        System.out.println(lista);

    }
}

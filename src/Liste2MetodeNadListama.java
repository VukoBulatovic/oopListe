import java.util.ArrayList;

public class Liste2MetodeNadListama {
    public static void main(String[] args) {

                                         //METODE NAD LISTAMA


        ArrayList<Integer> al = new ArrayList<>();

                                        //Dodavanje elemenata:

        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);

        al.add(1);
        System.out.println(al);  //dodaje na kraju liste

        al.add(2,-222); //umece vrijednost na indeksu 2, a ostale pomjera udesno
        System.out.println(al);

        al.add(0,-1); // umece element na pocetak a ostali se pomjeraju za jedno mjesto
        System.out.println(al);


                                    //Brisanje elemenata iz liste:

        //al.remove(int index) - brise element iz liste na tom indexu
        //al.remove(Object o) - brise taj konkretan element ali samo njegovo prvo pojavljivanje

        al.remove(1);  //- brise element iz liste na tom indexu
        System.out.println(al);

        al.remove(Integer.valueOf(-222));  //brise taj konkretan element ali samo njegovo prvo pojavljivanje
        System.out.println(al);


                                            //Duzina niza

        System.out.println("Duzina niza je : " + al.size());



                                            //Dohvatanje elemenata

        int prviElement = al.get(0);
        int drugiElement = al.get(1);
        int posednjiElement = al.get(al.size()-1);
        System.out.println("Zbir prvog i drugog elementa je: " + (prviElement + drugiElement));
        System.out.println("Poslednji element je: " + posednjiElement);




                                            //Ciscenje celog niza

        // al.clear();
        // System.out.println(al);



                                            //Da li je prazna lista

        System.out.println(al.isEmpty());



                                            //Postavljanje elemenata

        al.set(1,101); //postavljamo na indexu 1 vrednost 101, odnosno zamjenjujemo
        System.out.println(al);



                                            //Da li lista sadrzi neki element

        System.out.println("Da li se u listi nalazi broj 0 ? " + al.contains(0));
        System.out.println("Da li se u listi nalazi broj 1 ? " + al.contains(1));

    }
}

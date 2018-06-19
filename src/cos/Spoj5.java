package cos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;




public class Spoj5 {


    public static void main(String[] args) {


        oblicz();
    }

    public static void oblicz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb :");
        int n = scanner.nextInt();
        Integer tablica[] = new Integer[n];

        for (int i=0; i<tablica.length; i++){
            System.out.println("Podaj liczbe :");
            tablica[i] = scanner.nextInt();


        }



        Arrays.sort(tablica, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });

        System.out.println(Arrays.toString(tablica));
    }


}

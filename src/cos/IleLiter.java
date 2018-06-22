package cos;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class IleLiter {

    /*
    Zliczanie wystąpienia dalej litery w zdaniu

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zdanie :");
        String zdanie = scanner.nextLine();
        System.out.println("Podaj litere");
        char litera= scanner.next().charAt(0);
        zliczanie(zdanie,litera);

    }

    public static void zliczanie(String zdanie, char litera){
        int counter =0;
        for(int i=0; i< zdanie.length(); i++){

            char literyWzdaniu = zdanie.charAt(i);

            if(literyWzdaniu == litera){
                counter++;
            }
        }

        System.out.println("W zdaniu : " + zdanie + " litera " + litera + " wystepowala : " + counter + " razy.");

    }
}

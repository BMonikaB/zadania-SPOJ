package cos;
/*
KC001 - Dodawanie liczb całkowitych
Napisz program, który oblicza sumę trzech liczb całkowitych.

Wejście
Na wejście programu podane zostaną trzy liczby całkowite (nieprzekraczające 100) rozdzielone znakiem nowej linii.

Wyjście
Na wyjściu ma się pojawić suma liczb, które pojawiły się na wejściu.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DodawanieLiczbCalkowitych {

    public static void main(String[] args) {
        dodawanie();
    }

    public static void dodawanie(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<3;i++){
            lista.add(scanner.nextInt());
        }

        int suma = lista.get(0) + lista.get(1) + lista.get(2);
        System.out.println(suma);

    }
}

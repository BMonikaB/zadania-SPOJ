package cos;

/*
PP0502B - Tablice
Odwróć kolejność elementów w tablicy.

Wejście
Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (n ≤ 100) i n liczb oddzielonych spacjami.

Wyjście
Dla każdego testu n liczb w porządku odwrotnym niż na wejściu.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Tablice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

int ile = scanner.nextInt();

        for (int j = 0; j < ile; j++) {


            List<Integer> liczby = new ArrayList<>();


            int ileLiczb = scanner.nextInt();


            for (int i = 0; i < ileLiczb; i++) {
                liczby.add(scanner.nextInt());
            }
            Collections.reverse(liczby);

            for (Integer ini : liczby) {
                System.out.print(ini + " ");
            }
        }
    }
    }



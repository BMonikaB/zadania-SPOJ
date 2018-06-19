package cos;



/*
PP0501A - NWD
Napisz funkcję:

 int nwd(int a, int b);
która oblicza największy wspólny dzielnik liczb a i b,

 0 <= a,b <= 1000000
Input


W pierwszej linii liczba testów t, w kolejnych liniach po dwie liczby w każdym wierszu.

Output
W każdej linii jedna liczba - wynik działania funkcji nwd
**/
import java.util.Scanner;
public class NWD {


    public static void main(String[] args) {

        nwd();


    }

    public static void nwd() {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a != b) {

                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

            System.out.println(a);
        }
    }
}


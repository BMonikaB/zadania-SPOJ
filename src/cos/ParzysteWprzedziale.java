package cos;

/*
FR_09_10 - Parzyste w przedziale
Parzyste w przedziale

Jedno zadanie na konkursie musi być trywialne. Oto ono.
Z podanego przedziału otwartego wypisz rosnący ciąg liczb parzystych.

Wejście
W pierwszym wierszu wejścia znajduje się liczba całkowita d (1 ≤ d ≤ 10) oznaczająca liczbę przypadków testowych. Każdy przypadek testowy to dwie liczby całkowite a, b (1 ≤ a < b ≤ 105).

Wyjście
Dla każdego przypadku testowego, w osobnym wierszu, wypisz rosnący ciąg liczb parzystych lub słowo BRAK, gdy nie istnieje taki ciąg.
 */



import java.util.Scanner;

public class ParzysteWprzedziale {

    public static void main(String[] args) {
patrzenie();
    }

    public static void patrzenie(){
        Scanner scanner = new Scanner(System.in);
        int ileLiczb = scanner.nextInt();
       for(int i=0; i<ileLiczb; i++){

           int a = scanner.nextInt(); //3
           int b = scanner.nextInt(); //9

           if(a%2!=0) {
               for (int p = a; a < b; a++) {
                   if (a % 2 == 0) {
                       System.out.print(a + " ");
                   }
               }
           }

           else if(a%2==0){
               for (int p = a;  a<b; a++) {  //4 5 6 7 8
                   if (a % 2 == 0) { //4 6 8
                       if(a > p) {
                           System.out.print(a + " ");
                       }
                   }
               } }







       }


    }
}

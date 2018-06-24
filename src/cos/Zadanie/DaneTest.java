package cos.Zadanie;

import java.util.Scanner;

public class DaneTest {

    public static final int ADD_PERSON = 1;
    public static final int PRINT_PERSON =2;
    public static final int EXIT = 3;
    public static final int POSORTUJ = 4;

  private static   Dane dane = new Dane();
  private static   DaneApp daneApp = new DaneApp();
  private static Scanner scanner = new Scanner(System.in);



    public static void run(){


int choose=-1;
        do {

            opcje();
            choose = scanner.nextInt();
            switch (choose) {

                case ADD_PERSON:
                    addPerson();
                    break;
                case PRINT_PERSON:
                    daneApp.print();
                    break;
                case EXIT:
                    System.out.println("BYE BYE!");
                    break;
                case POSORTUJ:
                    daneApp.kolejnosc();
                    break;


                    default:System.out.println("Nie ma takiej mozliwosci!");

            }
        }
        while (choose!=3);

    }


    public static void opcje(){
        System.out.println("1 - dodaj osobe");
        System.out.println("2 - wyswietl");
        System.out.println("3 - wyjdz");
        System.out.println("4 - posortuj");
    }

    public static void addPerson(){
        System.out.println("Podaj imie :");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Podaj nazwisko :");
        String lastName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Podaj czas biegu :");
        int czas = scanner.nextInt();
        scanner.nextLine();


        daneApp.add(new Dane(name,lastName,czas));

    }


}

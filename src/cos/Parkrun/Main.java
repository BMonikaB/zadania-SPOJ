package cos.Parkrun;


import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    ParkrunDwa parkrunDwa = new ParkrunDwa();
    Parkrun parkrun = new Parkrun();

    public static void main(String[] args) {

        Main parkrunTest = new Main();
        parkrunTest.addPerson();


    }

    public void addPerson() {
        int ile = scanner.nextInt();

        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj imie :");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Podaj nazwisko :");
            String lastName = scanner.nextLine();
            System.out.println("Podaj czas biegu :");
            String czas = scanner.nextLine();
            parkrun.add(new ParkrunDwa(name,lastName,czas));

        }
        parkrun.print();
    }
}

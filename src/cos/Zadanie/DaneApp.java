package cos.Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DaneApp {

    private ArrayList<Dane> daneOsob;
    private Scanner scanner = new Scanner(System.in);

    DaneApp(){
        daneOsob = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void add(Dane dane){
        daneOsob.add(dane);
    }
    public void print(){
        for(Dane d: daneOsob){
            System.out.println(d + " ");
        }
    }

    public void kolejnosc(){
        Collections.sort(daneOsob);
        for(Dane dane : daneOsob){
            System.out.println(dane+ " ");
        }
    }


}

package cos.Parkrun;

import cos.ParkrunDwa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Parkrun {


    ArrayList<ParkrunDwa> lista = new ArrayList<>();

    public void add(ParkrunDwa parkrunDwa){
        lista.add(parkrunDwa);
    }
    public void print(){

        Collections.sort(lista);
        for(ParkrunDwa p: lista){
            System.out.println(p + " ");
        }
    }


}
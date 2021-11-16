package com.company;
import com.company.AvtoparkComparator;
import com.company.Avtopark;
import com.company.AvtoparkEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import  java.util.Comparator;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Avtopark> avtobus = new ArrayList<Avtopark>() {
            {
                add(new Avtopark("Transbus", 83, 24));

                add(new Avtopark("Astrabus", 91, 19));

                add(new Avtopark("AstanaTrans", 88, 17));
            }
        };
        Avtopark avt = new Avtopark();
        System.out.println("\n Найти список автобус машрута № 83");
        ArrayList<Avtopark> avtobus1= avt.findMashryt(avtobus);
       for (int i = 0; i < avtobus.size(); i++) {
            avt=(Avtopark)avtobus1.get(i);
           System.out.println(avt.toString());}
        int kol=0;
        for (int i = 0; i < avtobus.size(); i++) {
            avt = (Avtopark) avtobus.get(i);
            kol+=avt.getPassagir();

        } System.out.println("KOli4estvapassa="+kol);

        System.out.println("\nСортировка по номеру маршрута");
        Collections.sort(avtobus, new AvtoparkComparator(AvtoparkEnum.MASHRYT));
        for (int i = 0; i < avtobus.size(); i++) {
            avt = (Avtopark) avtobus.get(i);
            System.out.println(avt.toString());
        }

    }
}

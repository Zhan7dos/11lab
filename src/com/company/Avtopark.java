package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Avtopark {
    public Object get;
    private String avtpark;
    private int mashryt;
    private int passagir;

    public String getAvtpark() {
        return avtpark;
    }
    public void setAvtpark(String avtpark) {
        this.avtpark = avtpark;
    }
    public int getMashryt() {
        return mashryt;
    }
    public void setMashryt(int mashryt) {
        this.mashryt = mashryt;
    }
    public int getPassagir() {
        return passagir;
    }
    public void setPassagir(int passagir) {
        this.passagir = passagir;
    }

    public Avtopark(String avtpark, int mashryt, int passagir) {
        this.avtpark = avtpark;
        this.mashryt = mashryt;
        this.passagir = passagir;
    }

    public Avtopark(){
        super();
    }

    @Override
    public String toString() {
        return "Avtopark{" +
                "avtpark='" + avtpark + '\'' +
                ", mashryt=" + mashryt +
                ", passagir=" + passagir +
                '}';
    }

}

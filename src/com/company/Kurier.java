package com.company;

public class Kurier {
    String imie;
    String nazwisko;

    public Kurier(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    @Override
    public String toString() {
        return "Kurier{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}

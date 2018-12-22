package com.company;

public class Adres {
    private String ulica;
    private String kodPocztowy;

    public Adres(String ulica, String kodPocztowy) {
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}
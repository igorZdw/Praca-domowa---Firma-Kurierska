package com.company;

public class Przesylka {
    private Adres adresDostawy;

    public Przesylka(Adres adresDostawy) {
        this.adresDostawy = adresDostawy;
    }

    public Adres getAdresDostawy() {
        return adresDostawy;
    }

    @Override
    public String toString() {
        return "Przesylka{" +
                "adresDostawy=" + adresDostawy +
                '}';
    }
}

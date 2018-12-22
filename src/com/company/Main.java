package com.company;

import com.company.Sortownia;


public class Main {
    public static void main(String[] args) {
        Sortownia sortownia = new Sortownia();

        sortownia.dodajPrzesylke(new Przesylka(new Adres("Fiołkowa 8", "00-123")));
        sortownia.dodajPrzesylke(new Przesylka(new Adres("Kwiatowa 10", "11-123")));
        sortownia.dodajPrzesylke(new Przesylka(new Adres("Szybka 3/4a", "11-789")));
        sortownia.dodajPrzesylke(new Przesylka(new Adres("Lotnicza 1", "22-222")));

        sortownia.zatrudnijKuriera(new Kurier("Thomas", "Shelby"), Region.REGION_A);
        sortownia.zatrudnijKuriera(new Kurier("Jan", "Nowak"), Region.REGION_A);
        sortownia.zatrudnijKuriera(new Kurier("Ragnar", "Lordbrock"), Region.REGION_B);
        sortownia.zatrudnijKuriera(new Kurier("Tomasz", "Frankowski"), Region.REGION_C);

        sortownia.wyswietlListePrzesylek();
    }
}
package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sortownia {

    private List<Przesylka> przesylki = new ArrayList<>();
    private Map<Region, List<Kurier>> kurierzy = new HashMap<>();

    public void dodajPrzesylke(Przesylka Przesylka) {
        przesylki.add(Przesylka);
    }

    public void zatrudnijKuriera(Kurier kurier, Region region) {
        List<Kurier> dostepniKurierzy = kurierzy.get(region);
        if (dostepniKurierzy == null) {
            dostepniKurierzy = new ArrayList<>();

        }
        dostepniKurierzy.add(kurier);
        kurierzy.put(region, dostepniKurierzy);
    }

    public void wyswietlListePrzesylek() {
        for (Przesylka przesylka : przesylki) {
            Adres adresDostawy = przesylka.getAdresDostawy();
            Region regionDostawy = znajdzRegion(adresDostawy);
            List<Kurier> dostepniKurierzy = kurierzy.get(regionDostawy);
            System.out.println(przesylka + " może być dostarczona przez następujących kurierów: " + dostepniKurierzy);
        }
    }

    private Region znajdzRegion(Adres adres) {
        for (Region region : Region.values()) {
            if (region.czyZawiera(adres)) {
                return region;
            }
        }
        return null;
    }
}
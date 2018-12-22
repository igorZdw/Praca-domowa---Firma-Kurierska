package com.company;

public enum Region {
    REGION_A("0X-XXX"),
    REGION_B("1X-XXX"),
    REGION_C("2X-XXX");


    String szablonKodu;

    Region(String szablonKodu) {
        this.szablonKodu = szablonKodu;
    }

    boolean czyZawiera(Adres adres) {
        String pierwszyZnakSzablonuKoduPocztowego = szablonKodu.substring(0, 1);
        return adres.getKodPocztowy().startsWith(pierwszyZnakSzablonuKoduPocztowego);
    }
}

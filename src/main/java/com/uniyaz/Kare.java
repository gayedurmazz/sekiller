package com.uniyaz;

public class Kare extends Sekil implements KosegenCizebilir {

    private int en, boy, koseKoordinati;

    public double alanHesapla() {
        double alan;
        alan = en * boy;
        return alan;
    }


    public void kosegenCiz(int koseKoordinati) {
        System.out.println("Köşegen çizildi varsayalım :) ");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKoseKoordinati() {
        return koseKoordinati;
    }

    public void setKoseKoordinati(int koseKoordinati) {
        this.koseKoordinati = koseKoordinati;
    }
}

package com.uniyaz;

public class Ucgen extends Sekil {

    private int taban, yukseklik;

    public double alanHesapla() {
        double alan;
        alan = (taban*yukseklik)/2;
        return alan;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }
}

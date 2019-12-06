package com.uniyaz;

import static java.lang.Math.pow;

public class Daire extends Sekil {

    private double piSayisi;
    private int yariCap;
    public double alanHesapla() {
        double alan;
        alan = piSayisi*pow(yariCap,2);
        return alan;
    }

    public double getPiSayisi() {
        return piSayisi;
    }

    public void setPiSayisi(double piSayisi) {
        this.piSayisi = piSayisi;
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }
}

package com.uniyaz;

public abstract class Sekil {
    private String ad;

    public abstract double alanHesapla();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}

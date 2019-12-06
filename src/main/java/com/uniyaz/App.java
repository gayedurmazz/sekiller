package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        List<String> sekilAdlariList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        List<Sekil> sekilList = new ArrayList<Sekil>();
        boolean girdiDevami = true;
        String sekilAdi;
        String cevap;

        System.out.println("Alanı hesaplanacak şekillerin adını giriniz: ");
        while (girdiDevami){
        System.out.println("Alanı hesaplanacak şekillerin adını giriniz: ");
        sekilAdi = scanner.nextLine();
        sekilAdlariList.add(sekilAdi);
            System.out.println("Bir şekil daha var mı ? Y/N");
            cevap = scanner.nextLine();
            if (cevap.equals("N")){
                girdiDevami = false;
            }
        }

        for (String adListItem : sekilAdlariList) {
            if (adListItem.equals("Kare")) {
                Kare kare = new Kare();
                kare.setAd("Kare");
                kare.setEn(5);
                kare.setBoy(10);
                sekilList.add(kare);

            } else if (adListItem.equals("Ucgen")) {
                Ucgen ucgen = new Ucgen();
                ucgen.setAd("Ucgen");
                ucgen.setTaban(15);
                ucgen.setYukseklik(2);
                sekilList.add(ucgen);

            } else if (adListItem.equals("Daire")) {
                Daire daire = new Daire();
                daire.setAd("Daire");
                daire.setPiSayisi(3.14);
                daire.setYariCap(5);
                sekilList.add(daire);
            }
        }
            alanHesaplatır(sekilList);
    }
    public static void alanHesaplatır (List < Sekil > sekilList) {
        for (Sekil sekil : sekilList) {
            double alan = sekil.alanHesapla();
            System.out.println(sekil.getAd() + " şeklinin alanı:  " + alan);
        }
    }
}


package com.wendyliga.terbilang;

public class terbilangUtils {

    static String huruf[] = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public static String bilangan(Long angka) {
        if (angka < 12) {
            return huruf[angka.intValue()];
        }
        if (angka >= 12 && angka <= 19) {
            return huruf[angka.intValue() % 10] + " Belas";
        }
        if (angka >= 20 && angka <= 99) {
            return bilangan(angka / 10) + " Puluh " + huruf[angka.intValue() % 10];
        }
        if (angka >= 100 && angka <= 199) {
            return "Seratus " + bilangan(angka % 100);
        }
        if (angka >= 200 && angka <= 999) {
            return bilangan(angka / 100) + " Ratus " + bilangan(angka % 100);
        }
        if (angka >= 1000 && angka <= 1999) {
            return "Seribu " + bilangan(angka % 1000);
        }
        if (angka >= 2000 && angka <= 999999) {
            return bilangan(angka / 1000) + " Ribu " + bilangan(angka % 1000);
        }
        if (angka >= 1000000 && angka <= 999999999) {
            return bilangan(angka / 1000000) + " Juta " + bilangan(angka % 1000000);
        }
        if (angka >= 1000000000 && angka <= 999999999999L) {
            return bilangan(angka / 1000000000) + " Milyar " + bilangan(angka % 1000000000);
        }
        if (angka >= 1000000000000L && angka <= 999999999999999L) {
            return bilangan(angka / 1000000000000L) + " Triliun " + bilangan(angka % 1000000000000L);
        }
        if (angka >= 1000000000000000L && angka <= 999999999999999999L) {
            return bilangan(angka / 1000000000000000L) + " Quadrilyun " + bilangan(angka % 1000000000000000L);
        }

        return "";
    }
}

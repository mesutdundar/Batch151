package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> iller = new ArrayList<>(Arrays.asList("Van", "GumusHANE", "MUS", "Ankara", "Kutahya", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        bykHrfLenghtArtanSiradaTkrsz(iller);
        System.out.println();
        ykHrfSonHarflerineGoreArtanSiradaTkrsz(iller);
        System.out.println();
        bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(iller);
        System.out.println();
        System.out.println(krktrSysBesFzlOlnlriSil(iller));
        System.out.println();
        System.out.println(hIleBaslayanUIleBitenElSil(iller));
        System.out.println();
    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanSiradaTkrsz(List<String> iller) {
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//Lambda expression
                sorted(Comparator.comparing(t -> t.length())).//Lambda expression
                forEach(t -> System.out.print(t + " "));
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void ykHrfSonHarflerineGoreArtanSiradaTkrsz(List<String> iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//Lambda expression
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//Lambda expression
                forEach(t -> System.out.print(t + " "));//Lambda expression
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(List<String> iller) {
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase). //method referansation
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).//2.bolum == Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
                forEach(System.out::println);//method referansation
    }

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> krktrSysBesFzlOlnlriSil(List<String> iller) {
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);
        return iller;
    }
    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanUIleBitenElSil(List<String> iller) {
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
        return iller;
    }
}
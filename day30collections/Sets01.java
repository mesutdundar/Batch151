package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 1) Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
 2) 3 tane Set Class vardir;
      i)HashSet Class:
        "Hash" benzersiz id olusturma teknigidir.Bu teknige "Hashing Technique" denir.
        "HashSet" elemanlari rastgele siralar.
        "HashSet" elemanlari siralamadigindan cok hizli calisir.
        "HashSet"ler tekrarsiz eleman depolamak icindir.
        "HashSet"ler null'i eleman olarak kabul eder.


      ii)LnkedHashSet Class:
          "LinkHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order) "HashSet"lere gore yavastir.
          "LinkHashSet"ler tekrarsiz eleman depolamak icindir.


      iii)TreeSet Class:
               "TreeSet"ler elemanlari natural order'a gore dizer.
               "TreeSet'ler elemanlari natural order'a gore dizdiklerinden cooooookkk yavastirlar.
               EN YAVAS SET TreeSet'tir.
               "TreeSet'lere null eklenemez!

     3) TreeSetcok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz.
               

 */
public class Sets01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);
        System.out.println("hs = " + hs);
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println("lhs = " + lhs);//lhs = [234, 87, -32, 124]

        LinkedHashSet<Integer> ls =new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);//ilk LinkedHashSet'teki farkli elemanlar silindi.
        System.out.println(ls);

        TreeSet<Character> ts =new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');

  //treesetlere null eklenemez!!!
        System.out.println(ts);

        System.out.println("ts.first() = " + ts.first());//A
        System.out.println("ts.last() = " + ts.last());//Z
        System.out.println(ts.lower('R'));//G   verilen eleman olan 'R'den bir onceki elemani verir.
        System.out.println(ts.lower('D'));//A   olmayan bir eleman da yazsak en yakin bir oncekini verir. (natural order)
        System.out.println(ts.lower('A'));//null
        System.out.println("ts.higher('K') = " + ts.higher('K'));//R Verilen K 'den sonraki elemani verir.

        System.out.println("ts.headSet('R') = " + ts.headSet('R'));//R'ye kadar olan elemanlari verir (R dahil degildir)
        System.out.println( ts.headSet('R', true));//R'yi dahil etmek icin inclusive li olani kullanabiliriz.

        System.out.println("ts.tailSet('R') = " + ts.tailSet('R'));//R'den sonrakileri verir. (R dahildir)
        System.out.println("ts.tailSet('R',false) = " + ts.tailSet('R', false));//R'yi dahil etmek icin bunu kullandik!

        System.out.println(ts.ceiling('R'));//R ==> eleman set'in icinde varsa elemanin kendisi return eder.
        System.out.println(ts.ceiling('K'));//R ==> eleman set'in icinde yoksa sonraki eleman return eder.

        System.out.println(ts.floor('G'));//G ==> Eleman set'in icinde varsa elemanin kendisi return eder.
        System.out.println(ts.floor('J'));//G eleman setin icinde yoksa onceki elemani return eder.


        System.out.println(ts.subSet('G', 'Z'));//[G, R, U] ==> Ilkarametre dahil ikinci parametre  haric
        System.out.println(ts.subSet('G', false, 'Z', true));//[R, U, Z]


    }

}

package day38enumsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

        /*
            1)Iterator'lar loop'larin yaptigi ayni isi yapar.
            2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
            3)Iterator'lar ile loop'lar arasinda performan farki yoktur.
            4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
            5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                                eleman eklemek veya elemani degistirmek mumkun degildir.
                                    ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                    Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                         "ListIterator" ise iki yonlu calisabilir.
         */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        //"Iterator" kullanalim
        Iterator<String> myItr = myList.iterator();    // [ Tom,   Jim,   Clara,   Angie,   Mark ]

        while(myItr.hasNext()){//hasNext() pointer'a "Senden sonra eleman var mi?" diye sorar.
            //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();//next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList);// [ ]

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);// [ Tom,   Jim,   Clara ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.
        }
        System.out.println(yourList);// [ Tom!,   Jim!,   Clara! ]

        //hasPrevious() ve previous() nasil kullanilir?

        while (yourListItr.hasPrevious()){
            String el =yourListItr.previous();
            yourListItr.set("?"+el);
        }
        System.out.println(yourList);//[?Tom!, ?Jim!, ?Clara!]


    }

}
package day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 /*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.

            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
     */

public class HashMap01 {
    public static void main(String[] args) {
        //Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation =new HashMap<>();
        //Map'e entry nasil yapilir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        // get() methodu "key" ile calisir ve "value" kismini verir
       int usaPopulation= countryPopulation.get("USA");
        System.out.println(usaPopulation);

        //Butun "key"leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, Netherland, USA, Germany, Albania]


        //Butun "value"lari nasil alabilirim?
        Collection<Integer>values = countryPopulation.values();
        System.out.println(values);//[83000000, 18000000, 400000000, 83000000, 3000000]


        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?
        Collection<Integer>value = countryPopulation.values();
        int sum=0;
        for (Integer w:value) {
            sum=sum+w;
        }
        System.out.println(sum/value.size());


        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz.
        Set<Map.Entry<String ,Integer>> entries =countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]


       // Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
        int toplam = 0;
        for (Map.Entry<String,Integer> w:entries ) {
            toplam+= w.getKey().length()+w.getValue();

        }
        System.out.println(toplam);//587000034



    }

}

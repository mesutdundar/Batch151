package day29collections;
/*
ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
 */
/*
1)LinkedList'ler node silme ve ekleme de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla yapacaginiz zaman
  LinkedList kullaniniz
2)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
NOTE:Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi)LinkedList,
     "search" islemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullaniniz
 */

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");


        System.out.println("s = " + s);

      //  s.remove(2);
        System.out.println("s = " + s);
     //   s.remove("Ajdar");
        System.out.println("s = " + s);
    //    s.remove();
        System.out.println("s = " + s);
    //    s.removeFirstOccurrence("Esra");//tekrarli elemanlarda occurence kullanilirrr
        
        String r1 = s.peek();// ilk elemani silmeden size verir. (copy+paste)
        
        System.out.println("r1 = " + r1);
        System.out.println(s);
        
        String r2 =s.poll();// ilk elemani size verir ve listten siler! (cut + paste)
        System.out.println("r2 = " + r2);
        System.out.println(s);

       String r3 = s.element();//ilk elemani silmeden size verir (copy+paste)
        System.out.println("r3 = " + r3);
       //  NOTE :peek() ile element() ikisi de ilk elemani sileden size verir.
       //       Ama peek() list bos oludugunda size 'null' verir , element() ise 'hata' verir.



       String  r4 = s.pop();
        System.out.println("r4 = " + r4);
        // NOTE : pop()ve poll() ikisi de ilk elemani siler ve size verir.
              //  ama poll() list bos oldugunda size 'null' verir, pop() ise ' hata verir.
        





    }
}

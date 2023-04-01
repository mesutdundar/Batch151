package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistincUpp(names));
        System.out.println(sortWithLenghtReversedSameLenghtInNaturelOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneisLengthLessThanFour(names));
    }
    //Example 1:List elemanlarını son harflerine göre natural order da tekrarsız olarak buyuk harfle bir listin içinde return ediniz

    //Tom,Alex,Jim,Michael,Mary,Alexander,Alex ==>[MICHALE,TOM,JIM,ALEXANDER,ALEX,MARY]
    public static List<String>sortWithLastCharDistincUpp(List<String>names){
     return names.
             stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(toList());//normalde distinct elemanları depolamak için "Set"kullanılır
                                // ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
                                // rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
                               // Bu yuzden mecburen collect(Collectors.toList()); kullandik.

    }
    //Example 2:List elemanlarını character sayılarına  göre ters sırada kucuk harfle bir listin içinde return ediniz
    // aynı karakter sayısına sahip elemanlar kendi için de alfabetik sırada olsun
   //Tom,Alex,Jim,Michael,Mary,Alexander,Alex ==>[alexander, michael, alex, alex, mary, jim, tom]

public static List<String>sortWithLenghtReversedSameLenghtInNaturelOrderLowerInList(List<String>names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(toList());
}
//Example 3:List elemanlarının tamamının character sayısının 2 den buyuk olup olmadığını kontrol eden methodu oluşturunuz
public static boolean isLengthMoreThanTwo (List<String>names){
        return names.stream().allMatch(t->t.length()>2);
        //Bu soruda yeni olan seyler: allMatch methodu, elemanlarin karakter sayilarina bakip 2'den buyuk mu diye kontrol edecegiz.
    //Bunu normalde for each loop ile yapabiliriz. Ancak simdi Lambda ile cozecegiz.
    //Methodun return type'nin boolean olmasi mantikli. Parnatezi icine listimizi koyduk.
    //Sirasiyla names.stream().allMatch(t->t.length()>2)
    //Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
    //bakacak, 2'den buyukse true verecek aksi halde false verecek.
}


//Example 4:List elemanlarının tamamının character sayısının hiçbiri 3 den kucuk olup olmadığını kontrol eden methodu oluşturunuz

public static boolean noLengthLessThanThree(List<String>names){
        return names.stream().noneMatch(t->t.length()<3);
  //  Bu soruda yeni olan seyler: Elemanlarin hicbiri dendigine gore noneMatch methodu kullanilacak.
    //  Yine boolean bir method olusturduk. sirasiyla return names.stream().noneMatch(t->t.length()<3);
}
////Example 4:List elemanlarının en az birisinin character sayısının hiçbiri 4 den kucuk olup olmadığını kontrol eden methodu oluşturunuz
public static boolean atLeastOneisLengthLessThanFour(List<String>names){
    return names.stream().anyMatch(t->t.length()<4);
    /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */
}



    }

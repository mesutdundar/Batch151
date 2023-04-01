package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {


    //Example 1: Verilen cumledeki kelimelerin gorunmu sayisini veren kodu yaziniz
    //"I like you, like like!  => I=1, like=3, you=1

    String s="I like you, like like!";
    //like ile like! i ayni ypabilmek icin tum noktalama isaretlerini silelim.
        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim, bu yuzden split (" ") kullanacagim.
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Mapde var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'si 1 olarak yerestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirarak yerlestirilecek.

        for (String w:words) {
           Integer numOfOccurence = occ.get(w);
           if (numOfOccurence==null){
               occ.put(w,1);
           }else occ.replace(w,numOfOccurence+1);
        }
        System.out.println(occ);


    }
}

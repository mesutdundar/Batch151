package day42lambda;




import day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7, 10));
        System.out.println(getMultiplicationInTheGivenRange(10, 7));
        System.out.println(getSumOfDigitsInTheGivenRange(47, 45));

    }

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending){

        List<Integer> list = swap(starting,ending);
       return IntStream.rangeClosed(list.get(0),list.get(1)).sum();
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3: 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();

    }
}

package day34exceptions;

public class E01 {

        /*
            1)"Exception" beklenmedik problem demektir.
            2)"Exception" i halledebilmek icin iki temel yol vardir;
                i)"Exception" a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
                ii)"Exception" olustugunda bunu ilan eder ve geri cekilirisniz. Buna da "Throw Exception" denir.
            3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
              "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
              Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
              "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
            4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
         */

    public static void main(String[] args) {

        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));


    }

    //1.Way: Exception'i handle etmede ilk ve igrenc yol
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){//"ArithmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in division");
        }
        return result;
    }
}
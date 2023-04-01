package day35exceptions;

public class E03 {

        /*
            1)try block'dan sonra coklu catch block kullanilabilir.
              catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
              catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir.

            2)"Exception Class" tum Exception'larin parent'idir.
              Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
              tek catch block'i "Exception Class" ile kullanabilirsiniz.

            3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz.

            4) "try" catch block olmadan kullanilabilir mi?
               "try + finally" olabilir.
         */

    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));

    }

        //Example 1: Bir String'i integer'a ceviren ve bu integer'i String'in length'inin 1 eksigine bolen method'u olusturunuz



    public static int convertStringToIntDivideByLength1(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }
        return result;
    }

    public static int convertStringToIntDivideByLength2(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    public static int convertStringToIntDivideByLength3(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println("Jump");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
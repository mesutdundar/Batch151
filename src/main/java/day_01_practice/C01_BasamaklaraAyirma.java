package day_01_practice;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {
        // 12345 sayısının rakamları toplamını bulunuz
        int x = 12345;
        int lastDigit= x%10;
        x=x/10;
        int lastSecondDigit=x%10;
        x=x/10;
        int middleDigit=x%10;
        x=x/10;
        int secondDigit=x%10;
        x=x/10;
        int firstDigit=x%10;
        int total = lastDigit+lastSecondDigit+middleDigit+secondDigit+firstDigit;
        System.out.println("total = " + total);

        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz
        char a ='A';
        char b ='B';
        char c ='C';
        char d ='D';
        char e ='E';
        char f ='F';
        System.out.println(a+b+c+d+e+f);

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */
        int firstChar = 67;
        int secondChar =69;
        int thirdChar =77;
        System.out.print(""+((char)firstChar) + ((char)secondChar)+((char)thirdChar));
        

        
        
        
    }
}

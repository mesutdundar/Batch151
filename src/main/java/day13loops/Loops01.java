package day13loops;

public class Loops01 {
    //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
    public static void main(String[] args) {
        for (int i = 21; i <181 ; i++) {
            if (i%12==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz
        String city="miami";
        for (int i = 0; i <city.length() ; i++) {
            char a =city.charAt(i);
            if (i%2==0){
                a=Character.toUpperCase(a);

            }
            System.out.print(a);
        }

        System.out.println();

        //veyaa
        for (int i = 0; i <city.length() ; i++) {
            String str=city.substring(i,i+1);
            if (i%2==0){
                System.out.print(str.toUpperCase());
            }else System.out.print(str);
        }
        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        String str = "Tokatci";
        for (int i = 0; i <str.length() ; i++) {
            Character ch=str.charAt(i);//char
            if (ch.equals('a')){//ch=='a'
                break;
            }else System.out.print(ch);//Tok
        }
        System.out.println();
        //verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        for (int i =str.length()-1; i>-1 ; i--) {
            char a =str.charAt(i);
           if (a=='a'){
               break;
           }else System.out.print(a);//ict

        }

    }
}

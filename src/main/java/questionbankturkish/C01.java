package questionbankturkish;

public class C01 {
    public static void main(String[] args) {
        /* 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.

         */
        for (int i = 120; i >10 ; i--) {
            if (i%12==0){
                System.out.print(i+" ");
            }//120 108 96 84 72 60 48 36 24 12
        }
        /*
        Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
         Örneğin; accessories ´ ces
         */
//        String a ="accessories";
//
//
//        for (int i = 0; i <a.length() ; i++) {
//            char ch = a.charAt(i);
//            if (a.indexOf(ch) != a.lastIndexOf(ch)) {
//                System.out.print(ch);
//            }
//        }
            /*
            String y ="aac";//c   SORU COZUMU COK UZAMAMSI ICIN  BU SEKILDE ALINDI
            char ch = y.charAt(0);
            if(y.indexOf(ch) == y.lastIndexOf(ch)){
                System.out.println(ch);
            }//if body iki curly braces arasi
            char ch1 = y.charAt(1);
            if(y.indexOf(ch1) == y.lastIndexOf(ch1)){
                System.out.println(ch1);
            }//if body
            char ch2 = y.charAt(2);
            if(y.indexOf(ch2)== y.lastIndexOf(ch2)){
                System.out.println(ch2);

             */
            /*
             Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
             */
            String x="anna";
            String z ="";
            for (int i=x.length()-1;i>-1;i--){
                String y = x.substring(i,i+1);
                z=z+y;
            }if (x.equals(z)){
            System.out.println("palindrom");
        }else System.out.println("palindrom degil!");

        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
       // Örneğin; 'Ali Can?' ==> l*i*a*n*
        String name= "Ali Can";
       String newName= name.replaceAll("[a-z]","*");
        System.out.println("newName = " + newName);

        // Type code to print all lowercase characters in a String with an asterix.
        //For example; 'Ali Can?' ==> l*i*a*n*
        String name1= "Ali Can?";
        name1=name1.replaceAll("[^a-z]","");
        String name3="";
        for (int i = 0; i <name1.length() ; i++) {
            String name2=name1.substring(i,i+1);
            name3=name3+name2+"*";
            //name3=name3+"*"


        }System.out.println( name3);
        /*
        String s = "Ali Can?";
       s = s.replaceAll("[^a-z]", "");
       String t = "";
       for(Integer i=0; i<s.length(); i++){
         String r = s.substring(i,i+1);
         t = t + r + '*';
        }
          System.out.println(t)
         */







    }
}

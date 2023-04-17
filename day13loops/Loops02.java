package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        //1.way
        String s ="Pwd12?Ab";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (!Character.isLowerCase(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();
        //2.way
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch>='a'&& ch<='z'){
                continue;
            }else System.out.print(ch);

        }

    }
}

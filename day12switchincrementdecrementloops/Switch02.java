package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02 {
    /*
Kullanicidan aldiginiz character'i sesli harf olup olmadiğini kontrol eden kodu yaziniz.
(a-e-i-o-u)
 */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");

        //first way
        char letter =input.next().charAt(0);
        switch (letter){
            case 'a' : case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("is vowel");
                break;
            default:
                System.out.println("is not vowel");

        }

        //Second way
        String letter2=input.next().substring(0,1).toLowerCase();
        switch (letter2){
            case "a" : case "e": case "i": case "o": case "u":

                System.out.println("is vowel");
                break;
            default:
                System.out.println("is not vowel");

        }


    }
}

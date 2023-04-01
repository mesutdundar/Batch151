package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01 {
    /*
    Ay numarasi verildiginde ay'in ismini console'a yazdiran kody yaziniz
     */
    public static void main(String[] args) {
        int monthNumber=3;
        switch(monthNumber){
            case 1 :
                System.out.println("Januaray");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("invalid month number");

        }
        //Ay numarasi verildiginde numarasi verilen ay'in ismini ve December'a kadarki tum aylarin isimlerini console'a yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("enter month number");
        int numOfMonth = input.nextInt();
        switch(numOfMonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli ay numarasi veriniz...");
        }


    }
}

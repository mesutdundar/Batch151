package day37exceptionsenums;

public class IllegalGradeException extends Exception{

        /*
            1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
             Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

            2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
              Bu "constructor" parent'taki constructor'i cagirmalidir.
             Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

            3)Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz,
              IllegalGradeException da oldugu gibi.

         */

    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }

}
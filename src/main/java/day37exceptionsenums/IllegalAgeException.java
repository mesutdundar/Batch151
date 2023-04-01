package day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

        /*
            Eger Runtime Custom Exception uretmek isterseniz RuntimeException Class'a extend etmelisiniz.
        */

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }

}
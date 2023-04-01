package day27interface;

public class CarRunner {

    public static void main(String[] args) {

        Engine.stop(); //stop() method'u static oldugundan "interface" ismi ile ulastim

        Honda h = new Honda();
        h.eco();//eco() method'u static olmadigindan(default method) "object" ismi ile ulastim

    }
}
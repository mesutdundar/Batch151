package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        //ilk giren , ilk cikar. Araya kaynak yapmaya musaade etmiyor.
        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]
        //constructor'i linkedlist yaptigimiz icin bizim verdigimiz siralamayi kullandi.

        wareHouse.remove(); // delete first one!
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat  (gives you the first element without deleting it.
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat (throws a bug when its empty. the difference btween peek and element)
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll());//Meat //  gives the first element but delete it
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();//empty(Verb)
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//Exception



    }
}

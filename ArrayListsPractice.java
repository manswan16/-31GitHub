package gitChallenge31.GitChallenge31;

import java.util.ArrayList;

public class ArrayListsPractice {
    public static void main(String[] args) {

// 1.1 this is Array of fruits
        String [] fruits = new String[3];
        fruits [0] = "Apple";
        fruits [1] = "Grapes";
        fruits [2] = "Strawberry";
        System.out.println(fruits [1]);
        // 1.2 if we print out all fruits this way,down there, it doesn't work
        System.out.println(fruits);
        // 1.3 if we add more list to Array, it will show error, cuz we need to change the size in Array String[4]
        // fruits [3] = "Banana";

        System.out.println("");

        //2.1 Exact same thing here, in the ArrayList

        ArrayList fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Grapes");
        fruitList.add("Strawberry");
        //2.2 ArrayList is flexible, we can add more(or shrink) in size
        fruitList.add("Banana");
        fruitList.remove("Grapes");
        //2.3 we can check, if it contains something and it will give result as boolean
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);

        //2.4 we can remove all
        fruitList.clear();
        System.out.println(fruitList);

    }
}

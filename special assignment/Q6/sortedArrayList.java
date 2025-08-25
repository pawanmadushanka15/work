import java.util.ArrayList;
import java.util.Collections;

public class sortedArrayList{
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("pineapple");

        System.out.println("Orginal arraylist: "+fruits);
        Collections.sort(fruits);
        System.out.println("Extract portion of arraylist: "+fruits);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(334);
        numbers.add(45);
        numbers.add(45);
        numbers.add(56);

        System.out.println("Orginal arraylist: "+numbers);
        Collections.sort(numbers);
        System.out.println("Extract portion of arraylist: "+numbers);

    }
}
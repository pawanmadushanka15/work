import java.util.ArrayList;

public class subArrayList{
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("pineapple");

        System.out.println("Orginal arraylist: "+fruits);
        System.out.println("Extract portion of arraylist: "+fruits.subList(2,4));


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(14);
        numbers.add(34);
        numbers.add(45);
        numbers.add(56);
        numbers.add(45);

        System.out.println("Orginal arraylist: "+numbers);
        System.out.println("Extract portion of arraylist: "+numbers.subList(0,5));


    }
}
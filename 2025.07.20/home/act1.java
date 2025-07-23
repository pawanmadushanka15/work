
import java.util.ArrayList;

public class act1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        for (int i=1;i<=15;i++)
        {
            arrayList.add(i*2);
        }

        System.out.println("Element at index 3:"+arrayList.get(3));
        System.out.println("Size of the ArrayList:"+arrayList.size());
        arrayList.remove(2);
        System.out.println("Size after removing an element:"+arrayList.size());

        if(arrayList.contains(8))
        {
            System.out.println("Index of element 8:"+arrayList.indexOf(8));
            
        }
        else
            System.out.println("The element does't exist");

        System.out.println(arrayList);
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();

        System.out.println("-------------------");

        ArrayList<Object> list=new ArrayList<>();
        list.add(42);
        list.add(3.25);
        list.add("tree");
        list.add(true);

        System.out.println(list);
        System.out.println("Element at index 2:"+list.get(2));
        list.set(0,false);
        System.out.println("New add element:"+list.get(0));

        for (int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");














        

        

    }
    
}

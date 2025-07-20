import java.util.ArrayList;

public class SortArray{
	public static void main(String[] args){
		ArrayList<Double> arr1 = new ArrayList<>();
		ArrayList<Double> arr2 = new ArrayList<>();
		ArrayList<Double> arr3 = new ArrayList<>();
		
		arr1.add(1.25);
		arr1.add(10.58);
		arr1.add(13.58);
		arr1.add(20.85);
		arr1.add(31.85);

		arr2.add(96.74);
		arr2.add(58.58);
		arr2.add(47.21);
		arr2.add(25.12);
		arr2.add(13.99);
		
		for (int i=0;i<arr1.size();i++){
			if(!arr3.contains(arr1.get(i)) && !arr3.contains(arr2.get(i)) )
			{
				arr3.add(arr1.get(i));
				arr3.add(arr2.get(i));
			}
		}
		
		System.out.println(arr3);
		arr3.sort();
		
		
		
	}
}
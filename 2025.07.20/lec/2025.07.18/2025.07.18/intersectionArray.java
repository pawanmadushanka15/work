import java.util.ArrayList;

public class intersectionArray{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(5);
		arr1.add(5);

		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.add(7);
		
		for(int i=0;i<arr1.size();i++)
		{
			for(int j=0;j<arr2.size();j++)
			{
				if(arr1.get(i)==arr2.get(j))
				{
					for(int j=0;j<arr2.size();j++)
					{	
						if(arr1.get(i)!=arr3.get(i))
						{
							arr2.add(arr1.get(i));
						}
					}
				}
			}
		}
	}
}
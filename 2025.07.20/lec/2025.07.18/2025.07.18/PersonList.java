import java.util.ArrayList;

public class PersonList{
	public static void main(String[] args)
	{
		ArrayList<Person> personList=new ArrayList<>();
		
		Person person1 = new Person("John",25);
		Person person2 = new Person("Alice",30);
		Person person3 = new Person("Bob",35);
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName() + ", " + personList.get(i).getAge());
        }
	}
}
	
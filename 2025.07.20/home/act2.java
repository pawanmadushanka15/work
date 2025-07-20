import java.util.ArrayList;
public class act2 {
    public static void main(String[] args)
    {
        ArrayList<Person> personList=new ArrayList<>();

        Person p1=new Person("John",25);
        Person p2=new Person("Alice",30);
        Person p3=new Person("Bob",35);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);


        System.out.println("Person at index 1:"+personList.get(1).getName()+","+personList.get(1).getAge());

        Person newPerson=new Person("Mike",40);
        personList.set(1,newPerson);
        System.out.println("Modified person at index 1:"+personList.get(1).getName()+","+personList.get(1).getAge());

        System.out.println("Size of the arraylist:"+personList.size());

        personList.remove(0);
        System.out.println("Size after removing an object:"+personList.size());

        for(int i=0;i<personList.size();i++)
        {
            System.out.println(personList.get(i).getName()+","+personList.get(1).getAge());
        }

        

    }
}

class Person
{
    private String name;
    private int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}
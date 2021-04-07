package Objects;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setLname("Madaliev");
        person.setName("Kamal");
        person.setGender("Male");
        person.setAge(19);


        Person person1= new Person();
        person1.setLname("Kim");
        person1.setName("Ilya");
        person1.setGender("Male");
        person1.setAge(20);

        Person person2 = new Person("Kirov","Petr","Male",22);
        person.ShowData();
        person1.ShowData();
        person2.ShowData();

        person2.print();
        int []arr=new int[5];
        person2.setArr(arr);
        person2.print();
    }
}
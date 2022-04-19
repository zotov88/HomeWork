package LabWork5;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Peter");

        Person person2 = new Person("Steve", 40);

        person1.move();
        person2.talk();
    }
}

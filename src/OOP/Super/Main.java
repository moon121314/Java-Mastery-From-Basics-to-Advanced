package OOP.Super;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println(person.first);
        Student student = new Student("moon","moun",34);


        System.out.println(student.first);
        System.out.println(student.gpa);


        person.show();
    }


    }


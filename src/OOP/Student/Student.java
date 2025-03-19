package OOP.Student;

public class Student {
    String name;
    int age;
    boolean isEnrolled;
    double gpa;

    Student(String name ,int age,double gpa ){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = false;

    }
    void Study(){
        System.out.println(this.name + " is studying.");
    }
    void Enroll(){
        System.out.println(this.name + " is enrolling"+this.isEnrolled);
    }
}

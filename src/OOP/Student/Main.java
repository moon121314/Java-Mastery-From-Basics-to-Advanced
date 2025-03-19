package OOP.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("moon",23,3.2);
        Student student2 = new Student("masum",24,3.1);
        Student student3 = new Student("hasan",25,3.3);

       student1.Study();
       student2.Study();
       student3.Study();

       student2.Enroll();


    }
}

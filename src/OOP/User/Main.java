package OOP.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("masum");
        User user2 = new User("moon","kmr@gmail.com",23);
        User user3 = new User("nahid","sss@gmail.com",22);
        User user4 = new User();


        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);


        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);


        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}

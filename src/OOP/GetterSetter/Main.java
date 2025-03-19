package OOP.GetterSetter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V2","red","12000");

        //car.model="mk4";
        car.setPrice("1233333");
        car.setColor("blue");



        System.out.println(car.getModel() +" "+car.getColor()+" "+car.getPrice());
    }
}

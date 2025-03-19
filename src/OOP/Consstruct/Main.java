package OOP.Consstruct;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("supra","yellow");
        Car car2 = new Car("ford","blue");
        Car car3 = new Car("mk4","red");


        Car[] cars = {car1,car2,car3};

        for (Car car : cars) {
            car.color = "red";
        }
        for(Car car : cars){
            car.drive();
        }

    }
}

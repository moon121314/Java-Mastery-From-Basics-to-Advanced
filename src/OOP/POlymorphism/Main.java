package OOP.POlymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        //car.go();


        Vehcile[] vehciles = {bike,car,boat};
        for(Vehcile vehcile : vehciles){
            vehcile.go();
        }

    }
}

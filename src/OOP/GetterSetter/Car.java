package OOP.GetterSetter;

public class Car {
    private String model;
    private String color;
    private String price;

    Car(String model, String color, String price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return this.price;
    }
    void setColor(String color){
        this.color = color;
    }
    void setPrice(String price){
        this.price = price;
    }
}

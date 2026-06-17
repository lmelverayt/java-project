abstract class Vehicle {
    protected String brand;
    protected int year;
    
    // Конструктор
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public void start() {
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён");
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int year) {
        super(brand, year);
    }
    
    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}

public class Main7 {
    public static void main(String[] args) {
        // Создаем объект Car
        Car car = new Car("Toyota", 2020, 4);
        car.start();
        
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2022);
        motorcycle.start();
        
        System.out.println("\n=== Полиморфизм ===");
        
        Vehicle vehicle1 = new Car("BMW", 2021, 4);
        Vehicle vehicle2 = new Motorcycle("Yamaha", 2023);
        
        vehicle1.start();
        vehicle2.start();
    }
}
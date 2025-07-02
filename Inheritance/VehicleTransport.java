

abstract class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public abstract void displayInfo();
}

class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("maximum speed of car: "+maxSpeed+" "+" fuel type: "+fuelType+" seat capacity: "+ seatCapacity);
    }
}

class Motorcycle extends Vehicle{
    Motorcycle(int maxSpeed,String fuelType){
        super(maxSpeed, fuelType);
    }
    @Override
    public void displayInfo(){
        System.out.println("maximum speed of motorcycle: "+maxSpeed+" "+" fuel type :"+fuelType);
    }
}

class Truck extends Vehicle{
    Truck(int maxSpeed,String fuelType){
        super(maxSpeed, fuelType);
    }
    @Override
    public void displayInfo(){
        System.out.println("maximum speed of truck: "+maxSpeed+" "+" fuel type :"+fuelType);
    }
}
public class VehicleTransport {
    public static void main(String[] args) {
        Vehicle [] vehicles=new Vehicle[3];
        vehicles[0]=new Car(240, "petrol", 7);
        vehicles[1]=new Motorcycle(120,"petrol");
        vehicles[2]=new Truck(150, "diesel");
        for(Vehicle v: vehicles){
            v.displayInfo();
        }

    }
}

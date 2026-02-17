public class Truck extends Vehicle {
    public Truck (String plateNumber, Long entryTime){
        super(plateNumber, entryTime);
    }
    @Override
    public double calculateFee(){
        return 10;
    }
    }


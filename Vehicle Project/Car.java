public class Car extends Vehicle{
    public Car(String plateNumber, Long entryTime){
        super(plateNumber, entryTime);
    }
    @Override
    public double calculateFee(){
        return 30;
    } 
    }


public abstract class Vehicle{
    protected String plateNumber;
    protected Long entryTime;

    public Vehicle(String plateNumber, Long entryTime){
        this.plateNumber = plateNumber;
        this.entryTime = System.currentTimeMillis();
    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public Long getEntryTime(){
        return entryTime;
    }

    public abstract double calculateFee();

}

 


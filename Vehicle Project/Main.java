public class Main {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();

        Vehicle car = new Car("34-ABC-123", System.currentTimeMillis());
        Vehicle motorcycle = new Motorcycle("77-ABC-321", System.currentTimeMillis());
        Vehicle truck = new Truck("12-ABC-456", System.currentTimeMillis());

        parkingLot.addVehicle(car);
        parkingLot.addVehicle(motorcycle);
        parkingLot.addVehicle(truck);

        // Bir aracı çıkar
        parkingLot.removeVehicle("34-ABC-123");

        System.out.println("Toplam Kazanç: " + parkingLot.getTotalRevenue());
    }
}

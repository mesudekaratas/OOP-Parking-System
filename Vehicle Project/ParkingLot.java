import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<Vehicle> vehicles;
    private double totalIncome;

    public ParkingLot() {
        vehicles = new ArrayList<>();
        totalIncome = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(" Arac giris yapti :   " + vehicle.getPlateNumber());
    }

    public void removeVehicle(String plateNumber) {

        Vehicle foundVehicle = null;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlateNumber().equals(plateNumber)) {
                foundVehicle = vehicle;
                break;
            }
        }

        if (foundVehicle != null) {
            double fee = foundVehicle.calculateFee();
            totalIncome += fee;
            vehicles.remove(foundVehicle);

            System.out.println(" Arac cikis yapti : " + foundVehicle.getPlateNumber());
            System.out.println( " Ucret : " + fee + " TL");
        } else {
            System.out.println(" Arac bulunamadi.");
        }
    }

    public double getTotalRevenue() {
        return totalIncome;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }
}


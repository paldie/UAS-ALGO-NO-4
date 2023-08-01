//FAKHRI NAUFALDI RAMADHAN
//227064516035

// Abstract class
abstract class Vehicle {
    private String merek;
    public Vehicle(String brand) {
        this.merek = brand;
    }
    
    // Abstract untuk mengambil tipe kendaraan
    public abstract String getType();
    // Concrete menampilkan merek kendaraan
    public void showBrand() {
        System.out.println("Merek: " + merek);
    }
}

// car sub class vehicle
class Car extends Vehicle {
    private int numDoors;

    public Car(String merek, int numDoors) {
        super(merek);
        this.numDoors = numDoors;
    }

    // Override Implementasi abstract method getType() dari class Vehicle
    @Override
    public String getType() {
        return "Mobil";
    }

    //menampilkan jumlah pintu mobil
    public void showNumDoors() {
        System.out.println("Jumlah pintu: " + numDoors);
    }
}

// car motorsycle class vehicle
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String merek, boolean hasSideCar) {
        super(merek);
        this.hasSideCar = hasSideCar;
    }

    // Implementasi abstract method getType() dari class Vehicle
    @Override
    public String getType() {
        return "Sepeda Motor";
    }

    // menampilkan informasi tentang sidecar
    public void showSideCarInfo() {
        if (hasSideCar) {
            System.out.println("Sepeda motor ini memiliki Sidecar.");
        } else {
            System.out.println("Sepeda motor ini tidak memiliki Sidecar.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek (Car) dan (Motorcycle)
        Car car = new Car("Toyota",4);
        Motorcycle motorcycle = new Motorcycle("Honda", true);

        //method showBrand() dan showNumDoors()
        car.showBrand();
        car.showNumDoors();
        // method showBrand() dan showSideCarInfo()
        motorcycle.showBrand();
        motorcycle.showSideCarInfo();
    }
}

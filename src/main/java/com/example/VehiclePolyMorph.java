package com.example;
import java.util.Scanner;

class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}

class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) throws InvalidYearException {
        if (year > getCurrentYear()) {
            throw new InvalidYearException("Tahun " + year + " tidak valid. Tahun tidak boleh lebih besar dari tahun saat ini.");
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String vehicleSound() {
        return "Suara kendaraan pada umumnya";
    }

    private int getCurrentYear() {
        return 2024;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) throws InvalidYearException {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String vehicleSound() {
        return "Broom Broom!";
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) throws InvalidYearException {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String vehicleSound() {
        return "Vroom Vroom!";
    }
}

public class VehiclePolyMorph  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Pilih jenis kendaraan:");
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                if (choice == 1) {
                    createCar(scanner);
                } else if (choice == 2) {
                    createMotorcycle(scanner);
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Pilihan anda salah. Coba lagi.");
                }
            }
        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Proses pembuatan kendaraan selesai.");
            scanner.close();
        }
    }

    public static void printVehicleSound(Vehicle vehicle) {
        System.out.println(vehicle.vehicleSound());
    }

    public static void createCar(Scanner scanner) throws InvalidYearException {
        String brand = "Honda";
        String model = "Brio";

        System.out.println("Masukkan detail Mobil:");
        System.out.println("Brand:" + brand);
        System.out.println("Model: "+ model);
        System.out.print("Tahun: ");
        int year = scanner.nextInt();
        System.out.print("Jumlah pintu: ");
        int numOfDoors = scanner.nextInt();

        Vehicle car = new Car(brand, model, year, numOfDoors);
        System.out.println("Suara mobil: " + car.vehicleSound());
    }

    public static void createMotorcycle(Scanner scanner) throws InvalidYearException {
        String brand = "Yamaha";
        String model = "NMax";

        System.out.println("Masukkan detail motor:");
        System.out.println("Brand:" + brand);
        System.out.println("Model: "+ model);
        System.out.print("Tahun: ");
        int year = scanner.nextInt();
        System.out.print("Memiliki sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Vehicle motorcycle = new Motorcycle(brand, model, year, hasSidecar);
        System.out.println("Suara Motor: " + motorcycle.vehicleSound());
    }
}


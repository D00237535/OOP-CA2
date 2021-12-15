package dkit.oop;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 */
public class App
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager\n");

        //Q1
        CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4", 20000, 234);
        CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000", 25000,34);

        // display the two objects
        System.out.println("Cargo Plane 1 Details");
        System.out.println(cargoPlane1+"\n");
        System.out.println("Cargo Plane 2 Details");
        System.out.println(cargoPlane2+"\n");

        AirplaneManager mgr = new AirplaneManager();

        //Q2
        PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
        PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);
        //Add passengers to Passenger planes
        passengerPlane1.addPassenger("Tom Hardy");
        passengerPlane1.addPassenger("Margot Robbie");
        passengerPlane2.addPassenger("Emma Thompson");
        System.out.println(passengerPlane1+"\n");
        System.out.println(passengerPlane2+"\n");

        //Q3

        // write calls to methods implemented for Q3.
        mgr.add(cargoPlane1);
        mgr.add(cargoPlane2);
        mgr.add(passengerPlane1);
        mgr.add(passengerPlane2);

        //Display all airplanes:
        mgr.displayAllAirplanes();

        //Display only the passenger airplanes:
        mgr.displayAllPassengerAirplanes();

        // Getting all cargo airplanes:
        List<Airplane> allCargoAirplanes = (List<Airplane>) mgr.getAllCargoAirplanes();
        System.out.println("Printing all cargo airplanes: ");
        for(Airplane airplane : allCargoAirplanes)
        {
            System.out.println(airplane);
        }

        //addPassengerNameToAirplane:
        System.out.println("Testing addPassengerNameToAirplane(): ");
            boolean addedPassenger = mgr.addPassengerNameToAirplane(103, "Tom Holland");
                System.out.println(addedPassenger);
            System.out.println("Printing all passenger airplanes to verify if new passenger has been added: ");
        mgr.displayAllPassengerAirplanes();

        //containsAirplane:
        boolean containsPassengerPlane1 = mgr.containsAirplane(passengerPlane1);
            boolean containsNewPlane = mgr.containsAirplane(new CargoAirplane("Boeing C-7000",2200));
            System.out.println("Contains passengerPlane1 : " + containsPassengerPlane1);
        System.out.println("Contains new plane with same values (except id) as cargoPlane2 : " + containsNewPlane);

        // Testing findAirplaneByPassengerName:
        Airplane findPlaneWithMargotRobbie = mgr.findAirplaneByPassengerName("Margot Robbie");
             System.out.println("Plane that has Margot Robbie as a passenger: " + findPlaneWithMargotRobbie);
            Airplane findPlaneWithChirsEvans = mgr.findAirplaneByPassengerName("Chris Evans");
        System.out.println("Plane that has Chris Evans as a passenger: " + findPlaneWithChirsEvans);




        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.
//
//        CityDistanceManager cityDistanceManager = new CityDistanceManager();
//        cityDistanceManager.printCitiesData();
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("\nPlease enter first city name:");
//        String city1 = keyboard.nextLine();
//        System.out.print("Please enter second city name:");
//        String city2 = keyboard.nextLine();
//
//        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
//        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);
//
//        System.out.print("\nEnter base city name:");
//        String baseCity = keyboard.nextLine();
//
//        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
//        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}
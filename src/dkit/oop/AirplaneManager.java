package dkit.oop;

import java.util.ArrayList;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.



    // write add() method
    public ArrayList<Airplane> add(Airplane airplane){
        this.airplaneList.add(airplane);
        return this.airplaneList;
    }


    public void displayAllAirplanes() {
        System.out.println("Displaying all airplanes: ");
        for(Airplane airplane : airplaneList){
            System.out.println(airplane);
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        System.out.println("Displaying only the passenger airplanes:");

        for(Airplane airplane: airplaneList){
            if(airplane instanceof PassengerAirplane){
                System.out.println(airplane);
            }
        }
    }

    //  write method getAllCargoAirplanes()
    public Airplane getAllCargoAirplanes(){
        System.out.println("Display all cargo planes: ");
        ArrayList<Airplane> airplane = new ArrayList<>();
        for(Airplane a: airplane){
            if(a instanceof CargoAirplane){
                return a;
            }
        }
        return null;
    }


    // write  addPassengerNameToAirplane( airplaneId, passengerName)
    public boolean addPassengerNameToAirplane(int airplaneID, String passengerName)
    {
        for(Airplane airplane : airplaneList) {
            if(airplane.getId() == airplaneID && airplane instanceof PassengerAirplane) {
                ((PassengerAirplane) airplane).addPassenger(passengerName);
                return true;
            }
        }

        return false;
    }
    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane) {
        for(Airplane airplane : airplaneList) {
            if(airplane.getId() == plane.getId()) {
                return true;
            }
        }
        return false;
    }


    // write findAirplaneByPassengerName( passengerName )
    public Airplane findAirplaneByPassengerName(String passengerName){
        for(Airplane airplane : airplaneList) {
            if(airplane instanceof PassengerAirplane) {
                if(((PassengerAirplane) airplane).getPassengerList().contains(passengerName)) {
                    return airplane;
                }
            }
        }

        return null;
    }

    // write displayAllAirplanesInOrderOfType( argument )



} // end of AirplaneManager



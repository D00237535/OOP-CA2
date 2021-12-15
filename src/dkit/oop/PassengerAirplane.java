package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private int Max_Num_Passengers;
    ArrayList<String> passengersList = new ArrayList<>();

    PassengerAirplane(String type, int Max_Num_Passengers) {
        // code here
        super(type);
        this.Max_Num_Passengers = Max_Num_Passengers;
    }

    public void addPassenger(String name) {
        // code here
        if(this.passengersList.size() < this.Max_Num_Passengers){
            this.passengersList.add(name);
        }
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                super.toString() +
                "Max_Num_Passengers=" + Max_Num_Passengers +
                ", passengersList=" + passengersList +
                '}';
    }
} // end of PassengerAirplane

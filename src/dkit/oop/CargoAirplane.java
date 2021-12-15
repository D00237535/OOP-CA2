package dkit.oop;

public class CargoAirplane extends Airplane {

    // fields (ref. Q1)
    private int Max_Load_Kilos;
    private int currentLoad;

    CargoAirplane(String type, int Max_Load_Kilos) {
        super(type);

        this.Max_Load_Kilos = Max_Load_Kilos;
    }

    CargoAirplane(String type, int Max_Load_Kilos, int currentLoad) {
        super(type);

        this.Max_Load_Kilos = Max_Load_Kilos;
        this.currentLoad = currentLoad;
    }

    // constructor


    // toString()
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "id='" + super.getId() + '\'' +
                ", type='" + super.getType() + '\'' +
                ", max_load_kilos=" + Max_Load_Kilos + '\'' +
                ", currentLoad=" + currentLoad +  '\'';
    }


} // END of CargoAirplane class.
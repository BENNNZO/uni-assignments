package w7;

public class Airport {
    private String airportCode;
    private int gates;

    private static int countAirports = 0;

    public Airport() {
        airportCode = "";
        countAirports++;
    }

    public Airport( String startAirportCode, int startGates ) {
        airportCode = startAirportCode;
        gates = startGates;
        countAirports++;
    }


    // GET FUNCTIONS
    public String getAirPortCode() {
        return airportCode;
    }

    public int getGates() {
        return gates;
    }

    public static int getCountAirports() {
        return countAirports;
    }


    // SET FUNCTIONS
    public void setAirPortCode( String newAirportCode ) {
        airportCode = newAirportCode;
    }

    public void setGates( int newGates ) {
        if (newGates > 0) {
            gates = newGates;
        }
    }


    // OTHER FUNCTIONS
    public String toString() {
        return airportCode + ";" + gates;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Airport)) {
            return false;
        } else {
            Airport a = (Airport) o;
            return gates == a.gates && airportCode.equals(a.airportCode);
        }
    }
}
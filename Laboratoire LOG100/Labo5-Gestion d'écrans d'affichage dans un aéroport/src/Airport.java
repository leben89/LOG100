import java.util.ArrayList;
import java.util.List;

public class Airport extends Subject{

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
        notifyObservers();
    }

    public void removeFlight(Flight flight){
        flights.remove(flight);
        notifyObservers();
    }

    public List<Flight> getFlights(){
        return flights;
    }
}

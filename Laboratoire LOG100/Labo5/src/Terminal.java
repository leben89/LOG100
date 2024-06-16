import java.util.ArrayList;
import java.util.List;

public class Terminal extends Subject{

    private List<Flight> flights = new ArrayList<>();
    private String name;

    public Terminal(String name){
        this.name = name ;
    }

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
    public String getName(){
        return name;
    }

}

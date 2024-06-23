import java.util.List;
import java.util.Scanner;

public class AirportScreen extends Observer {

    private Subject airport;
    private String screenName;

    public AirportScreen(Subject airport, String screenName){
        this.airport = airport;
        this.screenName = screenName;
    }

    public void update(){
        List<Flight> flights = airport.getFlights();
        System.out.println(screenName);
        for(Flight flight : flights){
            System.out.println(flight);
        }

    }
}

import java.util.List;
import java.util.Scanner;

public class AirportScreen extends Observer {

    private Airport airport;
    private String screenName;
    private ScreenDialog screenDialog;

    public AirportScreen(Airport airport, String screenName) {
        this.airport = airport;
        this.screenName = screenName;

    }

    public AirportScreen(Airport airport, String screenName, ScreenDialog screenDialog) {
        this.airport = airport;
        this.screenName = screenName;
        this.screenDialog = screenDialog;

    }

    public void update() {
        List<Flight> flights = airport.getFlights();
        Observer.displayFlights(flights, screenDialog);
    }

}
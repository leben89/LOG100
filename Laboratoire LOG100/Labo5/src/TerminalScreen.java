import java.util.List;
import java.util.Scanner;

public class TerminalScreen extends Observer{
    private Subject terminal;
    private String screenName;

    public TerminalScreen(Subject terminal, String screenName){
        this.terminal = terminal;
        this.screenName = screenName;
    }

    public void update(){
        List<Flight> flights = terminal.getFlights();
        System.out.println(screenName);
        for(Flight flight : flights){
            System.out.println(flight);
        }
    }

}


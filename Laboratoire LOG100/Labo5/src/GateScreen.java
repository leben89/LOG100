import java.util.List;
import java.util.Scanner;

public class GateScreen extends Observer{

    private Gate gate;
    private String screenName;


    public GateScreen(Gate gate){
        this.gate = gate;
    }
    public GateScreen(Gate gate, String screenName){
        this.gate = gate;
        this.screenName = screenName;
    }

    public void update(){
        List<Flight> flights = gate.getFlights();
        System.out.println("GATE " +gate.getName());
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}

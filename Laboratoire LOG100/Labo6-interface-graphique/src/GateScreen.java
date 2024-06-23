import java.util.List;
import java.util.Scanner;

public class GateScreen extends Observer{

 private Gate gate;
 private ScreenDialog screenDialog;


    public GateScreen(Gate gate){
        this.gate = gate;

    }

  public GateScreen(Gate gate ,ScreenDialog screenDialog){
    this.gate = gate;
    this.screenDialog = screenDialog;
  }
 /* public GateScreen(Gate gate, ScreenDialog screenDialog){
    this.gate = gate;

    this.screenDialog = screenDialog;
  }*/

  public void update(){
      List<Flight> flights = gate.getFlights();
      Observer.displayFlights(flights, screenDialog);
    }
}
import java.util.List;
import java.util.Scanner;

public class TerminalScreen extends Observer{
  private Terminal terminal;
  private String screenName;
  private ScreenDialog screenDialog;

  public TerminalScreen(Terminal terminal, String screenName){
    this.terminal = terminal;
    this.screenName = screenName;

  }
  public TerminalScreen(Terminal terminal, String screenName, ScreenDialog screenDialog){
    this.terminal = terminal;
    this.screenName = screenName;
    this.screenDialog = screenDialog;
  }

  public void update(){
    List<Flight> flights = terminal.getFlights();
    Observer.displayFlights(flights, screenDialog);
  }

}

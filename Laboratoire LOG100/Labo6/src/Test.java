import org.omg.Messaging.SyncScopeHelper;

public class Test {
    public static double getSalary(){
        return 1500.0;
    }
    public static double getSalary(int hours){
        double hourlyRate = 16.5;
        double total = hourlyRate * hours;
        return total;
    }
    public static double getSalary(int hours, double baseSalary){
        double hourlyRate = 15.3;
        double total = baseSalary + hourlyRate * hours;
        return total;
    }
    public static double calculerAire(double base, double hauteur)throws Exception {
        if (base == 0) {
            throw new Exception("Erreur : base est zéro");
        }
        if (hauteur == 0) {
            throw new Exception("Erreur : hauteur est zéro");
        }
        if (base < 0) {
            throw new Exception("Erreur: base est négative");
        }
        if (hauteur < 0) {
            throw new Exception("Erreur: Hauteur est négative");
        }
        return (base*hauteur)/2.0;

    }

    public static void main (String[] args) throws Exception {
        double emp1 = Test.getSalary();
        double emp2 = Test.getSalary(10);
        double emp3 = Test.getSalary(10,1300.0);
        double aire = Test.calculerAire(10,10);

        System.out.println("Salary emp1 = " + emp1);
        System.out.println("Salary emp2 = " +emp2);
        System.out.println("Salary emp3 = " + emp3);
        System.out.println("Aire = " +aire);


    }
}

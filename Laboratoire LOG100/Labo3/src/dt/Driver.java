package dt;

public class Driver {

    public static void testTruck() throws VehicleException{
        String[] cityTruckMaterials = {"sand", "traffic cones"};
        Truck cityTruck = new Truck(cityTruckMaterials, 1001, "ville de Montreal", "Valerie Plante", "City Hall", "Chevrolet", "Silverado", "MTL 001", 40000.f);

        String[] westmountTruckMaterials = {"sand", "traffic cones", "concrete", "trees", "flowers"};
        Truck westmountTruck = new Truck(westmountTruckMaterials, 2001, "Westmount", "michelle Desjardins", "75 Belvedere", "Ford", "XLT", "WMT 100", 27000.f);

        String[] expensiveTruckMaterials = {"traffic cones", "sand", "wood", "furniture", "food", "ice"};
        Truck expensiveTruck = new Truck(expensiveTruckMaterials, 3003, "Griffintown", "Jean Montagne", "1122 Peel", "Toyota", "Tundra", "RST 002", 45000.f);

        System.out.println(cityTruck);
        System.out.println(westmountTruck);
        System.out.println(expensiveTruck);


    }

    public static void testSuv() throws VehicleException{

        Suv cheapSuv = new Suv((byte)12, (byte)4, (byte)2, "Jeanne Tremblay", "1100 Notre-Dame", "Fiat", "500X", "ABC 123", 25000.f);

        Suv mediumSuv = new Suv((byte)7, (byte)2, (byte)2, "Pierre Maisonneuve", "", "Honda", "Odyssey", "FHG 789", 36000.f);

        Suv expensiveSuv = new Suv((byte)8, (byte)2, (byte)2, "Justin Levesque", "1400 McGill", "BMW", "X6", "", 74000.f);

        System.out.println(cheapSuv);
        System.out.println(mediumSuv);
        System.out.println(expensiveSuv);
    }

    public static float sumValues(Vehicle[] vehicle){
        float sum = 0.f;
        if(vehicle == null || vehicle.length==0){
            return 0;
        }
        for(int i=0; i<vehicle.length; i++ ){
            sum += vehicle[i].getValue();
        }
        return sum;
    }


    public static void main (String[] args){
        if(args[0].equals("truck")){
            try{
                testTruck();
            }
            catch(TruckException e){
                System.out.println("Error with Truck constructor parameter " + e.getParameter());
            }
            catch(VehicleException e){
                System.out.println("Error with Vehicle constructor parameter " + e.getParameter());
            }
        }
        else if(args[0].equals("suv")){
            try {
                testSuv();
            } catch(VehicleException e){
                System.out.println("Error with Vehicle constructor parameter " + e.getParameter());
            }
        }

    }


}


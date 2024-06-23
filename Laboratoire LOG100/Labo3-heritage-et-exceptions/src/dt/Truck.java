package dt;

public final class Truck extends Vehicle{

    private String[] materials = new String[5];
    private long permit;
    private String company;

    public Truck (String[] materials, long permit, String company,
                  String ownerName, String ownerAddress, String brand,
                  String model, String licencePlate, float value)throws VehicleException, TruckException{

        super(ownerName, ownerAddress, brand, model, licencePlate, value);
        if(materials==null || materials.length==0 || materials.length>this.materials.length){
            throw new TruckException("materials");
        }
        if(company.isEmpty()){
            throw new VehicleException("company");
        }
        if(permit == 0){
            throw new VehicleException("permit");
        }

        this.materials = new String[5];
        for(int i =0; i<this.materials.length; i++){
            if(i<materials.length){
                this.materials[i] = materials[i];
            }else{
                this.materials[i] = null;
            }

        }
        this.permit = permit;
        this.company = company;
    }

    public String toString(){
        StringBuilder materialsStr = new StringBuilder ("[");
        for( int i=0; i<materials.length; i++){
            if(materials[i] != null){
                materialsStr.append("/").append(materials[i]).append("/");
            }
        }
        materialsStr.append("]");
        return super.toString() + ", " +materialsStr.toString()+ ", " +permit+ ", " +company;
    }



    public String[] getMaterials(){
        return materials;
    }
    public void setMaterials(String[] materials){

        this.materials = new String[5];
        for(int i =0; i<this.materials.length; i++){
            if(i<materials.length){
                this.materials[i] = materials[i];
            }else{
                this.materials[i] = null;
            }

        }

    }
    public long getPermit(){
        return permit;
    }
    public void setPermit(long permit){
        this.permit = permit;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }

}

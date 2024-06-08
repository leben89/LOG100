package dt;

public final class Suv extends Vehicle {

    private byte capacity;
    private byte childSeatCount;
    private byte airbagCount;

    public Suv (byte capacity, byte childSeatCount, byte airbagCount,
                String ownerName, String ownerAddress, String brand,
                String model, String licencePlate, float value)throws VehicleException{

        super (ownerName, ownerAddress, brand, model,
                licencePlate,value);
        if(capacity<=0){
            throw new VehicleException("capacity");
        }
        if(childSeatCount<=0){
            throw new VehicleException("childSeatCount");
        }
        if(airbagCount<=0){
            throw new VehicleException("airbagCount");
        }


        this.capacity = capacity;
        this.childSeatCount = childSeatCount;
        this.airbagCount = airbagCount;
    }
    public String toString(){
        return super.toString()+ ", " +capacity+ ", "
                +childSeatCount+ ", " +airbagCount;
    }
    public byte getCapacity(){
        return capacity;
    }
    public void setCapacity(byte capacity){
        this.capacity = capacity;
    }
    public byte getChildSeatCount(){
        return childSeatCount;
    }
    public void setChildSeatCount(byte childSeatCount){
        this.childSeatCount = childSeatCount;
    }
    public byte getAirbagCount(){
        return airbagCount;
    }
    public void setAirbagCount(byte airbagCount){
        this.airbagCount = airbagCount;
    }

}
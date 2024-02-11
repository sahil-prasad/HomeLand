package Section05;

public class vehicle {

    private String engine;
    public int wheels;
    public int seats;
    public int fueltanks;
    public String lights;
    public vehicle() {
        engine ="Petrol";
        wheels=2;
        seats=2;
        fueltanks=14;
        lights="LED";
        }
    public String getEngine() {
        return engine;
    }
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
    public int getFueltanks() {
        return fueltanks;
    }
    public String getLights() {
        return lights;
    }
        


    
}

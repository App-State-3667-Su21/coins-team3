public abstract class Mint {

    private String location;
    private String name;

    //Constructor
    public Mint(String location, String name) {
        this.location = location;
        this.name = name;
    }

    //Getters    
    public abstract String getLocation();
    public abstract String getName();

    //Will be used to make coins... I think
    public abstract void makeCoins();
}

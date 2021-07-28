public class CanadaMint extends Mint {
    
    private String location;
    private String name;

    public CanadaMint(String location, String name) {
        super(location, name);
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void makeCoins() {
        System.out.println("This doesn't do much yet");
    }
}

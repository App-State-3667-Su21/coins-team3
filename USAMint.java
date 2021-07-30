public class USAMint extends Mint {
    
    private String location = "USA";
    private String name;

    public USAMint( String name) {
        super("USA", name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    /**
    public void makeCoins() {
        System.out.println("This doesn't do much yet");
    }
    */
}

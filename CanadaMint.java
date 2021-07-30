public class CanadaMint extends Mint {
    
    private String location = "CAD";
    private String name;

    public CanadaMint(String name) {
        super("CAD", name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    
}

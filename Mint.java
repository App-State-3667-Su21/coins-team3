import java.util.Scanner;

public abstract class Mint {

    private String location;
    private String name;
    private Scanner valScan = new Scanner(System.in);
    
    //Constructor
    public Mint(String location, String name) {
        this.location = location;
        this.name = name;
    }

    //Getters    
    public abstract String getLocation();
    public abstract String getName();

    //Will be used to make coins... I think
    public void makeCoins() {
        System.out.println("Possible coin factories include: USD, GBP, CAD, EUR");
        if(location.equals("USA")) {
            System.out.println("Using USD: " + this.getName() + "\n");
        }
        else if(location.equals("Canada")) {
            System.out.println("Using CAN: " + this.getName() + "\n");
        }
        System.out.print("Enter Coint denomination (0.25 = a quarter, 0 to quit): ");
        double val = valScan.nextDouble();
        System.out.println("\n" + "You input: " + val);
    }
    
}

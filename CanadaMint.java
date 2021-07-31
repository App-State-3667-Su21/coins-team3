import java.util.Scanner;

public class CanadaMint extends Mint {
    
    private String location;
    private String name;
    private Scanner valScan = new Scanner(System.in);

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
        System.out.println("Possible coin factories include: USD, GBP, CAD, EUR"); 
            System.out.println("Using CAN: " + this.getName() + "\n");
            double val = 1;
            while(val != 0)
            {

                System.out.print("Enter Coint denomination (0.25 = a quarter, 0 to quit): ");
                val = valScan.nextDouble();
                if(val == 0)
                {
                    System.out.println("Coin creation cancelled");
                }
                else if(val == 0.05)
                {
                    CadNickle nickle = new CadNickle();
                    nickle.mint();   
                } 
                else if(val == 0.10) 
                {
                    CadDime dime = new CadDime(); 
                    dime.mint();
                }
                else if(val == 0.25)
                {
                    CadQuarter quarter = new CadQuarter();
                    quarter.mint();
                } 
                else if(val == 0.50)
                {
                    FiftyCent fiftycent = new FiftyCent();
                    fiftycent.mint();
                }
                else if(val == 1.00)
                {
                    Loonie loonie = new Loonie();
                    loonie.mint();
                }
                else if(val == 2.00)
                {
                    Toonie toonie = new Toonie();
                    toonie.mint();
                }
                else
                {
                System.out.println("Error: Invalid coin value. Try again.");
                }
            }
       }

    
}

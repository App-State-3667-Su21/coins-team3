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
    public abstract void makeCoins(/**) {
        System.out.println("Possible coin factories include: USD, GBP, CAD, EUR");
        if(location.equals("USA")) 
        {
            System.out.println("Using USD: " + this.getName() + "\n");
            double val = 1;
            while(val != 0)
            {
                System.out.print("Enter Coint denomination (0.25 = a quarter, 0 to quit): ");
                val = valScan.nextDouble();
                if(val == 0)
                {
                    System.out.println("Coin creation cancelled");
                }
                else if(val == 0.01)
                {
                    Penny penny = new Penny();
                    penny.mint();   
                }
                else if(val == 0.05)
                {
                    Nickle nickle = new Nickle();
                    nickle.mint();   
                } 
                else if(val == 0.10) 
                {
                    Dime dime = new Dime(); 
                    dime.mint();
                }
                else if(val == 0.25)
                {
                    Quarter quarter = new Quarter();
                    quarter.mint();
                } 
                else if(val == 0.50)
                {
                    HalfDollar halfdollar = new HalfDollar();
                    halfdollar.mint();
                }
                else if(val == 1.00)
                {
                    Dollar dollar = new Dollar();
                    dollar.mint();
                }
                else
                {
                System.out.println("Error: Invalid coin value. Try again.");
                }
            }
        }
        else if(location.equals("CAD")) {
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
    }*/);
    
}

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
            System.out.print("Enter Coint denomination (0.25 = a quarter, 0 to quit): ");
            double val = valScan.nextDouble();
            if(val == 0)
            {
                System.out.println("Coin creation cancelled");
            }
            else if(val == 0.01)
            {
            Penny penny = new Penny();
            penny.smelt();
            penny.inspect();
            penny.smooth();
            penny.polish();
            }
            else if(val == 0.05)
            {
            Nickle nickle = new Nickle();
            nickle.smelt();
            nickle.inspect();
            nickle.smooth();
            nickle.polish();   
            } 
            else if(val == 0.10) 
            {
            Dime dime = new Dime();
            dime.smelt();
            dime.inspect();
            dime.smooth();
            dime.polish();
            } 
            else if(val == 0.25)
            {
            Quarter quarter = new Quarter();
            quarter.smelt();
            quarter.inspect();
            quarter.smooth();
            quarter.polish();
            } 
            else if(val == 0.50)
            {
            HalfDollar halfdollar = new HalfDollar();
            halfdollar.smelt();
            halfdollar.inspect();
            halfdollar.smooth();
            halfdollar.polish();
            }
            else if(val == 1.00)
            {
            Dollar dollar = new Dollar();
            dollar.smelt();
            dollar.inspect();
            dollar.smooth();
            dollar.polish();
            } 
        }
        else if(location.equals("Canada")) {
            System.out.println("Using CAN: " + this.getName() + "\n");
            System.out.print("Enter Coint denomination (0.25 = a quarter, 0 to quit): ");
            double val = valScan.nextDouble();
            if(val == 0)
            {
                System.out.println("Coin creation cancelled");
            }
            else if(val == 0.05)
            {
                CadNickle nickle = new CADNickle();
                nickle.smelt();
                nickle.inspect();
                nickle.smooth();
                nickle.polish();   
            } 
            else if(val == 0.10) 
            {
                CadDime dime = new CadDime();
                dime.smelt();
                dime.inspect();
                dime.smooth();
                dime.polish();
            } 
            else if(val == 0.25)
            {
                CadQuarter quarter = new CadQuarter();
                quarter.smelt();
                quarter.inspect();
                quarter.smooth();
                quarter.polish();
            } 
            else if(val == 0.50)
            {
                FiftyCent fiftycent = new FiftyCent();
                halfdollar.smelt();
                halfdollar.inspect();
                halfdollar.smooth();
                halfdollar.polish();
            }
            else if(val == 1.00)
            {
                Loonie loonie = new Loonie();
                loonie.smelt();
                loonie.inspect();
                loonie.smooth();
                loonie.polish();
            }
            else if(val == 2.00)
            {
                Toonie toonie = new Toonie();
                toonie.smelt();
                toonie.inspect();
                toonie.smooth();
                toonie.polish(); 
        }
        
    }
    
}

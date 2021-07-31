public class USAMint extends Mint {
    
    private String location;
    private String name;

    public USAMint(String location, String name) {
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
    }
    
}

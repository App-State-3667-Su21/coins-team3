import java.util.Scanner;
public class USAMint extends Mint {
   
    private static USAMint usMint; 
    private String location = "USA";
    private String name;
    private Scanner valScan = new Scanner(System.in);

    private USAMint( String name) {
        super("USA", name);
        this.name = name;
    }

    public static USAMint getInstance() {
        if (usMint == null) {
            usMint = new USAMint("Capitol_Mint");
        }
        return usMint;
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
                    NullCoin frank = new NullCoin();
                    frank.mint(); 
                }
            }
        }
    }
    


import java.util.Random;
public abstract class Coin {
    public String code;
    public double val;
    public  boolean fail = false;
    public Random rand = new Random();
    

    /**public Coin(String code, double val)
    {
        this.code = code;
        this.val = val;
    }*/

    public abstract String getCode();

    public abstract double getVal();
    
    public void smelt()
    {
        String n = this.getClass().getName();
        System.out.print("Smelting " + n);
        
        Context context = new Context(n);
        context.executeSmeltStrategy();
        
        System.out.println("...completed.");
    }

    //fail 1/12
    public void inspect()
    { 
        int check = 0;
        int failInt = rand.nextInt(12);
        System.out.print("Inspecting " + this.getClass().getName());
        if(failInt == check)
        {
        fail = true;
        System.out.println("...failed.");
        }
        else
        {
        System.out.println("...completed.");
        }
    }

    //fail 1/1000
    public void smooth()
    {
        int check = 0;
        int failInt = rand.nextInt(1000);
        System.out.print("Smoothing " + this.getClass().getName());
        if(failInt == check)
        {
        fail = true;
        System.out.println("...failed.");
        }
        else
        {
        System.out.println("...completed.");
        }
    }

    //fail 1/1000
    public void polish()
    {
        int check = 0;
        int failInt = rand.nextInt(1000);
        System.out.print("Polishing " + this.getClass().getName());
        if(failInt == check)
        {
        fail = true;
        System.out.println("...failed.");
        }
        else
        {
        System.out.println("...completed.");
        }
    }
    
    //combines all the minting methods
    public void mint()
    {
        this.smelt();
        if(this.fail == false)
        {
            this.inspect();
            if(this.fail == false)
            {
                this.smooth();
                if(this.fail == false)
                {
                    this.polish();
                    if(this.fail == false)
                    {
                        System.out.println("(" 
                        + this.getClass().getName() 
                        + ") $" + this.getVal());
                    }
                    else
                    {
                    System.out.println("Failed to manufacture coin.");
                    }
                    
                }
                else
                {
                    System.out.println("Failed to manufacture coin.");
                }
            }
            else
            {
                System.out.println("Failed to manufacture coin.");
            }
        }
        else 
        {
            System.out.println("Failed to manufacture coin.");
        }       
    }
    
}

public class Penny extends Coin{
    private String code = "USD";
    private double val = 0.01;
    private String name = "Penny";

    public String getName() {
        return this.name();   
    }

   
    public String getCode(){
        return code;
    }

    public double getVal() {
        return val;
    }
    
}


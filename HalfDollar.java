public class HalfDollar extends Coin { 
    private String code = "USD";
    private double val = .5;
    private String name = "HalfDollar";

    public String getName() {
        return this.name();   
    }

    public String getCode() {
        return this.code;
    }

    public double getVal() {
        return this.val;
    }
}

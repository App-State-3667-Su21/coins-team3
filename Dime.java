public class Dime extends Coin {
    private String code = "USD";
    private double val = 0.1;
    private String name = "Dime";

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

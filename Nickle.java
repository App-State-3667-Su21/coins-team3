public class Nickle extends Coin {
    private String code = "USD";
    private double val = 0.05;
    private String name = "Nickel";

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

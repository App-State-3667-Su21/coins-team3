public class Dollar extends Coin {
    private String code = "USD";
    private double val = 1;
    private String name = "Dollar";

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

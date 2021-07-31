public class Quarter extends Coin {
    private String code = "USD";
    private double val = 0.25;
    private String name = "Quarter";

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

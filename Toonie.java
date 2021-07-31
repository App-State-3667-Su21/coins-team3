public class Toonie extends Coin {
    private String code = "CAD";
    private double val = 2;
    private String name = "Toonie";

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

public class FiftyCent extends Coin { 
    private String code = "CAD";
    private double val = .5;
    private String name = "FiftyCent";

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

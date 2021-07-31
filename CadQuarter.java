public class CadQuarter extends Coin {
    private String code = "CAD";
    private double val = 0.25;
    private String name = "CadQuarter";

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

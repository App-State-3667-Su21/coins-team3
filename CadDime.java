public class CadDime extends Coin {
    private String code = "CAD";
    private double val = 0.1;
    private String name = "CadDime";

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

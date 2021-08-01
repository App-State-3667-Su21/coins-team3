public class Context{
    private SmeltStrategy strategy;

    public Context(String coinClass){
        if(coinClass.equals("Penny")) strategy = new PennySmelt();
        else if(coinClass.equals("Nickel")) strategy = new NickelSmelt();
        else if(coinClass.equals("Dime")) strategy = new DimeSmelt();
        else if(coinClass.equals("Quarter")) strategy = new QuarterSmelt();
        else if(coinClass.equals("HalfDollar")) strategy = new HalfDollarSmelt();
        else if(coinClass.equals("Dollar")) strategy = new DollarSmelt();

        else if(coinClass.equals("CadNickel")) strategy = new CadNickelSmelt();
        else if(coinClass.equals("CadDime")) strategy = new CadDimeSmelt();
        else if(coinClass.equals("CadQuarter")) strategy = new CadQuarterSmelt();
        else if(coinClass.equals("FiftyCent")) strategy = new FiftyCentSmelt();
        else if(coinClass.equals("Loonie")) strategy = new LoonieSmelt();
        else if(coinClass.equals("Toonie")) strategy = new ToonieSmelt();
        else System.out.println("Context fucked up");
    }

    public void executeSmeltStrategy(){
        strategy.doOperation();
    }
}
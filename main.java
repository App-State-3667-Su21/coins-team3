public class main{

    public static void main(String args[]) {

        
        /**CanadaMint Montreal = new CanadaMint("Canadian Mint");
        System.out.println(Montreal.getName());
        System.out.println(Montreal.getLocation());
        Montreal.makeCoins();
        */
       
        
        System.out.println(CanadaMint.getInstance().getName());
        System.out.println(CanadaMint.getInstance().getLocation());
        USAMint.getInstance().makeCoins();
        CanadaMint.getInstance().makeCoins(); 
        //Penny Orange = new Penny();
        //System.out.println(Orange.getClass().getName());
        
    }
}

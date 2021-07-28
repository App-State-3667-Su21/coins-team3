public class main{

    public static void main(String args[]) {

        USAMint WashingtonDC = new USAMint("Washington D.C.", "Capitol Mint");
        System.out.println(WashingtonDC.getName());
        System.out.println(WashingtonDC.getLocation());
        WashingtonDC.makeCoins();

        Penny Pen = new Penny();
        System.out.println(Pen.getVal());
        System.out.println(Pen.getCode());
    }
}

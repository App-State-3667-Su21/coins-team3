public class NullCoin extends Coin
    {
        public String getCode(){return null;}
        public double getVal(){return 0;}
        public void smelt(){}
        public void inspect(){}
        public void smooth(){}
        public void polish(){}
        public void mint(){}
        public static NullCoin NULLCOIN = new NullCoin();
    }

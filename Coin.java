package chapter8;

public class Coin {
    public double coinValue;
    public String coinName;
    public Coin(double value,String coinName){
        this.coinName = coinName;
        this.coinValue = value;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public String getCoinName() {
        return coinName;
    }
}

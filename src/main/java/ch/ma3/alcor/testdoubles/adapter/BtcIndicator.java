package ch.ma3.alcor.testdoubles.adapter;

public class BtcIndicator {
    private int price;
    private float percent24h;


    public BtcIndicator(int price) {
        this(price, 0f);
    }

    public BtcIndicator(float percent24h) {
        this(0, percent24h);
    }

    public BtcIndicator(int price, float percent24h) {
        this.price = price;
        this.percent24h = percent24h;
    }

    public String printPrice() {
        return price + "";
    }

    public String printGreenOrRed() {
        if (percent24h > 0) {
            return "GREEN";
        }
        return "RED";
    }
}

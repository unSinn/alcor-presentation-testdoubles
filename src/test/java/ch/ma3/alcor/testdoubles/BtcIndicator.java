package ch.ma3.alcor.testdoubles;

public class BtcIndicator {
    private int price;

    public BtcIndicator(int price) {
        this.price = price;
    }

    public String printPrice() {
        return price + "";
    }
}

package ch.ma3.alcor.testdoubles;

public final class BtcIndicator {

    private final Price price;
    private final Percent24h percent24h;

    public BtcIndicator(BtcDataSource btcDataSource) {
        this(
                btcDataSource.getData().price(),
                btcDataSource.getData().percent24h()
        );
    }

    public BtcIndicator(Price price, Percent24h percent24h) {
        this.price = price;
        this.percent24h = percent24h;
    }

    public String print() {
        return price + " " + percent24h;
    }

}

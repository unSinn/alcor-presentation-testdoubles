package ch.ma3.alcor.testdoubles;

public final class BtcIndicator {

    private final PriceIndicator priceIndicator;
    private final ColorIndicator colorIndicator;

    public BtcIndicator(PriceIndicator priceIndicator,
                        ColorIndicator colorIndicator) {
        this.priceIndicator = priceIndicator;
        this.colorIndicator = colorIndicator;
    }

    public BtcIndicator(BtcDataSource btcDataSource) {
        this(new PriceIndicator(btcDataSource.getData().price()),
                new ColorIndicator(btcDataSource.getData().percent24h()));
    }

    public String print() {
        return priceIndicator.printPrice() + " " + colorIndicator.print();
    }

}

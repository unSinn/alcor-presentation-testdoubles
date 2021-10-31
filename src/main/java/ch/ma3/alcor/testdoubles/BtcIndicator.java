package ch.ma3.alcor.testdoubles;

public record BtcIndicator(PriceIndicator priceIndicator,
                           ColorIndicator colorIndicator) {

    public String print() {
        return priceIndicator.printPrice() + " " + colorIndicator.print();
    }
}

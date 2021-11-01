package ch.ma3.alcor.testdoubles;

public record LinePrinter(BtcData btcData) {
    public String print() {
        return btcData.price() + " " + btcData.percent24h();
    }
}

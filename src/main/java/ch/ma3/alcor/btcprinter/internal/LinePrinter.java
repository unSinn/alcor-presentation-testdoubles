package ch.ma3.alcor.btcprinter.internal;

public record LinePrinter(BtcData btcData) {
    public String print() {
        return btcData.price() + " " + btcData.percent24h();
    }
}

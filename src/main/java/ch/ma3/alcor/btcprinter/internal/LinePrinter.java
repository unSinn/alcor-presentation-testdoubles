package ch.ma3.alcor.btcprinter.internal;

import java.util.Objects;

public record LinePrinter(BtcData btcData) {

    public String print() {
        return btcData.price() + " " + btcData.percent24h();
    }

}

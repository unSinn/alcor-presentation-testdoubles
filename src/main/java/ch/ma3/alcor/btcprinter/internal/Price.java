package ch.ma3.alcor.btcprinter.internal;

import java.util.Objects;

public record Price(int value) {

    public String toString() {
        return value + ".-";
    }

}

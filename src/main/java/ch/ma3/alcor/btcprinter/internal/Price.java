package ch.ma3.alcor.btcprinter.internal;

public record Price(int value) {
    public String toString() {
        return value + ".-";
    }
}

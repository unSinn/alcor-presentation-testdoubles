package ch.ma3.alcor.btcprinter.internal;

public record Percent24h(float value) {

    public String toString() {
        if (value > 0) {
            return "GREEN";
        }
        return "RED";
    }
}

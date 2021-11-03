package ch.ma3.alcor.btcprinter.internal;

import static ch.ma3.alcor.btcprinter.internal.Color.RED;

public record Percent24h(float value) {

    public String toString() {
        if (value > 0) {
            return "GREEN";
        }
        return "RED";
    }

    public Color getColor() {
        if (value > 0) {
            return Color.GREEN;
        }
        return RED;
    }
}

package ch.ma3.alcor.testdoubles;

public record Percent24h(float value) {

    public String toString() {
        if (value > 0) {
            return "GREEN";
        }
        return "RED";
    }
}

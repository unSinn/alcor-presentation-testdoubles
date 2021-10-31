package ch.ma3.alcor.testdoubles;

public record ColorIndicator(float percent24h) {

    public String print() {
        if (percent24h > 0) {
            return "GREEN";
        }
        return "RED";
    }
}

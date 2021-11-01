package ch.ma3.alcor.testdoubles;

public record Price(int value) {

    public String toString() {
        return value + ".-";
    }
}

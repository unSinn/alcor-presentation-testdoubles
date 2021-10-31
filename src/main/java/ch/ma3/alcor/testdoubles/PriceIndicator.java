package ch.ma3.alcor.testdoubles;

public record PriceIndicator(int price) {

    public String printPrice() {
        return price + "";
    }
}

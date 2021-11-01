package ch.ma3.alcor.testdoubles;

import ch.ma3.alcor.testdoubles.BtcData;

import java.util.Random;

public class BtcDataSource {
    public BtcData getData() {
        Random random = new Random();
        return new BtcData(new Price(random.nextInt(10000)), new Percent24h(random.nextFloat() + 0.5f));
    }
}

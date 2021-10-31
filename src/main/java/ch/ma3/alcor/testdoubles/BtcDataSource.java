package ch.ma3.alcor.testdoubles;

import ch.ma3.alcor.testdoubles.BtcData;

import java.util.Random;

public class BtcDataSource {
    public BtcData getData() {
        Random random = new Random();
        return new BtcData(random.nextInt(10000), random.nextFloat() + 0.5f);
    }
}

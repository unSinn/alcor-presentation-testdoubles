package ch.ma3.alcor.btcprinter.adapters;

import ch.ma3.alcor.btcprinter.internal.BtcData;
import ch.ma3.alcor.btcprinter.internal.Percent24h;
import ch.ma3.alcor.btcprinter.internal.Price;

import java.util.Random;

public class CoingeckoBtcDataSource {
    public BtcData getData() {
        Random random = new Random();
        return new BtcData(new Price(random.nextInt(10000)), new Percent24h(random.nextFloat() + 0.5f));
    }
}

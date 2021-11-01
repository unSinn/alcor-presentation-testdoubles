package ch.ma3.alcor.btcprinter.adapters;

import ch.ma3.alcor.btcprinter.internal.BtcData;
import ch.ma3.alcor.btcprinter.internal.BtcDataSource;
import ch.ma3.alcor.btcprinter.internal.Percent24h;
import ch.ma3.alcor.btcprinter.internal.Price;
import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

import java.util.Map;
import java.util.Random;

public class CoingeckoBtcDataSource implements BtcDataSource {

    public BtcData getData() {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        float price24 = (float) client.getCoinById("bitcoin").getMarketData().getPriceChange24h();
        int price = client.getCoinById("bitcoin").getMarketData().getCurrentPrice().get(Currency.CHF).intValue();

        client.shutdown();

        return new BtcData(new Price(price), new Percent24h(price24));
    }
}

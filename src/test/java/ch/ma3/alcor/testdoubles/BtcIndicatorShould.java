package ch.ma3.alcor.testdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BtcIndicatorShould {

    /**
     * Requirements
     * - Display Price of Bitcoin
     * - Indicate Green when price increased in the last 24h, Red if not
     */

    @BeforeEach
    void setUp() {
    }

    @Test
    void readFromSource() {
        int price = 543;
        float percent24h = 0.3f;
        BtcDataSource btcDataSource = mock(BtcDataSource.class);
        when(btcDataSource.getData()).thenReturn(new BtcData(new Price(price), new Percent24h(percent24h)));

        new BtcIndicator(btcDataSource).print();

    }

    @Test
    void printLine() {
        Price price = new Price(543);
        Percent24h percent24h = new Percent24h(0.3f);
        BtcIndicator btcIndicator = new BtcIndicator(price, percent24h);

        String printed = btcIndicator.print();

        assertThat(printed, is("543.- GREEN"));
    }

    @ParameterizedTest
    @CsvSource({
            "123,'123.-'",
            "421,'421.-'"
    })
    void printPriceOfBitcoin(int priceInt, String expectedPrint) {
        Price price = new Price(priceInt);

        String printed = price.toString();

        assertThat(printed, is(expectedPrint));
    }

    @ParameterizedTest
    @CsvSource({
            "0.5,'GREEN'",
            "-0.5,'RED'"
    })
    void printGreenOrRed_(float percent24hFloat, String expectedPrint) {
        Percent24h percent24h = new Percent24h(percent24hFloat);

        String printed = percent24h.toString();

        assertThat(printed, is(expectedPrint));
    }


}

package ch.ma3.alcor.testdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BtcIndicatorShould {

    /**
     * Requirements
     * - Display Price of Bitcoin
     * - Indicate Green when price increased in the last 24h, Red if not
     */

    @BeforeEach
    void setUp() {
    }


    @ParameterizedTest
    @CsvSource({
            "123,'123.-'",
            "421,'421.-'"
    })
    void printPriceOfBitcoin(int price, String expectedPrint) {
        String printed = new PriceIndicator(price).printPrice();
        assertThat(printed, is(expectedPrint));
    }

    @ParameterizedTest
    @CsvSource({
            "0.5,'GREEN'",
            "-0.5,'RED'"
    })
    void printGreenOrRed_(float percent24h, String expectedPrint) {
        String printed = new ColorIndicator(percent24h).print();
        assertThat(printed, is(expectedPrint));
    }

}

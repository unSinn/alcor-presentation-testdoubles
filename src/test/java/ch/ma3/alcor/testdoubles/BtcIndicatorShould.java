package ch.ma3.alcor.testdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
            "123,'123'",
            "421,'421'"
    })
    void printPriceOfBitcoin123(int givenPrice, String expectedPrint) {
        String printed = new BtcIndicator(givenPrice).printPrice();
        assertThat(printed, is(expectedPrint));
    }
}

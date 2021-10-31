package ch.ma3.alcor.testdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BtcIndicatorShould {

    private int actualPrice;

    /**
     * Requirements
     * - Display Price of Bitcoin
     * - Indicate Green when price increased in the last 24h, Red if not
     */

    @BeforeEach
    void setUp() {
    }

    @Test
    void printPriceOfBitcoin() {
        actualPrice = new BtcIndicator().printPrice();
        assertThat(actualPrice, is(123));
    }


}

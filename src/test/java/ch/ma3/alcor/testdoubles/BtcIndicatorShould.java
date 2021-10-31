package ch.ma3.alcor.testdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void fetchPriceOfBitcoin() {
        assertThat(true, is(true));
    }


}

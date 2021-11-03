package ch.ma3.alcor.btcprinter.internal;

import ch.ma3.alcor.btcprinter.internal.BtcDataSource;
import ch.ma3.alcor.btcprinter.internal.BtcPrinterService;
import ch.ma3.alcor.btcprinter.internal.Price;
import ch.ma3.alcor.btcprinter.internal.TerminalProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class BtcPrinterShould {

    /**
     * Requirements
     * - Display Price of Bitcoin in the Termnial
     * - Indicate Green when price increased in the last 24h, Red if not
     */

    @BeforeEach
    void setUp() {
    }

    @Test
    void writeToTerminal() {
        int price = 543;
        float percent24h = 0.3f;
        BtcDataSource btcDataSource = mock(BtcDataSource.class);
        TerminalProxy terminalProxy = mock(TerminalProxy.class);
        when(btcDataSource.getData()).thenReturn(new BtcData(new Price(price), new Percent24h(percent24h)));

        new BtcPrinterService(btcDataSource, terminalProxy).print();

        verify(terminalProxy).write("543.- GREEN");
    }


    @Test
    void printLine() {
        BtcData btcData = new BtcData(new Price(543), new Percent24h(0.3f));
        LinePrinter linePrinter = new LinePrinter(btcData);

        String printed = linePrinter.print();

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
    void printGreenOrRed(float percent24hFloat, String expectedPrint) {
        Percent24h percent24h = new Percent24h(percent24hFloat);

        String printed = percent24h.toString();

        assertThat(printed, is(expectedPrint));
    }

    @ParameterizedTest
    @CsvSource({
            "0.5,'GREEN'",
            "-0.5,'RED'"
    })
    void printGreenOrRed(float percent24hFloat, Color expectedColor) {
        Percent24h percent24h = new Percent24h(percent24hFloat);

        Color printed = percent24h.getColor();

        assertThat(printed, is(expectedColor));
    }


}

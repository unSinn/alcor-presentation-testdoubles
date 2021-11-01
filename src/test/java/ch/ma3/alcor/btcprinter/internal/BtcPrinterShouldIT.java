package ch.ma3.alcor.btcprinter.internal;

import ch.ma3.alcor.btcprinter.Main;
import ch.ma3.alcor.btcprinter.adapters.CoingeckoBtcDataSource;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class BtcPrinterShouldIT {

    @Test
    void smoke() {
        Main.main();
    }

    @Test
    void writeToTerminal() {
        ITTerminalProxy terminalProxy = new ITTerminalProxy();
        new BtcPrinterService(new CoingeckoBtcDataSource(), terminalProxy).print();
        assertThat(terminalProxy.lastline, is(notNullValue()));
    }
}

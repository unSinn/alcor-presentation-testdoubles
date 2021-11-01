package ch.ma3.alcor.btcprinter;

import ch.ma3.alcor.btcprinter.adapters.CoingeckoBtcDataSource;
import ch.ma3.alcor.btcprinter.adapters.ShellTerminalProxy;
import ch.ma3.alcor.btcprinter.internal.BtcPrinterService;

public class Main {
    public static void main(String... args) {
        new BtcPrinterService(new CoingeckoBtcDataSource(), new ShellTerminalProxy()).print();
    }
}

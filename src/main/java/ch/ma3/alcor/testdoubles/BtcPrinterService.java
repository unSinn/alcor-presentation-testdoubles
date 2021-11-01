package ch.ma3.alcor.testdoubles;

public final class BtcPrinterService {

    private final TerminalProxy terminalProxy;
    private final LinePrinter linePrinter;

    public BtcPrinterService(BtcDataSource btcDataSource, TerminalProxy terminalProxy) {
        this.terminalProxy = terminalProxy;
        this.linePrinter = new LinePrinter(btcDataSource.getData());
    }


    public void print() {
        terminalProxy.write(linePrinter.print());
    }

}

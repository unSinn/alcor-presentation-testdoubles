package ch.ma3.alcor.btcprinter.internal;

import ch.ma3.alcor.btcprinter.internal.TerminalProxy;

public class ITTerminalProxy implements TerminalProxy {


    String lastline = "NOTHING";

    @Override
    public void write(String line) {
        lastline = line;
    }

    public String getLastline() {
        return lastline;
    }

}

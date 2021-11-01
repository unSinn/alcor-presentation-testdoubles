package ch.ma3.alcor.btcprinter.internal;

public class ITTerminalProxy implements TerminalProxy {

    String lastline = "NOTHING";

    @Override
    public void write(String line) {
        lastline = line;
    }

}

package ch.ma3.alcor.btcprinter.adapters;

import ch.ma3.alcor.btcprinter.internal.TerminalProxy;

public class ShellTerminalProxy implements TerminalProxy {
    @Override
    public void write(String line) {
        System.out.println(line);
    }
}

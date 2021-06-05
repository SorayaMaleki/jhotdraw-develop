package org.jhotdraw.io;

public abstract class Gzip {
    public abstract String encodeBytes(byte[] source, int off, int len, int dontBreakLines);
}
package com.indeed.util.serialization;

import org.apache.log4j.Logger;

/**
 * @author jplaisance
 */
public final class ByteStringifier implements Stringifier<Byte> {
    private static final Logger log = Logger.getLogger(ByteStringifier.class);

    @Override
    public String toString(Byte aByte) {
        return aByte.toString();
    }

    @Override
    public Byte fromString(String str) {
        return Byte.parseByte(str);
    }
}

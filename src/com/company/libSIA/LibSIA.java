package com.company.libSIA;

import com.sun.jna.Memory;

public class LibSIA {
    protected Memory getStringMemory(String string) {
        Memory mString = new Memory(string.length() + 1);
        mString.setString(0, string);
        return mString;
    }

}

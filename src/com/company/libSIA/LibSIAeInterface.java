package com.company.libSIA;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface LibSIAeInterface extends Library {
    LibSIAeInterface INSTANCE = (LibSIAeInterface) Native.loadLibrary((Platform.isWindows() ? "libSIAE" : "libSiae.so"), LibSIAeInterface.class);
//    LibSIAeInterface INSTANCE = (LibSIAeInterface) Native.loadLibrary((Platform.isWindows() ? "libSIAE" : "libSIAE"), LibSIAeInterface.class);

    // it's possible to check the platform on which program runs, for example purposes we assume that there's a linux port of the library (it's not attached to the downloadable project)

    int Finalize();                      // void simpleCall();

    int isCardIn(int Slot);              // void simpleCall();
}

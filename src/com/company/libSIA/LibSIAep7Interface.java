package com.company.libSIA;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;

public interface LibSIAep7Interface extends Library {
//    LibSIAep7Interface INSTANCE = (LibSIAep7Interface) Native.loadLibrary((Platform.isWindows() ? "libSIAEp7" : "libsiaep7"), LibSIAep7Interface.class);
    LibSIAep7Interface INSTANCE = (LibSIAep7Interface) Native.loadLibrary((Platform.isWindows() ? "libSIAEp7" : "libSIAEp7"), LibSIAep7Interface.class);

    // it's possible to check the platform on which program runs, for example purposes we assume that there's a linux port of the library (it's not attached to the downloadable project)
//    byte giveVoidPtrGetChar(Pointer param); // char giveVoidPtrGetChar(void* param);


    int Finalize();                      // void simpleCall();

    //    int pPKCS7SignML(int Slot);              // void simpleCall();
    int PKCS7SignML(Pointer pin, long slot, Pointer szInputFileName, Pointer szOutputFileName, int bInitialize);

//    String pin = "13633854";
//    Memory mPin = new Memory(pin.length()+1);
//        mPin.setString(0,pin);
//    String inputFile = "test.txt";
//    Memory mInputFile = new Memory(inputFile.length()+1);
//        mInputFile.setString(0,inputFile);
//    String outputFile = "test.txt";
//    Memory mOutputFile = new Memory(outputFile.length()+1);
//        mOutputFile.setString(0,outputFile);


//    res = PKCS7SignML(mPin, 0, mInputFile, mOutputFile, 1);
//    res = pPKCS7SignML(pin, 0, "test.txt", "test.txt.p7m", TRUE);
}

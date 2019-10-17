package com.company;

import com.company.libSIA.LibSIAe;
import com.company.libSIA.LibSIAep7;
import com.sun.jna.Memory;

import java.util.StringTokenizer;

public class Main {

    public static final String directory = System.getProperty("user.dir");

//    public interface simpleDLL extends Library {
//
//        simpleDLL INSTANCE = (simpleDLL) Native.loadLibrary(
//                (Platform.isWindows() ? "libSIAE" : "libSIAE"), simpleDLL.class);
//
//        // it's possible to check the platform on which program runs, for example purposes we assume that there's a linux port of the library (it's not attached to the downloadable project)
//        byte giveVoidPtrGetChar(Pointer param); // char giveVoidPtrGetChar(void* param);
//
//        int giveVoidPtrGetInt(Pointer param);   //int giveVoidPtrGetInt(void* param);
//
//        int giveIntGetInt(int a);               // int giveIntGetInt(int a);
//
//        void simpleCall();                      // void simpleCall();
//
//        int Finalize();                      // void simpleCall();
//
//        int isCardIn(int Slot);              // void simpleCall();
//    }

    public static void main(String[] args) {

        String property = System.getProperty("java.library.path");
        StringTokenizer parser = new StringTokenizer(property, ";");
        while (parser.hasMoreTokens()) {
            System.err.println(parser.nextToken());
        }
        System.load(directory + "/Linux-bin/libsiae/libsiae.so");
        System.loadLibrary("libSiae.so");

        //ardit test


//        System.out.println("LibSIA.getInstance().Finalize() = " + LibSIAe.getInstance().isCardIn(0));
//        String pin = "13633854";
//        String inputFile = directory + "\\test.txt";
//        String outputFile = directory + "\\test.txt.p7m";
//
//        if (args.length > 0) {
//            inputFile = directory + "\\" + args[0];
//            outputFile = directory + "\\" + args[0] + ".p7m";
//        }
//        System.out.println("inputFile = " + inputFile);
//        System.out.println("outputFile = " + outputFile);
//
//        Memory mPin = new Memory(pin.length() + 1);
//        mPin.setString(0, pin);
//        Memory mInputFile = new Memory(inputFile.length() + 1);
//        mInputFile.setString(0, inputFile);
//        Memory mOutputFile = new Memory(outputFile.length() + 1);
//        mOutputFile.setString(0, outputFile);
//
//
//        System.out.println(LibSIAep7.getInstance().PKCS7SignML(mPin, 0, mInputFile, mOutputFile, 1));

    }
}

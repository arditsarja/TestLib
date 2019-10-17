package com.company.libSIA;

import com.sun.jna.Platform;

import java.io.File;

import static com.company.Main.directory;

public class LibSIAe implements LibSIAeInterface {
    LibSIAeInterface lib;
    public static LibSIAe libSIA;

    public LibSIAe() {
        System.out.println("directory = " + directory);
        String path = "";
        if (Platform.isWindows()) {
            path = directory + "\\Win32-Bin\\libsiae\\x64\\libSIAE.dll";
            System.load(path);
        } else {
//            path = directory + "/Win32-Bin/libsiae/x64/libSIAE.lib";
            path = directory + "/Linux-bin/libsiae/libsiae.so";
        }
//        System.out.println("path = " + path);
//        File file = new File(path);
//        System.out.println("file.exists() = " + file.exists());
//        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" );
//        try {
//            System.load(file.getAbsolutePath());
//            System.out.println(" Library loaded ");
//        } catch (UnsatisfiedLinkError e) {
//            System.err.println("Native code library failed to load.\n" + e);
//            System.exit(1);
//        }
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" );
//
//        System.out.println("BlaLBaLba" );
//        System.out.println("BlaLBaLba" );
//
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" );
        this.lib = LibSIAeInterface.INSTANCE;
    }

    public static synchronized LibSIAe getInstance() {
        if (libSIA == null) {
            libSIA = new LibSIAe();
        }
        return libSIA;
    }


    @Override
    public int Finalize() {
        return lib.Finalize();
    }

    @Override
    public int isCardIn(int Slot) {
        return lib.isCardIn(Slot);
    }
}

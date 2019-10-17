package com.company.libSIA;

import com.sun.jna.Platform;
import com.sun.jna.Pointer;

import java.io.File;

import static com.company.Main.directory;

public class LibSIAep7 implements LibSIAep7Interface {
    LibSIAep7Interface lib;
    public static LibSIAep7 libSIA;

    public LibSIAep7() {
        System.out.println("directory = " + directory);
        String path = "";
        if (Platform.isWindows()) {
            path = directory + "\\Win32-Bin\\libsiaep7\\x64\\libSIAEp7.dll";
            System.load(path);
        } else {
            path = directory + "/Win32-Bin/libsiaep7/x64/libSIAEp7.lib";
//            path = directory + "/Linux-bin/libsiaep7/libsiaep7.so";
        }
//        System.out.println("path = " + path);
//        File file = new File(path);
//        System.out.println("file.exists() = " + file.exists());
//        try {
//            System.load(file.getAbsolutePath());
//            System.out.println(" Library loaded ");
//        } catch (UnsatisfiedLinkError e) {
//            System.err.println("Native code library failed to load.\n" + e);
//            System.exit(1);
//        }
        this.lib = LibSIAep7Interface.INSTANCE;
    }

    public static synchronized LibSIAep7 getInstance() {
        if (libSIA == null) {
            libSIA = new LibSIAep7();
        }
        return libSIA;
    }


    @Override
    public int Finalize() {
        return lib.Finalize();
    }

    @Override
    public int PKCS7SignML(Pointer pin, long slot, Pointer szInputFileName, Pointer szOutputFileName, int bInitialize) {
        return lib.PKCS7SignML(pin, slot, szInputFileName, szOutputFileName, bInitialize);
    }
}

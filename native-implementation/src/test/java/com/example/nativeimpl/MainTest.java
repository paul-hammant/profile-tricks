package com.example.nativeimpl;

import com.example.api.demo.Main;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MainTest {

    @Test
    public void tesNativeImplTestCallingProcessIntervention() throws IOException {

        // Load the shared library
        String curr = new File(".").getCanonicalPath();
        System.load(curr + "/target/release/libnative_implementation.so");

        Main.main(new String[]{});
    }
}

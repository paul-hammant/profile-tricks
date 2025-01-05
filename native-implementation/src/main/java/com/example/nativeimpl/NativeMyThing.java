package com.example.nativeimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.api.MyThing;

public class NativeMyThing implements MyThing {
    private static final Logger logger = LogManager.getLogger(NativeMyThing.class);

    @Override
    public native void processIntervention();
}

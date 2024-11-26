package com.example.nativeimpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.api.MyThing;

public class NativeMyThing implements MyThing {
    private static final Logger logger = LogManager.getLogger(NativeMyThing.class);

    @Override
    public /*native*/ void processIntervention() {
        java.lang.String msg = "NativeMyThing: processIntervention called.";
        System.out.println(msg);
        logger.info(msg);
    }
}

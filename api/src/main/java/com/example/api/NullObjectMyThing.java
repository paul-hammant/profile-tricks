package com.example.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NullObjectMyThing implements MyThing {
    private static final Logger logger = LogManager.getLogger(NullObjectMyThing.class);

    @Override
    public void processIntervention() {
        String msg = "NullObjectMyThing: processIntervention called, but does nothing.";
        System.out.println(msg);
        logger.info(msg);
    }
}

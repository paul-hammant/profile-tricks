package com.example.api;

import com.example.api.demo.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NullObjectMyThing implements MyThing {

    @Override
    public void processIntervention() {
        System.out.println("NullObjectMyThing.processIntervention() has been called [Java]");
    }
}

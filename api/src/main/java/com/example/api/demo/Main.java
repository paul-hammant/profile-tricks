package com.example.api.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.example.api.MyThing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.api.NullObjectMyThing;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        MyThing myThing;

        try {
            myThing = (MyThing) Class.forName("com.example.nativeimpl.NativeMyThing").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            myThing = new NullObjectMyThing();
        }

        myThing.processIntervention();

    }

}

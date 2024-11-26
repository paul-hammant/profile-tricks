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
    public /*native*/ void processIntervention() {
        String msg = "NativeMyThing: processIntervention called.";
        System.out.println(msg);
        logger.info(msg);
        readAndLogResource();
    }

    private void readAndLogResource() {
        try (InputStream inputStream = NativeMyThing.class.getResourceAsStream("/sample.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Resource content: " + line);
            }
        } catch (IOException e) {
            System.out.println("Failed to read resource file" + e.getMessage());
        }
    }
}

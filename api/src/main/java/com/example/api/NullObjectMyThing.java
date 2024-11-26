package com.example.api;

import com.example.api.demo.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NullObjectMyThing implements MyThing {
    private static final Logger logger = LogManager.getLogger(NullObjectMyThing.class);

    @Override
    public void processIntervention() {
        String msg = "NullObjectMyThing: processIntervention called, but does nothing.";
        System.out.println(msg);
        logger.info(msg);
        readAndLogResource();
    }

    private static void readAndLogResource() {
        try (InputStream inputStream = Main.class.getResourceAsStream("/sample.txt");
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

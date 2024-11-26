package com.example.api.demo;

import com.example.api.MyThing;
import com.example.api.NullObjectMyThing;

public class Main {

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

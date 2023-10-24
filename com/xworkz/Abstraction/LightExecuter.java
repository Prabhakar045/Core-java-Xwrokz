package com.xworkz.Abstraction;

public class LightExecuter {
    public static void main(String[] args) {
        Switch tubelightSwitch = new Tubelight();
        //reference will of Switch type or Interface type and object creation of Class type
        // Abstraction achieved through only interface
        tubelightSwitch.sOn();
    }
}

package com.xworkz.AirfortManagement;

public class AirfortTester {

    public static void main(String[] args) {

        // Create objects for Airfort and Terminals
        Airfort air = new Airfort();
        Terminals terminals = new Terminals();

        // Set properties for the objects
        air.setTerminals(terminals);               // Setting terminals for the airfort
        air.setAirffortId(1);                      // Setting airfortId for the airfort
//        terminals.setTerminalId(1);                // Setting terminalId for the terminals

        // Accessing properties and printing
        System.out.println("Airfort Id: " + air.getAirffortId());
        System.out.println("Terminal Id: " + air.getTerminals());
    }
}

























































































//package com.xworkz.AirfortManagement;
//
//
//
//    public class AirfortTester {
//
//        public static void main(String[] args) {
//
//            air.setTerminals(terminals);      // airfort. terminals = terminal1;
//            terminals.terminalId = 1;
//
//            String str = "1";
//            System.out.print(str.length());
//
//            System.out.println("");
//
//
//            air.setTerminal
//        }
//    }
//
//

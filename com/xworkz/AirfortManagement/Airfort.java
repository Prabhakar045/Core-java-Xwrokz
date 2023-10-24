package com.xworkz.AirfortManagement;


import lombok.*;

// lombok
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Data
public class Airfort {

    // Has A relationship
    private Terminals terminals;     // declaration indicates it has terminal
    private int airffortId;

}

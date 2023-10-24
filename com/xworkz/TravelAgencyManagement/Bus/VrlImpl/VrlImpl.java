package com.xworkz.TravelAgencyManagement.Bus.VrlImpl;

import com.xworkz.TravelAgencyManagement.Bus.AbhiBus;

public  class VrlImpl implements AbhiBus {

    @Override
    public int minBooking() {
        return 20;
    }

    @Override
    public boolean goodCondition() {
        return true;

    }
}

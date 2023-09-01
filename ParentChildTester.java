package com.xworkz.ParentchildPolymorphism;

public class ParentChildTester {
    public static void main(String[] args) {

        // Up Casting (parent Reference) Referene is parent type and object creation is Child type
        // From specific to generic & Up & It is created automitically
        Parent parent = new Child();    //
        parent.business();
        parent.videoCreator();

        // Down Casting (Child reference)   -> from generic to specific
        // Explicit type casting
        Child child = (Child) parent;
        child.business();
        child.videoCreator();

        // Down Casting
        Child1 child1 = (Child1) parent;
        child1.coding();
    }
}

package com.softserve.edu06.OOP.Animal;

/*  Create interface Animal with methods voice() and feed(). Create two classes Cat and Dog, which implement this interface.
    Create array of Animal and add some Cats and Dogs to it.
    Call voice() and feed() method for all of it
 */


public interface Animal {
    void voice();
    void feed();

    default public void running() {
        System.out.println("animal is running");
    }
}

package com.javarush.task.task29.task2909.car;

/**
 * Created by Victor on 18.09.2017.
 */
public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers) {
        super(Car.CABRIOLET, numberOfPassengers);
    }
    @Override
    public int getMaxSpeed() {
        final int MAX_CABRIOLET_SPEED = 90;
        return MAX_CABRIOLET_SPEED;
    }
}

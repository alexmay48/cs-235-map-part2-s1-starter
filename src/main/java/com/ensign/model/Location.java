package com.ensign.model;

public abstract class Location {

	abstract public double distanceBetweenLocation(Location loc);

	abstract public double travelTimeToLocation(Location loc);

}

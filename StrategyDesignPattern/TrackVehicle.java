package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.TrackVehicleCapability;

public class TrackVehicle extends Vehicle {
	TrackVehicle(){
		super(new TrackVehicleCapability());
	}
}

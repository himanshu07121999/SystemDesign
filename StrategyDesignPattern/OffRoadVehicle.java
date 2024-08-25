package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {
	OffRoadVehicle(){super (new NormalDriveStrategy());}
}

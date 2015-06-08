package com.parksystem.model;
/**
 * 
 * @author IvanushkoSergey
 *
 */
public class Bus extends Vehicle{
	
	public Bus(){
		spotsNeeded=5;
		size=VehicleSize.Large;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

	@Override
	public void print() {
		System.out.print("Bus");
	}

}

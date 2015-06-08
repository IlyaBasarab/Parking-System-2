package com.parksystem.model;
/**
 * 
 * @author IvanushkoSergey
 *
 */
public class Motorcycle extends Vehicle {
	
	public Motorcycle(){
		spotsNeeded=1;
		size=VehicleSize.Motorcycle;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

	@Override
	public void print() {
		System.out.print("Motorcycle");
		
	}

}

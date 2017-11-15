package com.personal.designpatterns.factory;

public class VehicleFactory {

	public VehicleFactory(){
		
	}
	
	public Vehicle getVehicle(String type) {
		if(type.equals("4")) {
			return new FourWheeler();
		}else {
			return new TwoWheeler();
		}
	}
}

package com.demo.test;
import java.awt.Color;

public class Car {
	
	int averageMilesPerGalon;
	String licensePlate;
	Color paintColor;
	boolean areTailingWorking;
	
	public Car(int averageMilesPerGalon, String licensePlate, Color paintColor, boolean areTailingWorking) {
		super();
		this.averageMilesPerGalon = averageMilesPerGalon;
		this.licensePlate = licensePlate;
		this.paintColor = paintColor;
		this.areTailingWorking = areTailingWorking;
	}
	
	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}

	public int getAverageMilesPerGalon() {
		return averageMilesPerGalon;
	}

	public void setAverageMilesPerGalon(int averageMilesPerGalon) {
		this.averageMilesPerGalon = averageMilesPerGalon;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Color getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(Color paintColor) {
		this.paintColor = paintColor;
	}

	public boolean isAreTailingWorking() {
		return areTailingWorking;
	}

	public void setAreTailingWorking(boolean areTailingWorking) {
		this.areTailingWorking = areTailingWorking;
	}
	
	
}

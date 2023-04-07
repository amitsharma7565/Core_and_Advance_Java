package com.car.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarDetail {
	@Id
	private int id;
	private String brandName;
	private int wheelDrive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getWheelDrive() {
		return wheelDrive;
	}
	public void setWheelDrive(int wheelDrive) {
		this.wheelDrive = wheelDrive;
	}
	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", brandName=" + brandName + ", wheelDrive=" + wheelDrive + "]";
	}
	
}

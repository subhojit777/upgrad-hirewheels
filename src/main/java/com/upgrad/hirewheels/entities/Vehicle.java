package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private int vehicleId;

    @Column(length = 50, nullable = false)
    private String vehicleModel;

    @Column(nullable = false, length = 10)
    private String vehicleNumber;

    // TODO: FOREIGN KEY
    @Column(length = 10)
    private int vehicleSubcategoryId;

    @Column(length = 50, nullable = false)
    private String color;

    // TODO FOREIGN KEY
    @Column(nullable = false, length = 10)
    private int locationId;

    // TODO FOREIGN KEY
    @Column(length = 10, nullable = false)
    private int fuelTypeId;

    @Column(length = 1, nullable = false)
    private byte availabilityStatus;

    @Column(nullable = false, length = 500)
    private String vehicleImageUrl;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fuelTypeId +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public byte getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(byte availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }
}

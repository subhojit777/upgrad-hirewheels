package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private int vehicleSubcategoryId;

    @Column(unique = true, nullable = false, length = 50)
    private String vehicleSubcategoryName;

    @Column(scale = 10, precision = 2, nullable = false)
    private float pricePerDay;

    @Column(length = 10, nullable = false)
    private int vehicleCategoryId;

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategoryId=" + vehicleCategoryId +
                '}';
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }
}

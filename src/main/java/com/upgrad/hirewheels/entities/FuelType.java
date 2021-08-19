package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class FuelType {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId;

    @Column(nullable = false, unique = true, length = 50)
    private String fuelType;

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

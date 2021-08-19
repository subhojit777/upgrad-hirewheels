package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private int vehicleCategoryId;

    @Column(nullable = false, unique = true, length = 50)
    private String vehicleCategoryName;

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehicleCategoryId +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }
}

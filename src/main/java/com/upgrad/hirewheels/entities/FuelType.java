package com.upgrad.hirewheels.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class FuelType {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int fuelTypeId;

    @Column(nullable = false, unique = true, length = 50)
    @NonNull
    private String fuelType;

    @OneToMany(mappedBy = "fuelType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", fuelType='" + fuelType + '\'' +
                ", vehicles=" + vehicles +
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

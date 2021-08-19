package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;

    @Column(length = 50, nullable = false)
    private String locationName;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(nullable = false, length = 10)
    private int cityId;

    @Column(length = 6, nullable = false)
    private String pincode;

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", cityId=" + cityId +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

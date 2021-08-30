package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(nullable = false, name = "city_id")
    private City city;

    @Column(length = 6, nullable = false)
    private String pincode;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Booking> bookings;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Set<Vehicle> vehicles;

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", cityId=" + city +
                ", pincode='" + pincode + '\'' +
                ", bookings=" + bookings +
                ", vehicles=" + vehicles +
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

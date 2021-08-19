package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private int bookingId;

    @Column(nullable = false)
    private LocalDate pickupDate;

    @Column(nullable = false)
    private LocalDate dropoffDate;

    @Column(nullable = false)
    private LocalDate bookingDate;

    @Column(nullable = false, precision = 2, scale = 10)
    private float amount;

    // TODO foreign key
    @Column(length = 10, nullable = false)
    private int locationId;

    // TODO FOREIGN KEY
    @Column(length = 10, nullable = false)
    private int vehicleId;

    // TODO FOREIGN KEY
    @Column(length = 10, nullable = false)
    private int userId;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropoffDate=" + dropoffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", locationId=" + locationId +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                '}';
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDate getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(LocalDate dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

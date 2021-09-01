package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class InitServiceImpl implements InitService {
    private RoleDao roleDao;
    private UserDao userDao;
    private VehicleCategoryDao vehicleCategoryDao;
    private VehicleSubcategoryDao vehicleSubcategoryDao;
    private CityDao cityDao;
    private FuelTypeDao fuelTypeDao;
    private LocationDao locationDao;

    @Autowired
    public InitServiceImpl(RoleDao roleDao, UserDao userDao, VehicleCategoryDao vehicleCategoryDao, VehicleSubcategoryDao vehicleSubcategoryDao, CityDao cityDao, FuelTypeDao fuelTypeDao, LocationDao locationDao) {
        this.roleDao = roleDao;
        this.userDao = userDao;
        this.vehicleCategoryDao = vehicleCategoryDao;
        this.vehicleSubcategoryDao = vehicleSubcategoryDao;
        this.cityDao = cityDao;
        this.fuelTypeDao = fuelTypeDao;
        this.locationDao = locationDao;
    }

    @Override
    public void start() {
        addRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubcategory();
        addCity();
        addFuelType();
        addLocation();
    }

    private void addLocation() {
        Location location1 = new Location(1, "Worli", "Dr E Moses Rd, Worli Naka, Upper Worli", cityDao.findByCityName("Mumbai").get(), "400018");
        locationDao.save(location1);

        Location location2 = new Location(2, "Chembur", "Optic Complex", cityDao.findByCityName("Mumbai").get(), "400019");
        locationDao.save(location2);

        Location location3 = new Location(3, "Powai", "Hiranandani Tower", cityDao.findByCityName("Mumbai").get(), "400020");
        locationDao.save(location3);
    }

    private void addFuelType() {
        FuelType fuelType1 = new FuelType(1, "Petrol");
        fuelTypeDao.save(fuelType1);

        FuelType fuelType2 = new FuelType(2, "Diesel");
        fuelTypeDao.save(fuelType2);
    }

    private void addCity() {
        City city = new City(1, "Mumbai");
        cityDao.save(city);
    }

    private void addVehicleCategory() {
        VehicleCategory vehicleCategory1 = new VehicleCategory(1, "Car");
        VehicleCategory vehicleCategory2 = new VehicleCategory(2, "Bike");

        vehicleCategoryDao.saveAll(Arrays.asList(vehicleCategory1, vehicleCategory2));
    }

    private void addVehicleSubcategory() {
        VehicleSubcategory vehicleSubcategory1 = new VehicleSubcategory(1, "SUV", 300, vehicleCategoryDao.findByVehicleCategoryName("Car").get());
        VehicleSubcategory vehicleSubcategory2 = new VehicleSubcategory(2, "Sedan", 350, vehicleCategoryDao.findByVehicleCategoryName("Car").get());
        VehicleSubcategory vehicleSubcategory3 = new VehicleSubcategory(3, "Hatchback", 250, vehicleCategoryDao.findByVehicleCategoryName("Car").get());
        VehicleSubcategory vehicleSubcategory4 = new VehicleSubcategory(4, "Cruiser", 200, vehicleCategoryDao.findByVehicleCategoryName("Bike").get());
        VehicleSubcategory vehicleSubcategory5 = new VehicleSubcategory(5, "Dirt Bike", 200, vehicleCategoryDao.findByVehicleCategoryName("Bike").get());
        VehicleSubcategory vehicleSubcategory6 = new VehicleSubcategory(6, "Sports Bike", 150, vehicleCategoryDao.findByVehicleCategoryName("Bike").get());

        vehicleSubcategoryDao.saveAll(Arrays.asList(vehicleSubcategory1, vehicleSubcategory2, vehicleSubcategory3, vehicleSubcategory4, vehicleSubcategory5, vehicleSubcategory6));
    }

    private void addRole() {
        Role role1 = new Role(1, "Admin");
        Role role2 = new Role(2, "User");

        roleDao.saveAll(Arrays.asList(role1, role2));
    }

    private void addUsers() {
        User user1 = new User(1, "Upgrad", "Admin", "admin@123", "upgrad@gmail.com", "9999999999", roleDao.findByRoleName("Admin").get());

        userDao.save(user1);
    }
}

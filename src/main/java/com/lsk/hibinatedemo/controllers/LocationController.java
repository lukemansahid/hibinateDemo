package com.lsk.hibinatedemo.controllers;

import com.lsk.hibinatedemo.models.Location;
import com.lsk.hibinatedemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping("/locations/{id}")
    public Optional<Location> getLocationById(@PathVariable int id) {
        return locationService.findById(id);
    }
}

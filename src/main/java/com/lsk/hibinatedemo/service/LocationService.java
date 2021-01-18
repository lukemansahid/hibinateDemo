package com.lsk.hibinatedemo.service;

import com.lsk.hibinatedemo.models.Location;
import com.lsk.hibinatedemo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Optional<Location> findById(int id) {
        return locationRepository.findById(id);
    }
}

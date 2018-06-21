package ca.stevenlyall.mapappbackend;

import ca.stevenlyall.mapappbackend.entities.LocationMarker;
import ca.stevenlyall.mapappbackend.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationMarkerController {

    private LocationService locationService;

    @Autowired
    public LocationMarkerController(LocationService locationService) {
        this.locationService = locationService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/locationmarker")
    public LocationMarker[] locationMarker() {
        return locationService.getLocations();
    }
}

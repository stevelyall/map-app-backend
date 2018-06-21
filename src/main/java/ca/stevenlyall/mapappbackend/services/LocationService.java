package ca.stevenlyall.mapappbackend.services;

import ca.stevenlyall.mapappbackend.entities.LocationMarker;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private LocationMarker[] locations = new LocationMarker[]{
            new LocationMarker(
                    40.74052025477914,
                    -73.98732910156251,
                    "0b91a753-8fa8-4d12-9a50-0c0cd435c90a",
                    "Wed Jun 20 2018 20:56:55 GMT-0700 (Pacific Daylight Time)"),
            new LocationMarker(
                    40.72178851930687,
                    -73.66735229492188,
                    "798a4b9d-00dd-498c-9100-cdd9860a9eb8",
                    "Wed Jun 20 2018 20:57:51 GMT-0700 (Pacific Daylight Time)")
    };

    public LocationMarker[] getLocations() {
        return locations;
    }
}

package ca.stevenlyall.mapappbackend.entities;

public class LocationMarker {

    private double lat;
    private double lng;
    private String uid;
    private String timestamp;

    public LocationMarker(double lat, double lng, String uid, String timestamp) {
        this.lat = lat;
        this.lng = lng;
        this.uid = uid;
        this.timestamp = timestamp;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getUid() {
        return uid;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

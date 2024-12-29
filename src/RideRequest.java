class RideRequest {
    private String pickupLocation;
    private String dropoffLocation;

    public RideRequest(String pickupLocation, String dropoffLocation) {
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }
}

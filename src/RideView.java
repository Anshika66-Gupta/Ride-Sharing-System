class RideView {
    public void showRideDetails(RideRequest request, Driver driver) {
        System.out.println("Ride Details:");
        System.out.println("Pickup Location: " + request.getPickupLocation());
        System.out.println("Dropoff Location: " + request.getDropoffLocation());
        System.out.println("Assigned Driver: " + driver);
    }

    public void showNoDriverAvailable() {
        System.out.println("No drivers are available at the moment.");
    }
}
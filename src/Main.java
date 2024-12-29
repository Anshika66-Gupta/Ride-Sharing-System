public class Main {
    public static void main(String[] args) {
        RideController controller = new RideController();
        RideView view = new RideView();

        // Simulate a ride request
        RideRequest request = new RideRequest("Downtown", "Airport");

        // Find the best driver for the request
        Driver driver = controller.findBestDriver();

        // Show ride details or no driver available
        if (driver != null) {
            view.showRideDetails(request, driver);
        } else {
            view.showNoDriverAvailable();
        }
    }
}
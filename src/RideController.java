import java.util.ArrayList;
import java.util.List;

class RideController {
    private List<Driver> availableDrivers;

    public RideController() {
        availableDrivers = new ArrayList<>();
        loadDrivers();
    }

    private void loadDrivers() {
        availableDrivers.add(new Driver("Alice", "Sedan", 4.8));
        availableDrivers.add(new Driver("Bob", "SUV", 4.7));
        availableDrivers.add(new Driver("Charlie", "Hatchback", 4.6));
    }

    public Driver findBestDriver() {
        return availableDrivers.stream()
                .max((d1, d2) -> Double.compare(d1.getRating(), d2.getRating()))
                .orElse(null);
    }
}
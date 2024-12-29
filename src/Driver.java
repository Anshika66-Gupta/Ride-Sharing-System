class Driver {
    private String name;
    private String vehicle;
    private double rating;

    public Driver(String name, String vehicle, double rating) {
        this.name = name;
        this.vehicle = vehicle;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getVehicle() {
        return vehicle;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " (" + vehicle + ") - Rating: " + rating;
    }
}

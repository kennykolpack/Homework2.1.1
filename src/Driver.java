import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Driver {
    private final String name;
    private boolean driverLicense;
    private int experience;

    private Set<Driver> drivers;

    public Driver(String name, boolean driverLicense, int experience) {
        this.name = Objects.requireNonNullElse(name, "default");
        this.driverLicense = driverLicense;
        if(experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = Math.abs(experience);
        }
        drivers = new HashSet<>();
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() throws LicenseTypeException {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if(experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = Math.abs(experience);
        }
    }

    public abstract void drive();

    public abstract void stop();

    public abstract void refuel();

    public abstract void driversLicenseType() throws LicenseTypeException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }
}

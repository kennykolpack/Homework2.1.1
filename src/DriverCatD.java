public class DriverCatD extends Driver{
    public DriverCatD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void drive() {
        System.out.println("Водитель категории D " + getName() + " начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто.");
    }
}

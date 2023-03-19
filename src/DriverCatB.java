public class DriverCatB extends Driver{
    public DriverCatB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void drive() {
        System.out.println("Водитель категории B " + getName() + " начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории B " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getName() + " заправляет авто.");
    }
}

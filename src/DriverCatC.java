public class DriverCatC extends Driver{

    public DriverCatC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void drive() {
        System.out.println("Водитель категории C " + getName() + " начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории C " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто.");
    }

    public void driversLicenseType() {
        try {
            isDriverLicense();
        } catch (LicenseTypeException e) {
            System.out.println("Произошла ошибка");
            System.out.println("Необходимо указать тип прав!");
        }
    }
}

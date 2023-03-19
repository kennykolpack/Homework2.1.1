public class Bus extends Transport <DriverCatD> {

    public Bus(String brand, String model, float engineVolume, DriverCatD driverCatD) {
        super(brand, model, engineVolume, driverCatD);
    }

    @Override
    public void start() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус поехал на пит-стоп");
    }

    @Override
    public void bestLapTime(float bestLapTime) {
        System.out.println("Лучшее время круга " + getBrand() + ": " + bestLapTime);
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость " + getBrand() + ": " + maxSpeed);
    }

}

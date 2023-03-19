
public class Truck extends Transport <DriverCatC> {


    public Truck(String brand, String model, float engineVolume, DriverCatC driverCatC) {
        super(brand, model, engineVolume, driverCatC);
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль поехал на пит-стоп");
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

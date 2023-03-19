
import java.util.Objects;

public class Car extends Transport <DriverCatB> {

    public Car(String brand, String model, float engineVolume, DriverCatB driverCatB) {
        super(brand, model, engineVolume, driverCatB);
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль поехал на пит-стоп");
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

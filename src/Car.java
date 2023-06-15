
import java.util.ArrayList;
import java.util.Objects;

public class Car extends Transport <DriverCatB> {

private ArrayList<Transport> carList;

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        public final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова:" + getBodyType();
        }

    }

    public Car(String brand, String model, float engineVolume, DriverCatB driverCatB) {
        super(brand, model, engineVolume, driverCatB);
        carList = new ArrayList<>();
    }

    public ArrayList<Transport> getCarList() {
        return carList;
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

    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    public void passDiagnostics() {
        System.out.println("Легковой автомобиль проходит диагностику");
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

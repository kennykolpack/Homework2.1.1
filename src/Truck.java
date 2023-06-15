import java.util.ArrayList;

public class Truck extends Transport <DriverCatC> {

    private ArrayList<Transport> truckList;

    public enum LoadCapacity {
        N1 ("с полной массой до 3,5 тонн"),
        N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("(с полной массой свыше 12 тонн");
        private final String loadCapacity;
        LoadCapacity (String Type){
            this.loadCapacity = Type;
        }
        public String getLoadCapacity() {
            return loadCapacity;
        }
        @Override
        public String toString() {
            return "Грузоподъемность: " + getLoadCapacity();
        }
    }

    public Truck(String brand, String model, float engineVolume, DriverCatC driverCatC) {
        super(brand, model, engineVolume, driverCatC);
        truckList = new ArrayList<>();
    }

    public ArrayList<Transport> getTruckList() {
        return truckList;
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

    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    public void passDiagnostics() {
        System.out.println("Грузовой автомобиль проходит диагностику");
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

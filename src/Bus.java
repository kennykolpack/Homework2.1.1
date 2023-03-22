public class Bus extends Transport <DriverCatD> {

    public enum Capacity {
        ESPECIALLY_SMALL ("до 10 мест"),
        SMALL ("до 25 мест"),
        AVERAGE ("40–50 мест"),
        BIG ("60–80 мест"),
        EXTRA_LARGE ("100–120 мест");
        public final String capacity;

        Capacity (String capacity){
            this.capacity = capacity;
        }
        public String getCapacity() {
            return capacity;
        }
        @Override
        public String toString() {
            return "Вместимость: " + getCapacity();
        }
    }

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

    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не могут" + getBrand());
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

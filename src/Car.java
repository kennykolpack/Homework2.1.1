//Домашнее задание
import java.util.Objects;

public class Car extends Transport {
    private float engineVolume;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean winterTires;


    public float getEngineVolume() {
        return engineVolume;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Car(String brand, String model, String color, int productionYear, int maxSpeed, float engineVolume, String productionCountry, String transmission, String bodyType, String registrationNumber, int seatsNumber, boolean winterTires) {
        super(brand, model, color, productionYear, maxSpeed);
        if(engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        this.transmission = Objects.requireNonNullElse(transmission, "default");
        this.bodyType = Objects.requireNonNullElse(bodyType, "default");
        this.registrationNumber = Objects.requireNonNullElse(registrationNumber, "х000хх000");
        if(seatsNumber != 0) {
            this.seatsNumber = seatsNumber;
        } else {
            this.seatsNumber = 5;
            this.winterTires = winterTires;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", transmission='" + getTransmission() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", registrationNumber=" + getRegistrationNumber() +
                ", seatsNumber=" + getSeatsNumber() +
                ", winterTires=" + isWinterTires() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && seatsNumber == car.seatsNumber && winterTires == car.winterTires && Objects.equals(productionCountry, car.productionCountry) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, productionCountry, transmission, bodyType, registrationNumber, seatsNumber, winterTires);
    }

    void specifications() {
        System.out.println("Марка: " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " + getEngineVolume() + " л. Цвет кузова: " + getColor() + ". Год выпуска: " + getProductionYear() + ". Страна-производитель: " + getProductionCountry() + ". Трансмиссия: " + getTransmission() + ". Тип кузова: " + getBodyType() + ". Регистрационный номер: " + getRegistrationNumber() + ". Количество мест: " + getSeatsNumber() + ". Зимняя резина: " + isWinterTires());
    }
    public static class Key {
        private boolean RemoteEngineStart;
        private boolean KeylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            RemoteEngineStart = remoteEngineStart;
            KeylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return RemoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            RemoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return KeylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            KeylessEntry = keylessEntry;
        }
    }
}

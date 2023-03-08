import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean winterTires;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
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

    public void setColor(String color) {
        this.color = color;
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


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int seatsNumber, boolean winterTires) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if(engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        this.color = Objects.requireNonNullElse(color, "Белый");
        if(productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        this.transmission = Objects.requireNonNullElse(transmission, "default");
        this.bodyType = Objects.requireNonNullElse(bodyType, "default");
        this.registrationNumber = Objects.requireNonNullElse(registrationNumber, "х000хх000");
        if(seatsNumber != 0) {
            this.seatsNumber = seatsNumber;
        } else {
            this.seatsNumber = 5;
        }
        this.winterTires = winterTires;
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
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && registrationNumber == car.registrationNumber && seatsNumber == car.seatsNumber && winterTires == car.winterTires && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, seatsNumber, winterTires);
    }

    void specifications() {
        System.out.println("Марка: " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " + getEngineVolume() + " л. Цвет кузова: " + getColor() + ". Год выпуска: " + getProductionYear() + ". Страна-производитель: " + getProductionCountry() + ". Трансмиссия: " + getTransmission() + ". Тип кузова: " + getBodyType() + ". Регистрационный номер: " + getRegistrationNumber() + ". Количество мест: " + getSeatsNumber() + ". Зимняя резина: " + isWinterTires());
    }
}

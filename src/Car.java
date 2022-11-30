public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car() {

    }

    Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        if(brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if(model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if(engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        if(color != null) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if(productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if(productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
    }
    void specifications() {
        System.out.println("Марка: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + " л. Цвет кузова: " + color + ". Год выпуска: " + productionYear + ". Страна-производитель: " + productionCountry + ".");
    }
}

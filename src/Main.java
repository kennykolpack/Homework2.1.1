public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granda";
        lada.engineVolume = 1.7f;
        lada.color = "Желтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0f;
        audi.color = "Черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0f;
        bmw.color = "Черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4f;
        kia.color = "Красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6f;
        hyundai.color = "Оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        lada.specifications();
        audi.specifications();
        bmw.specifications();
        kia.specifications();
        hyundai.specifications();
        // Домашнее задание 2
        Car lada2 = new Car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия");
        Car audi2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия");
        Car bmw2 = new Car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия");
        Car kia2 = new Car("Kia", "Sportage 4-го поколения", 2.4f, "Красный", 2018, "Южная Корея");
        Car hyundai2 = new Car("Hyundai", "Avante", 1.6f, "Оранжевый", 2016, "Южная Корея");
        lada2.specifications();
        audi2.specifications();
        bmw2.specifications();
        kia2.specifications();
        hyundai2.specifications();
    }
}
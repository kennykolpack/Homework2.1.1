//Домашнее задание
public class Main {
    public static void main(String[] args) {
        Car lada= new Car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия", "механическая", "седан", "в306уа18",5, false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия", "автоматическая", "седан", "о607кт18",5, false);
        Car bmw = new Car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия", "автоматическая", "седан", "о123кт18",5, false);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "Красный", 2018, "Южная Корея", "автоматическая", "кроссовер", "о567кт18",7, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "Оранжевый", 2016, "Южная Корея", "автоматическая", "хетчбек", "о789кт18",5, false);
        lada.specifications();
        audi.specifications();
        bmw.specifications();
        kia.specifications();
        hyundai.specifications();
    }
}
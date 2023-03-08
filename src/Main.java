public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", "Желтый", 2015, 160, 1.7f, "Россия", "Механическая", "седан","в306уа18", 5, false);
        Bus mercedes = new Bus("Mercedes", "Benz Tourismo 15 RHD", "Белый", 2021, 140, 6, 12, 6);
        lada.specifications();
        mercedes.specifications();
    }
}
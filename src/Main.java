public class Main {
    public static void main(String[] args) {
        DriverCatB vasily = new DriverCatB("Василий Васильевич Васильев", true, 10);
        DriverCatB oleg = new DriverCatB("Олег Олегович Олегов", true, 6);
        DriverCatB victor = new DriverCatB("Виктор Викторович Викторов", true, 5);
        DriverCatB vitaly = new DriverCatB("Виталий Витальевич Витальев", true, 2);
        DriverCatC sergey = new DriverCatC("Сергей Сергеевич Сергеев", true, 11);
        DriverCatC dmitry = new DriverCatC("Дмитрий Дмитриевич Дмитриев", true, 8);
        DriverCatC ilya = new DriverCatC("Илья Ильич Ильин", true, 7);
        DriverCatC pavel = new DriverCatC("Павел Павлович Павлов", true, 6);
        DriverCatD maxim = new DriverCatD("Максим Максимович Максимов", true, 8);
        DriverCatD petr = new DriverCatD("Петр Петрович Петров", true, 8);
        DriverCatD evgeny = new DriverCatD("Евгений Евгеньевич Евгеньев", true, 12);
        DriverCatD andrey = new DriverCatD("Андрей Андреевич Андреев", true, 7);
        Car lada = new Car("Lada", "Granta", 1.6f, vasily);
        Car bmw = new Car("Bmw", "M8", 4.4f, oleg);
        Car audi = new Car("Audi", "RS3", 2.5f, victor);
        Car mercedes = new Car("Mercedes", "AMG GT 43", 3.0f, vitaly);
        Bus hyundai = new Bus("Hyundai", "Aero Space D6AB-D", 17.8f, maxim);
        Bus mercedesBenz = new Bus("Mercedes-Benz", "Travego M OM 457 LA", 12.0f, petr);
        Bus higer = new Bus("Higer", "KLQ 6129 Q", 9.7f, evgeny);
        Bus ikarus = new Bus("Ikarus", "256", 10.4f, andrey);
        Truck kamaz = new Truck("КамАЗ", "6520", 11.8f, sergey);
        Truck man = new Truck("MAN", "TGM 18.250", 6.8f, dmitry);
        Truck isuzu = new Truck("Isuzu", "forward 12.0", 5.2f, ilya);
        Truck volvo = new Truck("Volvo", "FE 320", 8.9f, pavel);
        info(lada);
        info(bmw);
        info(audi);
        info(mercedes);
        info(hyundai);
        info(mercedesBenz);
        info(higer);
        info(ikarus);
        info(kamaz);
        info(man);
        info(isuzu);
        info(volvo);
    }

    public static void info(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде.");
    }
}
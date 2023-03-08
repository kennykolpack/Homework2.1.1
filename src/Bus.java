import java.util.Objects;

public class Bus extends Transport {
    private int bodyLength;
    private int weight;
    private int wheelsNumber;

    public Bus(String brand, String model, String color, int productionYear, int maxSpeed, int bodyLength, int weight, int wheelsNumber) {
        super(brand, model, color, productionYear, maxSpeed);
        if (bodyLength != 0) {
            this.bodyLength = bodyLength;
        } else {
            this.bodyLength = 5;
        }
        if (weight != 0) {
            this.weight = weight;
        } else {
            this.weight = 8;
        }
        if (wheelsNumber != 0) {
            this.wheelsNumber = wheelsNumber;
        } else {
            this.wheelsNumber = 6;
        }
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    void specifications() {
        System.out.println("Марка: " + getBrand() + ". Модель: " + getModel() + " л. Цвет кузова: " + getColor() + ". Год выпуска: " + getProductionYear() + ". Длина кузова: " + getBodyLength() + ". Вес: " + getWeight() + ". Количество колес: " + getWheelsNumber());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bodyLength=" + getBodyLength() +
                ", weight=" + getWeight() +
                ", wheelsNumber=" + getWheelsNumber() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return bodyLength == bus.bodyLength && weight == bus.weight && wheelsNumber == bus.wheelsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyLength, weight, wheelsNumber);
    }
}

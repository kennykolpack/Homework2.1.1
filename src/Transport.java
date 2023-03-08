import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int productionYear;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Objects.requireNonNullElse(color, "Белый");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else  {
            maxSpeed = 150;
        }
    }

    public Transport(String brand, String model, String color, int productionYear, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, productionYear, maxSpeed);
    }
}

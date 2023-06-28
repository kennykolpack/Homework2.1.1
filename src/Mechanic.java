import java.util.HashMap;
import java.util.Objects;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void performMaintenance() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " проводит техническое обслуживание автомобиля");
    }

    public void fixTheCar() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " производит починку автомобиля");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

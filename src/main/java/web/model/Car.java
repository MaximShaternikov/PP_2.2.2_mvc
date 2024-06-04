package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private int yearOfCreation;

    public Car(String model, int series, int yearOfCreation) {
        this.model = model;
        this.series = series;
        this.yearOfCreation = yearOfCreation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        Car car = (Car) o;
        return (series == car.series) &&
                (yearOfCreation == car.yearOfCreation) &&
                (Objects.equals(model, car.model));
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, yearOfCreation);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", yearOfCreation=" + yearOfCreation +
                '}';
    }
}
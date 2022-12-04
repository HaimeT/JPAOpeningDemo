package com.example.JPAOpeningDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Car {

    @Id
    @GeneratedValue

    private Integer id;
    private String color;
    private String model;
    private LocalDate yom;

    public Car(Integer id, String color, String model, LocalDate yom) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.yom = yom;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYom() {
        return yom;
    }

    public void setYom(LocalDate yom) {
        this.yom = yom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(id, car.id) && Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(yom, car.yom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, model, yom);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yom=" + yom +
                '}';
    }
}

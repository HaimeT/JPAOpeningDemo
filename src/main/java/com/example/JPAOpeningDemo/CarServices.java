package com.example.JPAOpeningDemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServices {
    private CarRepository carRepository;

    public CarServices(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void addCar(CarRequest carRequest) {
        Car carToAdd = new Car();
        carToAdd.setColor(carRequest.color());
        carToAdd.setModel(carRequest.model());
        carToAdd.setYom(carRequest.yom());
        carRepository.save(carToAdd);

    }

    public void deleteById(Integer id) {
        carRepository.deleteById(id);
    }

    public void updateCar(Car car) {
        if (carRepository.existsById(car.getId())) {
            carRepository.save(car);
        }
    }
}

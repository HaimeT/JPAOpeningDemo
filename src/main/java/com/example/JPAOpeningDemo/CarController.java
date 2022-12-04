package com.example.JPAOpeningDemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private CarServices carServices;

    public CarController(CarServices carServices){
        this.carServices = carServices;

    }
    @GetMapping("/")
    public List<Car> getCars(){
        return carServices.getCars();
    }
    @PostMapping("/")
    public void addCar(@RequestBody CarRequest carRequest){
    carServices.addCar(carRequest);

}
@DeleteMapping("/{id}")
public void deleteCarById(@PathVariable(value = "id") Integer id) {
carServices.deleteById(id);
}
@PutMapping("/")
    public void updateCar(@RequestBody Car car){
        carServices.updateCar(car);
}
}

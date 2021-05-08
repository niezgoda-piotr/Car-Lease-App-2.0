package bykovsky.soh.carleaseapp.rest;

import bykovsky.soh.carleaseapp.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("car")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @GetMapping("{carUuid}")
    @ResponseStatus(HttpStatus.OK)
    private CarResponse getCar(@PathVariable String carUuid) {
        return service.getCar(carUuid);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private String addCar(@Valid @RequestBody CarRequest request){
        return service.addCar(request);
    }
}

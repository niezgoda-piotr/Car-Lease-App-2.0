package bykovsky.soh.carleaseapp;

import bykovsky.soh.carleaseapp.exception.CarNotFoundException;
import bykovsky.soh.carleaseapp.persistance.CarEntity;
import bykovsky.soh.carleaseapp.persistance.CarRepository;
import bykovsky.soh.carleaseapp.rest.CarRequest;
import bykovsky.soh.carleaseapp.rest.CarResponse;
import bykovsky.soh.carleaseapp.utils.CarRequestResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    @Transactional
    public CarResponse getCar(String carUuid) {
        return CarRequestResponseMapper.mapToResponse(
                carRepository.findByCarUuid(carUuid)
                        .orElseThrow(() -> new CarNotFoundException(carUuid)));

    }

    @Transactional
    public String addCar(CarRequest request) {
        CarEntity car = CarRequestResponseMapper.mapToEntity(request);
        carRepository.save(car);
        return car.getCarUuid();
    }
}

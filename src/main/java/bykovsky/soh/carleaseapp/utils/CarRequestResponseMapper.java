package bykovsky.soh.carleaseapp.utils;

import bykovsky.soh.carleaseapp.persistance.CarEntity;
import bykovsky.soh.carleaseapp.rest.CarRequest;
import bykovsky.soh.carleaseapp.rest.CarResponse;

public class CarRequestResponseMapper {
    public static CarResponse mapToResponse(CarEntity entity) {
        return new CarResponse(
                entity.getCarUuid(),
                entity.getBrand(),
                entity.getModel(),
                entity.getType(),
                entity.getSubType(),
                entity.getBasePrice());
    }

    public static CarEntity mapToEntity(CarRequest request) {
        return new CarEntity(
                request.getBrand(),
                request.getModel(),
                request.getType(),
                request.getSubType(),
                request.getBasePrice());
    }
}

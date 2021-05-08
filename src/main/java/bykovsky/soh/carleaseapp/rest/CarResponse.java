package bykovsky.soh.carleaseapp.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class CarResponse {

    private final String carUuid;
    private final String brand;
    private final String model;
    private final String type;
    private final String subType;
    private final BigDecimal basePrice;
}

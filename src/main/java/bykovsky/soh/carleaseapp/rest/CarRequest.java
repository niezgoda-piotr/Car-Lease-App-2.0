package bykovsky.soh.carleaseapp.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarRequest {

    @NotEmpty
    private String brand;

    @NotEmpty
    private String model;

    @NotEmpty
    private String type;

    @NotEmpty
    private String subType;

    @NotNull
    private BigDecimal basePrice;
}

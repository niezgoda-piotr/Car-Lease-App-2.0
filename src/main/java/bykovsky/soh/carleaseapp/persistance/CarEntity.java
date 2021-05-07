package bykovsky.soh.carleaseapp.persistance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "car")
@NoArgsConstructor
public class CarEntity {

    @Id
    private Long id;

    @NotNull
    private String carUuid;

    @NotNull
    @NotEmpty
    private String brand;

    @NotNull
    @NotEmpty
    private String model;

    @NotNull
    @NotEmpty
    private String type;

    private String subType;

    @NotNull
    private BigDecimal basePrice;

    public CarEntity(String brand, String model, String type, String subType, BigDecimal basePrice) {
        this.carUuid = UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.subType = subType;
        this.basePrice = basePrice;
    }
}

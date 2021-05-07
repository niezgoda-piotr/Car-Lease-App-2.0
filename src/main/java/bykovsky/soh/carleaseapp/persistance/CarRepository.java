package bykovsky.soh.carleaseapp.persistance;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface CarRepository extends CrudRepository<CarEntity, Long> {

    Optional<CarEntity> findByCarUuid(String carUuid);
    Optional<CarEntity> findByModel(String model);
    Set<CarEntity> findAllByBrand(String brand);
}

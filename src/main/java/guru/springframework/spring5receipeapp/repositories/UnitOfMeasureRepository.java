package guru.springframework.spring5receipeapp.repositories;

import guru.springframework.spring5receipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}

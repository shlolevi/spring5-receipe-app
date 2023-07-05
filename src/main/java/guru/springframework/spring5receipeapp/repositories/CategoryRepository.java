package guru.springframework.spring5receipeapp.repositories;

import guru.springframework.spring5receipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

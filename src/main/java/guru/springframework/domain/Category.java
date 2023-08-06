package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Data
@EqualsAndHashCode(exclude = {"Recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories", fetch = FetchType.EAGER)
    private Set<Recipe> recipes;

}

package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by jt on 6/13/17.
 */
@Data
@EqualsAndHashCode(exclude = {"Recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private Recipe recipe;

    @Lob
    private String recipeNotes;

//    @Override
//    public int hashCode() {
//        final int result = 1;
//        return result;
//    }
}

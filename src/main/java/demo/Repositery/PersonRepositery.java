package demo.Repositery;

import demo.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ashraf on 4/25/15.
 */
@RepositoryRestResource
public interface PersonRepositery extends CrudRepository<Person, Long> {
}

package demo.Repositery;

import demo.domain.Numbers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ashraf on 4/25/15.
 */
@RepositoryRestResource
public interface NumbersRepositery extends CrudRepository<Numbers, Long> {
}

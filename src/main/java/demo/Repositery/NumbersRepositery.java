package demo.Repositery;

import demo.domain.Numbers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ashraf on 4/25/15.
 */

public interface NumbersRepositery extends CrudRepository<Numbers, Long> {
    public List<Numbers> findByPerson_Email(String email);

    public List<Numbers> findByPhone(String phone);

    public List<Numbers> findByUsernameContaining(String Username);
}

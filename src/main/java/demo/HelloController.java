package demo;

import demo.Repositery.NumbersRepositery;
import demo.Repositery.PersonRepositery;
import demo.domain.Numbers;
import demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ashraf on 4/26/15.
 */
@RestController
public class HelloController {
    @Autowired
    PersonRepositery personRepositery;
    @Autowired
    NumbersRepositery numbersRepositery;

    @RequestMapping("/index")
    public Iterable<Person> index() {
        return personRepositery.findAll();
    }

    @RequestMapping(value = "/adduser/{name}/{email}/{password}/")
    public boolean adduser(@PathVariable("name") String name,
                           @PathVariable("email") String email,
                           @PathVariable("password") String password) {
        personRepositery.save(new Person(name, email, password));
        return true;
    }

    @RequestMapping(value = "/addnumber/{user}/{Username}/{phone}/")
    public boolean addnumber(@PathVariable("user") String user,
                             @PathVariable("Username") String Username,
                             @PathVariable("phone") String phone) {
        numbersRepositery.save(new Numbers(Username, phone, personRepositery.findByEmail(user)));
        return true;
    }

    @RequestMapping(value = "/MyNumber/{user}/")
    public List<Numbers> MyNumber(@PathVariable("user") String user) {

        return numbersRepositery.findByPerson_Email(user);
    }

    @RequestMapping(value = "/findByUsernameContaining/{Username}/")
    public List<Numbers> findByUsernameLike(@PathVariable("Username") String Username) {

        return numbersRepositery.findByUsernameContaining(Username);
    }

    @RequestMapping(value = "/findByPhone/{Phone}/")
    public List<Numbers> findByPhone(@PathVariable("Phone") String Phone) {
        return numbersRepositery.findByPhone(Phone);
    }
}

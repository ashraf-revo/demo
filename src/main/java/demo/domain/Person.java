package demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ashraf on 4/25/15.
 */
@Entity
public class Person implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "person")
    private Set<Numbers> numberses=new HashSet<>();

    public Person(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Person(String name, String email, String password, Set<Numbers> numberses) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.numberses = numberses;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Numbers> getNumberses() {
        return numberses;
    }

    public void setNumberses(Set<Numbers> numberses) {
        this.numberses = numberses;
    }
}

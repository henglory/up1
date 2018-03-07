package toystore.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toystore.repository.Person;
import toystore.repository.PersonRepository;

import javax.annotation.PostConstruct;

@Component
public class PersonRepositoryInitializer {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void init() {
        personRepository.deleteAll();
        personRepository.insert(new Person("somkiat", "pui"));
        personRepository.insert(new Person("somkiat2", "pui2"));
    }
}

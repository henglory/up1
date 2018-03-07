package toystore.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Before @After
    public void clearData() {
        personRepository.deleteAll();
    }

    @Test
    public void shouldSaveAndGetData() throws Exception {
        // Arrange
        Person somkiat = new Person("somkiat", "pui");
        personRepository.save(somkiat);

        // Action
        Optional<Person> shouldSomkiat = personRepository.findByFirstName("somkiat");
        System.out.println(shouldSomkiat);

        assertEquals("somkiat", shouldSomkiat.get().getFirstName());
        assertEquals("pui", shouldSomkiat.get().getLastName());
    }

}
package toystore.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import toystore.controller.HelloControllerWithRepository;
import toystore.domain.Hello;
import toystore.repository.Person;
import toystore.repository.PersonRepository;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
public class HelloControllerWithRepositoryTest {

    private HelloControllerWithRepository controllerWithRepository;

    @Mock
    private PersonRepository personRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        controllerWithRepository = new HelloControllerWithRepository(personRepository);
    }

    @Test
    public void shouldReturnHelloSomkiat() {
        // Arrange
        Person somkiat = new Person("somkiat", "pui");
        given(personRepository.findByFirstName("somkiat"))
                .willReturn(Optional.of(somkiat));

        // Action
        Hello hello = controllerWithRepository.sayHi("somkiat");
        System.out.println("Hello: " + hello);

        // Assert
        assertEquals("Hello somkiat", hello.getMessage());
    }

}
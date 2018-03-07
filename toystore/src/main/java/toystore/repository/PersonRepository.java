package toystore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PersonRepository extends MongoRepository<Person, String> {

    Optional<Person> findByFirstName(String name);

}

package org.mvnsearch.redis.demo.domain.repository;

import org.junit.jupiter.api.Test;
import org.mvnsearch.redis.demo.SpringBootBaseTest;
import org.mvnsearch.redis.demo.domain.model.Address;
import org.mvnsearch.redis.demo.domain.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;

import java.util.Set;


public class UserRepositoryTest extends SpringBootBaseTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserOperation() {
        String thorSays = "The Rabbit Is Correct, And Clearly The Smartest One Among You.";
        // Serendipity, 248 Seven Mile Beach Rd, Broken Head NSW 2481, Australia
        Address thorsAddress = Address.of("248", "Seven Mile Beach Rd", "Broken Head", "NSW", "2481", "Australia");
        Person thor = Person.of("Chris", "Hemsworth", 38, thorSays, new Point(153.616667, -28.716667), thorsAddress, Set.of("hammer", "biceps", "hair", "heart"));
        userRepository.save(thor);
    }
}

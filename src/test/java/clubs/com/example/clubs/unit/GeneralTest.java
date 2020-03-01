package clubs.com.example.clubs.unit;

import clubs.com.example.clubs.Entity.University;
import clubs.com.example.clubs.Entity.Users;
import clubs.com.example.clubs.Repository.UniversityRepository;
import clubs.com.example.clubs.Repository.UsersRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.validation.constraints.AssertTrue;
import java.util.Optional;
import java.util.UUID;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class GeneralTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Test
    public void generalControl(){

        University university = University.builder()
                .id(UUID.randomUUID().toString())
                .name(RandomStringUtils.randomAlphabetic(10))
                .build();

        entityManager.persistAndFlush(university);

        Users users = Users.builder()
                .id(UUID.randomUUID().toString())
                .age(15)
                .major(RandomStringUtils.randomAlphabetic(10))
                .name(RandomStringUtils.randomAlphabetic(10))
                .universityId(university.getId())
                .build();

        entityManager.persistAndFlush(users);

        Optional<Users> optionalUser = usersRepository.findById(users.getId());

        System.out.println(optionalUser.get().toString());

        Assertions.assertTrue(optionalUser.isPresent());

        Assertions.assertTrue(optionalUser.get().getId().equalsIgnoreCase(users.getId()));


    }

}

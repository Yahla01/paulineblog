package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserRepositoryImplementationTest {

    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        userRepository = new UserRepositoryImplementation();
        user.setFirstName("Royal");
        user.setLastName("Priesthood");
        user.setUserName("UserName");
        user.setPassword("password");
    }


    @Test
    void saveOneUser_countIsOneTest() {
        User user = new User();
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }

    @Test
    void saveOneUser_IdOfUserIsOneTest() {
        User saveduser = userRepository.save(user);
        userRepository.save(user);
        assertEquals(1, saveduser.getId());
    }

    @DisplayName("Update User Test")
    @Test
    void saveTwoUsersWithSameId_countIsOneTest() {
        User savedUser = userRepository.save(user);
        assertEquals(1, userRepository.count());
        savedUser.setLastName("PriestHood");
        userRepository.save(savedUser);

    }

    @Test public void saveOneUser_deleteOneUser_countIsZeroTest () {

    }


}
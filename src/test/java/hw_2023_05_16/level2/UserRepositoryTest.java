package hw_2023_05_16.level2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {
    @Mock
    User user;
    @Mock
    UserService userService;

    @Test
    void saveUserTest() {
        userService.saveUser(user);
        Mockito.verify(userService, Mockito.only()).saveUser(user);
    }
}
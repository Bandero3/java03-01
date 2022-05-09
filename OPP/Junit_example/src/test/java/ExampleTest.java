import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;
@ExtendWith({MockitoExtension.class})
public class ExampleTest {

    @InjectMocks
    private Example example;

    @Mock
    private UserService userService;

    private UUID id;

    @BeforeEach
    void setUp(){

        id = UUID.randomUUID();
    }

    @Test
    void testGetUserByIdWhenIdIsNull(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> example.getUserById(null));
        assertEquals("Missing user id", illegalArgumentException.getMessage());
    }

    @Test
    void testGetUserById(){
        UUID id = UUID.randomUUID();
        when(userService.getUserById(eq(id))).thenReturn(new User(50));

        User user = example.getUserById(id);
        assertNotNull(user);
        assertEquals(50, user.age());
    }

    @Test
    void testCreateNewUserWhenUserServiceThrowException(){
        doThrow(IllegalArgumentException.class).when(userService).getUserName();

        assertThrows(IllegalArgumentException.class, () -> example.createNewUser(null));
    }

    @Test
    void testCreateNewUser(){
        when(userService.getUserName()).thenReturn("DummyName");

        boolean isUserCreated = example.createNewUser(new User(12));

        assertTrue(isUserCreated);
    }

    @Test
    void testCreateNewUserWhenUserNameIsNull(){
        when(userService.getUserName()).thenReturn(null);
        boolean isUserCreated = example.createNewUser(new User(11));

        assertFalse(isUserCreated);
    }

    @Test
    void testCreateNewUserWhenUserAgeIsLess(){
        boolean isUserCreated = example.createNewUser(new User(5));

        assertFalse(isUserCreated);
    }

    @Test
//    void test_method_result(){

    void testMethodNameWhenSomethingHappens() {
        double pow = Math.pow(2, 2);
        assertEquals(4, pow);
        assertNotNull(id);
    }
}

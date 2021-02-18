package my_cargonaut.login;

import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.utility.data_classes.user.UserPassword;
import my_cargonaut.utility.data_classes.user.UserRegister;
import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;

import java.util.Optional;

import static org.mockito.Mockito.*;

@DisplayName("Testing LoginService class")
public class LoginServiceTest {

    LoginService loginService;
    UserRegister trueRegister;

    String testUsername = "testUser";
    String correctPassword = "rightPassword";

    @BeforeEach
    void initialize() {
        trueRegister = UserRegister.getInstance();
        trueRegister.addNewUser(new User(testUsername, correctPassword));

        loginService = LoginService.getInstance();
    }

    @AfterEach
    void disintegrate() {
        loginService = null;
    }

    @Test
    @DisplayName("LoginService does not return a null instance")
    void getInstanceReturnsAnInstance() {
        Assertions.assertNotSame(null, LoginService.getInstance());
    }

    @Test
    @DisplayName("Authentification throws Exception if no username and password provided")
    void authenticateThrowsExceptionWhenNoUsernameAndPassword() {
        String username = null;
        String password = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.authenticate(username, password);
        }, "Nutzername und Passwort müssen ausgefüllt sein");
    }

    @Test
    @DisplayName("Authentification throws Exception if no username provided")
    void authenticateThrowsExceptionWhenNoUsername() {
        String username = null;
        String password = "PW";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.authenticate(username, password);
        }, "Nutzername muss ausgefüllt sein");
    }

    @Test
    @DisplayName("Authentification throws Exception if no password provided")
    void authenticateThrowsExceptionWhenNoPassWord() {
        String username = "user";
        String password = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.authenticate(username, password);
        }, "Passwort muss ausgefüllt sein");
    }

    @Test
    @DisplayName("Authentification throws Exception if UserRegister can't find provided User")
    void authentificationFailsIfUserNotInRegister() {
        String username = "wrongUser";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.authenticate(username, this.correctPassword);
        }, "Der Nutzer " + username + " existiert nicht");
    }

    @Test
    @DisplayName("Authentification reports failure if wrong password")
    void authentificationFailsIfPasswordIsWrong() {
        String enteredPassword = "wrongPassword";

        Assertions.assertFalse(loginService.authenticate(this.testUsername, enteredPassword));
    }

    @Test
    @DisplayName("Authentification succeeds with correct username & password")
    void authentificationSucceedsIfPasswordIsRight() {
        String enteredPassword = "rightPassword";

        Assertions.assertTrue(loginService.authenticate(this.testUsername, enteredPassword));
    }

}

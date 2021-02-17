package my_cargonaut.login;

import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.utility.data_classes.user.UserPassword;
import my_cargonaut.utility.data_classes.user.UserRegister;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Optional;

import static org.mockito.Mockito.*;

@DisplayName("Testing LoginService class")
public class LoginServiceTest {

    UserRegister mockRegister;
    LoginService loginService;

    @BeforeEach
    void initialize() {
        try(MockedStatic<UserRegister> test = mockStatic(UserRegister.class)) {
            mockRegister = mock(UserRegister.class);
            when(UserRegister.getInstance()).thenReturn(mockRegister);
            loginService = LoginService.getInstance();
        }
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
        String username = "testUser";
        String password = "testPassword";
        when(mockRegister.getUser(username)).thenReturn(Optional.empty());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.authenticate(username, password);
        }, "Der Nutzer " + username + " existiert nicht");
    }

    @Test
    @DisplayName("Authentification reports failure if wrong password")
    void authentificationFailsIfPasswordIsWrong() {
        String username = "testUser";
        String enteredPassword = "wrongPassword";
        String correctPassword = "rightPassword";

        UserPassword mockPw = mock(UserPassword.class);
        when(mockPw.getPw()).thenReturn(correctPassword);
        User mockUser = mock(User.class);
        when(mockUser.getPassword()).thenReturn(mockPw);
        when(mockUser.getUsername()).thenReturn(username);
        when(mockRegister.getUser(username)).thenReturn(Optional.of(mockUser));

        Assertions.assertFalse(loginService.authenticate(username, enteredPassword));
    }

    @Test
    @DisplayName("Authentification succeeds with correct username & password")
    void authentificationSucceedsIfPasswordIsRight() {
        String username = "testUser";
        String enteredPassword = "rightPassword";
        String correctPassword = "rightPassword";

        UserPassword mockPw = mock(UserPassword.class);
        when(mockPw.getPw()).thenReturn(correctPassword);
        User mockUser = mock(User.class);
        when(mockUser.getPassword()).thenReturn(mockPw);
        when(mockUser.getUsername()).thenReturn(username);
        when(mockRegister.getUser(username)).thenReturn(Optional.of(mockUser));

        Assertions.assertTrue(loginService.authenticate(username, enteredPassword));
    }

}

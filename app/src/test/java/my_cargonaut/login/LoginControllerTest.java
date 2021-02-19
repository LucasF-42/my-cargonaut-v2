package my_cargonaut.login;

import io.javalin.http.Context;
import my_cargonaut.landing.LandingPage;
import my_cargonaut.utility.FormManUtils;
import my_cargonaut.utility.SessionManUtils;

import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.utility.data_classes.user.UserRegister;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

@DisplayName("Testing LoginController class")
public class LoginControllerTest {

    UserRegister trueRegister;
    String testUsername = "testUser";
    String correctPassword = "rightPassword";
    User testUser = new User(testUsername, correctPassword);

    private Context ctx;

    @BeforeEach
    void initialize() {
        trueRegister = UserRegister.getInstance();
        trueRegister.addNewUser(testUser);
        ctx = mock(Context.class);
    }

    @AfterEach
    void disintegrate() {
        ctx = null;
    }

    @Test
    @DisplayName("LogoutHandler removes logged in user session attribute")
    void logoutHandlerRemovesSessionAttributeTest() {
        try {
            String username = "testname";
            ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);

            doReturn(username).when(ctx).sessionAttribute(SessionManUtils.sessionAttributeLoggedInUsername);

            LoginController.handleLogout.handle(ctx);
            verify(ctx).sessionAttribute(eq(SessionManUtils.sessionAttributeLoggedInUsername), stringCaptor.capture());

            Assertions.assertNull(stringCaptor.getValue());
        } catch(Exception e) {
            Assertions.fail("Context handling failed");
        }
    }

    @Test
    @DisplayName("LogoutHandler redirects to the landing page")
    void logoutHandlerRedirectsToLandingPageTest() {
        try {
            String username = "testname";
            ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);

            doReturn(username).when(ctx).sessionAttribute(SessionManUtils.sessionAttributeLoggedInUsername);

            LoginController.handleLogout.handle(ctx);
            verify(ctx).redirect(stringCaptor.capture());

            Assertions.assertEquals(LandingPage.PATH, stringCaptor.getValue());
        } catch(Exception e) {
            Assertions.fail("Context handling failed");
        }
    }

    @Test
    @DisplayName("Successfully logging in adds session attribute")
    void checkLoginPostAddsToSessionAttributesOnSuccess() {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        Map<String, List<String>> mockParamLst = new HashMap<>();
        mockParamLst.put(FormManUtils.loginFormName, Collections.singletonList(testUsername));
        mockParamLst.put(FormManUtils.loginFormPassword, Collections.singletonList(correctPassword));

        doReturn(mockParamLst).when(ctx).formParamMap();

        LoginController.checkLoginPost(new LandingPage(ctx), ctx);

        verify(ctx).sessionAttribute(eq(SessionManUtils.sessionAttributeLoggedInUsername), captor.capture());
        Assertions.assertEquals(captor.getValue(), testUsername);
    }

    @Test
    @DisplayName("Successfully logging in marks the page with authentication success")
    void checkLoginPostMarksThePageWithAuthenticationSuccess() {
        Map<String, List<String>> mockParamLst = new HashMap<>();
        mockParamLst.put(FormManUtils.loginFormName, Collections.singletonList(testUsername));
        mockParamLst.put(FormManUtils.loginFormPassword, Collections.singletonList(correctPassword));

        LandingPage spyPage = spy(new LandingPage(ctx));

        doReturn(mockParamLst).when(ctx).formParamMap();

        LoginController.checkLoginPost(spyPage, ctx);

        verify(spyPage, never()).markAuthentificationFailure(anyString());
        verify(spyPage).markAuthentificationSuccess(testUser);
    }

    @Test
    @DisplayName("Failed login-attempt marks the page with authentication failure")
    void checkLoginMarksPageWithWrongPasswordMessage() {
        String wrongPasswort = "wrongPassword";
        Map<String, List<String>> mockParamLst = new HashMap<>();
        mockParamLst.put(FormManUtils.loginFormName, Collections.singletonList(testUsername));
        mockParamLst.put(FormManUtils.loginFormPassword, Collections.singletonList(wrongPasswort));

        LandingPage spyPage = spy(new LandingPage(ctx));

        doReturn(mockParamLst).when(ctx).formParamMap();

        LoginController.checkLoginPost(spyPage, ctx);

        verify(spyPage).markAuthentificationFailure(eq("Falsches Passwort"));
        verify(spyPage, never()).markAuthentificationSuccess(testUser);
    }

    @Test
    @DisplayName("Login attempt without a username results in page marked with authentication failure")
    void checkLoginPostThrowsExceptionWhenNoUsernameEntered() {
        Map<String, List<String>> mockParamLst = new HashMap<>();
        mockParamLst.put(FormManUtils.loginFormName, Collections.singletonList(null));
        mockParamLst.put(FormManUtils.loginFormPassword, Collections.singletonList(correctPassword));

        LandingPage spyPage = spy(new LandingPage(ctx));

        doReturn(mockParamLst).when(ctx).formParamMap();

        LoginController.checkLoginPost(spyPage, ctx);

        verify(spyPage).markAuthentificationFailure(eq("Nutzername muss ausgefüllt sein"));
        verify(spyPage, never()).markAuthentificationSuccess(any());
    }
}

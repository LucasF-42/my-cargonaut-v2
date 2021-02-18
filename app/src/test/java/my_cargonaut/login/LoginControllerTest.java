package my_cargonaut.login;

import io.javalin.http.Context;
import my_cargonaut.landing.LandingPage;
import my_cargonaut.utility.SessionManUtils;

import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

@DisplayName("Testing LoginController class")
public class LoginControllerTest {


    private Context ctx;


    @BeforeEach
    void initialize() {
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
    public void checkLoginPostAddsToSessionAttributesOnSuccess() {

    }
}

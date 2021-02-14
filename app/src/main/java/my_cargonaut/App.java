/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package my_cargonaut;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import io.javalin.core.util.RouteOverviewPlugin;
import io.javalin.plugin.rendering.template.JavalinJte;
import my_cargonaut.landing.LandingController;
import my_cargonaut.landing.LandingPage;
import my_cargonaut.login.LoginController;
import my_cargonaut.offer.creation.OfferCreationController;
import my_cargonaut.offer.creation.OfferCreationPage;
import my_cargonaut.offer.search.OffersSearchController;
import my_cargonaut.offer.search.OffersSearchPage;
import my_cargonaut.profile.cars.CarsPage;
import my_cargonaut.profile.cars.CarsPageController;
import my_cargonaut.profile.deals.DealsPage;
import my_cargonaut.profile.deals.DealsPageController;
import my_cargonaut.profile.edit.EditPage;
import my_cargonaut.profile.edit.EditProfileController;
import my_cargonaut.registration.RegistrationController;
import my_cargonaut.registration.RegistrationPage;
import my_cargonaut.utility.Storage;

import java.nio.file.Files;
import java.nio.file.Path;

import static io.javalin.apibuilder.ApiBuilder.before;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

public class App {

    public static final boolean devSystem = System.getProperty("environment") == null;
    //public static final UserRegister userMap = UserRegister.getInstance();

    public static void main(String[] args) {

        Javalin app = Javalin.create(App::configure);
        app.events(event -> {
            // TODO: Save the registered Users in the file/database?
            event.serverStopping(Storage::saveData);
            // TODO: Load the registered users from file
            event.serverStarting(() -> {
                if(Files.exists(Path.of(Storage.userRegisterLoc)) && Files.exists(Path.of(Storage.offerPoolLoc))) {
                    Storage.initializeData();
                }
            });
        });

        Runtime.getRuntime().addShutdownHook(new Thread(app::stop));

        app.routes(() -> {
            // Landing page
            // before(LandingPage.PATH, LoginController.ensureLogin);
            get(LandingPage.PATH, LandingController.serveLandingPage);
            post(LandingPage.PATH, LandingController.handleLandingPagePost);
            // Searching for Offers
            get(OffersSearchPage.PATH, OffersSearchController.serveOffersSearchPage);
            post(OffersSearchPage.PATH, OffersSearchController.handleOffersSearchPost);
            // Logout handling
            get("/logout", LoginController.handleLogout);
            // Registration handling
            get(RegistrationPage.PATH, RegistrationController.serveRegistrationPage);
            post(RegistrationPage.PATH, RegistrationController.handleRegistration);
            // Offer creation
            get(OfferCreationPage.PATH, OfferCreationController.serveOfferCreationPage);
            post(OfferCreationPage.PATH, OfferCreationController.handleOfferCreationPost);
            // Edit profile page
            get(EditPage.PATH_STATIC, EditProfileController.serveEditProfilePage);
            post(EditPage.PATH_STATIC, EditProfileController.handleEditprofilePagePost);
            // Edit vehicle page
            get(CarsPage.PATH_STATIC, CarsPageController.serveCarsPage);
            post(CarsPage.PATH_STATIC, CarsPageController.handleCarsPagePost);
            // Show own offers page
            get(DealsPage.PATH_STATIC, DealsPageController.serveDealsPage);
            post(DealsPage.PATH_STATIC, DealsPageController.handleDealsPagePost);

            app.error(404, LandingController.serveNotFoundPage);
        });
        app.start(getHerokuAssignedPort());
    }

    private static void configure(JavalinConfig config) {
        JavalinJte.configure(createTemplateEngine());
        config.addStaticFiles("/public");
        config.registerPlugin(new RouteOverviewPlugin("/routes"));
    }

    private static TemplateEngine createTemplateEngine() {
        if(devSystem) {
            DirectoryCodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "jte"));
            return TemplateEngine.create(codeResolver, ContentType.Html);
        } else {
            return TemplateEngine.createPrecompiled(Path.of("jte-classes"), ContentType.Html);
        }
    }

    // based on tutorial found at: https://javalin.io/tutorials/heroku
    private static int getHerokuAssignedPort() {
        String herokuPort = System.getenv("PORT");
        if (herokuPort != null) {
            return Integer.parseInt(herokuPort);
        }
        return 7777;
    }
}

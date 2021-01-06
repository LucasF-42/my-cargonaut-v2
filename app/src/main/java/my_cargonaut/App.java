/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package my_cargonaut;

import gg.jte.Content;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import io.javalin.core.util.RouteOverviewPlugin;
import io.javalin.plugin.rendering.template.JavalinJte;
import my_cargonaut.landing.LandingController;
import my_cargonaut.landing.LandingPage;

import java.nio.file.Path;

import static io.javalin.apibuilder.ApiBuilder.before;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

public class App {

    public static final boolean devSystem = System.getProperty("environment") == null;

    public static void main(String[] args) {



        // TODO: Add Firebase stuff as dependencies

        Javalin app = Javalin.create(App::configure).start(7777);

        app.routes(() -> {
            get(LandingPage.PATH, LandingController.serveLandingPage);
        });
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
}

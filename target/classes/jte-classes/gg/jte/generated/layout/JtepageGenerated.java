package gg.jte.generated.layout;
import my_cargonaut.Page;
import gg.jte.Content;
import my_cargonaut.profile.cars.CarsPage;import my_cargonaut.utility.FormManUtils;
import my_cargonaut.offer.creation.OfferCreationPage;
import my_cargonaut.landing.LandingPage;
import my_cargonaut.profile.edit.EditPage;
import my_cargonaut.registration.RegistrationPage;import my_cargonaut.utility.data_classes.user.User;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,8,8,8,17,17,30,32,32,32,32,32,32,32,36,36,40,40,40,40,40,40,40,43,43,46,46,46,46,46,46,46,48,54,54,54,54,54,54,54,56,56,56,56,56,56,56,59,59,59,59,59,59,59,70,70,73,74,74,74,74,74,74,74,81,81,83,83,86,86,87,87,90,90,90,93,93,96,96,96,99,99,100,100,102,102,104,104,104,106,106,112,112,114,116,118,120,127,129,138,141,145,149,153};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Page page, Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>MyCargonaut</title>\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\"><script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n    <link rel=\"stylesheet\" href=\"styles/bootstrap.css\"> ");
		jteOutput.writeContent("\n    <link rel=\"icon\" href=\"/img/semi_androidMyCargonaut.svg\">\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n\n\n\n</head>\n<body>\n<div class=\"container-fluid\">\n    <div class=\"row\">\n        <div class=\"col-md-12\">\n            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n                <style type=\"text/css\">\n                    body { background: #caf3e8 !important; } ");
		jteOutput.writeContent("\n                </style>\n                <a class=\"navbar-brand\"");
		if (gg.jte.internal.TemplateUtils.isAttributeRendered(LandingPage.PATH)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(LandingPage.PATH);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n                    <img src=\"/img/semi_androidMyCargonaut.svg\" style=\"height: 50px\" class=\"d-inline-block align-top\" alt=\"\">\n                    </a>\n\n                ");
		if (!(page.hideNavBarNavigation())) {
			jteOutput.writeContent("\n                <div class=\"collapse navbar-collapse\" id=\"mainNavbar\">\n                    <ul class=\"navbar-nav mr-auto\">\n                        <li class=\"nav-item px-2\">\n                            <a");
			if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.PATH)) {
				jteOutput.writeContent(" href=\"");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(OfferCreationPage.PATH);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(" role=\"button\" class=\"btn btn-primary\">Eintrag erstellen</a>\n                        </li>\n                    </ul>\n                    ");
			if (!(page.isUserLoggedIn())) {
				jteOutput.writeContent("\n                    <ul class=\"navbar-nav mr-auto\">\n                        <li class=\"nav-item px-2\">\n                            <a");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.PATH)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(RegistrationPage.PATH);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" role=\"button\" class=\"btn btn-danger\">Registrieren</a>\n                        </li>\n                        ");
				jteOutput.writeContent("\n                        <ul class=\"nav navbar-nav flex-row justify-content-between ml-auto\">\n                            <li class=\"dropdown order-1\">\n                                <button type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" class=\"btn btn-outline-secondary dropdown-toggle\">Anmelden <span class=\"caret\"></span></button>\n                                <ul class=\"dropdown-menu dropdown-menu-right mt-2\">\n                                    <li class=\"px-3 py-2\">\n                                        <form class=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(FormManUtils.loginForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(FormManUtils.loginForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" role=\"form\" method=\"post\" action=\"/\">\n                                            <div class=\"form-group\">\n                                                <input id=\"emailInput\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(FormManUtils.loginFormName)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(FormManUtils.loginFormName);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Benutzername\" class=\"form-control form-control-sm\" type=\"text\" required=\"\">\n                                            </div>\n                                            <div class=\"form-group\">\n                                                <input id=\"passwordInput\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(FormManUtils.loginFormPassword)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(FormManUtils.loginFormPassword);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Passwort\" class=\"form-control form-control-sm\" type=\"password\" required=\"\">\n                                            </div>\n                                            <div class=\"form-group\">\n                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n                                            </div>\n                                        </form>\n                                    </li>\n                                </ul>\n                            </li>\n                        </ul>\n                    </ul>\n                    ");
			} else {
				jteOutput.writeContent("\n                    <ul class=\"navbar-nav mr-auto\">\n                        <li class=\"nav-item px-2\">\n                            ");
				jteOutput.writeContent("\n                            <a");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-info text-white\" role=\"button\">\n                                <i class=\"fa fa-user\"></i> Mein Profil</a>\n                        </li>\n                         <li class=\"nav-item px-2\">\n                              <a href=\"/logout\" class=\"btn btn-danger\" role=\"button\">Ausloggen</a>\n                         </li>\n                    </ul>\n                    ");
			}
			jteOutput.writeContent("\n                </div>\n                ");
		}
		jteOutput.writeContent("\n            </nav>\n\n            ");
		if (page.wasAuthorizationAttempted()) {
			jteOutput.writeContent("\n            ");
			if (page.hasAuthorizationSucceeded()) {
				jteOutput.writeContent("\n            <div class=\"container-fluid\">\n                <div class=\"alert alert-success\">\n                    <strong>Login erfolgreich:</strong> ");
				jteOutput.setContext("div", null);
				jteOutput.writeUserContent("" + page.getCurrentUserName().orElse("Sollte nie passieren!"));
				jteOutput.writeContent(" ist angemeldet\n                </div>\n            </div>\n            ");
			} else {
				jteOutput.writeContent("\n            <div class=\"container-fluid\">\n                <div class=\"alert alert-danger\">\n                    <strong>Login fehlgeschlagen:</strong> ");
				jteOutput.setContext("div", null);
				jteOutput.writeUserContent("" + page.getLoginErrorMsg().orElse("Unbekannte Fehlermeldung"));
				jteOutput.writeContent("\n                </div>\n            </div>\n            ");
			}
			jteOutput.writeContent("\n            ");
		}
		jteOutput.writeContent("\n\n            ");
		if (page.hasAccess()) {
			jteOutput.writeContent("\n            <div class=\"container-fluid text-white\" id=\"content\">\n                ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(content);
			jteOutput.writeContent("\n            </div>\n            ");
		} else {
			jteOutput.writeContent("\n            <div class=\"container-fluid\">\n                <div class=\"alert alert-danger\">\n                    <strong>Anmeldung erforderlich:</strong> Um diese Funktion zu nutzen muss man angemeldet sein\n                </div>\n            </div>\n            ");
		}
		jteOutput.writeContent("\n\n            ");
		jteOutput.writeContent("\n            <footer class=\"bg-light text-center text-lg-start fixed-bottom\">\n                ");
		jteOutput.writeContent("\n                <div class=\"container p-4\">\n                    ");
		jteOutput.writeContent("\n                    <div class=\"row\">\n                        ");
		jteOutput.writeContent("\n                        <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\n                            <p>MyCargonaut GmBH<br />\n                                Musterstra&szlig;e 111<br />\n                                Geb&auml;ude 44<br />\n                                90210 Musterstadt</p>\n                        </div>\n                        ");
		jteOutput.writeContent("\n\n                        ");
		jteOutput.writeContent("\n                        <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\n                            <p><strong>Vertreten durch:</strong>\n                                Iason C. Argonaut</p>\n                            <p>Telefon: +49 (0) 123 44 55 66<br />\n                                E-Mail: contact@mycargonaut.de</p>\n\n                        </div>\n                    </div>\n                    ");
		jteOutput.writeContent("\n                </div>\n            </footer>\n            ");
		jteOutput.writeContent("\n        </div>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
		jteOutput.writeContent("\n<script src=\"scripts/script.js\"></script>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Page page = (Page)params.get("page");
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, page, content);
	}
}

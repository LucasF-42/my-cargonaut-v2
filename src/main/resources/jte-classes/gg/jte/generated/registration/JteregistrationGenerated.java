package gg.jte.generated.registration;
import my_cargonaut.registration.RegistrationPage;
public final class JteregistrationGenerated {
	public static final String JTE_NAME = "registration/registration.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,4,4,6,6,7,7,10,10,10,13,13,16,16,16,19,19,20,20,26,26,26,26,26,26,26,26,26,26,26,26,26,26,30,30,30,30,30,30,30,31,31,31,31,31,31,31,37,37,37,37,37,37,37,38,38,38,38,38,38,38,43,43,43,43,43,43,43,44,44,44,44,44,44,44,48,48,50,50,52,52,58,58,58,59};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, RegistrationPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n");
				if (page.wasRegistrationAttempted()) {
					jteOutput.writeContent("\n");
					if (page.hasRegistrationSucceeded()) {
						jteOutput.writeContent("\n<div class=\"container-fluid mx-auto\">\n    <div class=\"alert alert-success\">\n        <strong>Registrierung des Nutzers erfolgreich:</strong> ");
						jteOutput.setContext("div", null);
						jteOutput.writeUserContent("" + page.getEnteredUsername());
						jteOutput.writeContent("\n    </div>\n</div>\n");
					} else {
						jteOutput.writeContent("\n<div class=\"container-fluid mx-auto\">\n    <div class=\"alert alert-danger\">\n        <strong>Registrierung fehlgeschlagen:</strong> ");
						jteOutput.setContext("div", null);
						jteOutput.writeUserContent("" + page.getRegistrationErrorMsg());
						jteOutput.writeContent("\n    </div>\n</div>\n");
					}
					jteOutput.writeContent("\n");
				}
				jteOutput.writeContent("\n\n<div class=\"container mt-3 mb-1 mx-auto py-3 px-5 bg-light\">\n    <div class=\"container d-flex justify-content-center\">\n      <h1>Registrieren</h1>\n    </div>\n    <form class=\"form p-3 was-validated\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.regForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(RegistrationPage.regForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.PATH)) {
					jteOutput.writeContent(" target=\"");
					jteOutput.setContext("form", "target");
					jteOutput.writeUserContent(RegistrationPage.PATH);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" onsubmit=\"return validateRegistrationForm()\">\n      <div class=\"container px-5\">\n        <div class=\"form-group mt-4\">\n          <label for=\"registerName\">Nutzername</label>\n          <input id=\"registerName\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.regFormUsername)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(RegistrationPage.regFormUsername);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\"\n                placeholder=\"Nutzernamen eintragen\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredUsername())) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredUsername());
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\n          <div class=\"invalid-feedback\">Bitte geben Sie einen Nutzernamen an</div>\n        </div>\n\n        <div class=\"form-group mt-4\">\n          <label for=\"registerPw\">Passwort</label>\n          <input id=\"registerPw\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.regFormPassword)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(RegistrationPage.regFormPassword);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"password\"\n                placeholder=\"Passwort eingeben\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredPw())) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredPw());
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\n          <div class=\"invalid-feedback\">Bitte geben Sie Ihr Passwort an</div>\n        </div>\n        <div class=\"form-group mt-4\">\n          <label for=\"registerPw2\">Passwort wiederholen</label>\n          <input id=\"registerPw2\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(RegistrationPage.regFormPassword2)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(RegistrationPage.regFormPassword2);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"password\"\n                placeholder=\"Passwort wiederholen\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredPw2())) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredPw2());
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\n          <div id=\"registerPw2Fb\" class=\"invalid-feedback\">Bitte wiederholen Sie ihr Passwort</div>\n        </div>\n        <div class=\"container mt-5 d-flex justify-content-center\">\n          ");
				if (page.wasRegistrationAttempted() && page.hasRegistrationSucceeded()) {
					jteOutput.writeContent("\n          <a href=\"/\" role=\"button\" class=\"btn btn-lg btn-light\">Weiter zur Startseite</a>\n          ");
				} else {
					jteOutput.writeContent("\n          <button type=\"submit\" class=\"btn btn-lg btn-success\">Registrieren</button>\n          ");
				}
				jteOutput.writeContent("\n        </div>\n      </div>\n    </form >\n</div>\n\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		RegistrationPage page = (RegistrationPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

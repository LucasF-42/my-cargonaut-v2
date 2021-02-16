package gg.jte.generated.layout;
import my_cargonaut.Page;
import gg.jte.Content;
public final class JteOLDpageGenerated {
	public static final String JTE_NAME = "layout/OLDpage.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,21,21,21,31,31,49,49,58,58,60,60,65,65,65,79};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Page page, Content content) {
		jteOutput.writeContent("\n<html lang=\"de\">\n<head>\n    <title>My Cargonaut</title>\n    <meta charset=\"UTF-8\">\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n            integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n    <link href=\"/styles/myCargoStyles.css\" rel=\"stylesheet\">\n</head>\n<body>\n    <header>\n        <nav class=\"navbar navbar-expand navbar-light bg-light sticky-top p-2 border-cargo\">\n          <a class=\"navbar-brand\" href=\"#\">\n            <img src=\"/img/logo.png\" height=\"379\" width=\"901\" class=\"cargoNautLogo\" alt=\"logo of MyCargonaut\">\n          </a>\n\n          ");
		if (!(page instanceof my_cargonaut.landing.NotFoundPage)) {
			jteOutput.writeContent("\n          <div class=\"container\">\n            <ul class=\"navbar-nav\">\n              <li class=\"nav-item\">\n                <a class=\"nav-link\" href=\"#\">Angebot erstellen</a>\n              </li>\n              <li class=\"nav-item\">\n                <a class=\"nav-link\" href=\"#\">Gesuch erstellen</a>\n              </li>\n            </ul>\n            ");
			if (page.isUserLoggedIn()) {
				jteOutput.writeContent("\n            <div class=\"card mr-auto\" style=\"width: 10rem;\">\n              <div class=\"card-body\">\n                <div class=\"container d-flex justify-content-center justify-content-middle\">\n                  <img src=\"/img/profile2.png\" class=\"car-img-top pt-1 profilePic\" alt=\"profile picture\">\n                </div>\n                <div class=\"dropstart mt-1 d-flex justify-content-center\">\n                  <button type=\"button\" class=\"btn btn-sm dropdown-toggle text-light cargonautColor\" style=\"white-space: normal\"\n                          id=\"ddMenuBtn\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                    Optionen\n                  </button>\n                  <div class=\"dropdown-menu\" aria-labelledby=\"ddMenuBtn\">\n                    <a class=\"dropdown-item\" href=\"#\">Profil bearbeiten</a>\n                    <a class=\"dropdown-item\" href=\"#\">Abmelden</a>\n                  </div>\n                </div>\n              </div>\n            </div>\n            ");
			} else {
				jteOutput.writeContent("\n            <div class=\"row mr-auto\">\n              <div class=\"col\">\n                <a class=\"btn btn-sm text-light cargonautColor mt-1\" href=\"#\" style=\"width: 100%\">Anmelden</a>\n              </div>\n              <div class=\"col\">\n                <a class=\"btn btn-sm text-light cargonautColor mt-1\" href=\"#\" style=\"width: 100%\">Registrieren</a>\n              </div>\n            </div>\n            ");
			}
			jteOutput.writeContent("\n          </div>\n          ");
		}
		jteOutput.writeContent("\n        </nav>\n    </header>\n    <main>\n        <div id=\"content\">\n            ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n        </div>\n    </main>\n    <footer>\n\n    </footer>\n    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"\n            integrity=\"sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU\"\n            crossorigin=\"anonymous\"></script>\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js\"\n            integrity=\"sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj\"\n            crossorigin=\"anonymous\"></script>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Page page = (Page)params.get("page");
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, page, content);
	}
}

package gg.jte.generated.profile.deals;
import gg.jte.Content;
import gg.jte.support.ForSupport;
import my_cargonaut.profile.deals.DealsPage;import my_cargonaut.profile.edit.EditPage;
import my_cargonaut.profile.cars.CarsPage;import my_cargonaut.utility.data_classes.Measurements;import my_cargonaut.utility.data_classes.user.User;import java.text.SimpleDateFormat;
public final class JtedealsProfileGenerated {
	public static final String JTE_NAME = "profile/deals/dealsProfile.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,7,7,7,7,14,14,14,14,14,14,14,16,16,16,16,16,16,16,20,25,25,25,25,25,25,25,25,25,25,25,25,25,25,41,41,43,43,43,45,47,47,47,47,50,50,50,51,51,51,52,52,52,53,53,53,54,54,56,56,56,56,56,56,56,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,58,58,58,58,65,65,67,67,67,67,67,67,67,68,68,68,68,68,68,68,69,69,69,69,69,69,69,69,69,69,69,69,69,76,76,78,78,89,89,89,91};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, my_cargonaut.profile.deals.DealsPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n<div class=\"container\">\n    <div class=\"row\">\n        <div class=\"col-lg-2 col-md-12\">\n            <div class=\"bg-light\">\n                <nav class=\"nav nav-tabs flex-column\">\n                    <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Profil</a>\n                    <a class=\"nav-link active\" href=\"#\">Deals</a>\n                    <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(CarsPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Fuhrpark</a>\n                </nav>\n            </div>\n        </div>\n        ");
				jteOutput.writeContent("\n        <div class=\"col-lg-10 col-md-12\">\n            <div class=\"bg-light\">\n                <div class=\"container text-body\">\n                    <h2>Meine Deals</h2>\n                    <form class=\"container bg-light table-responsive pt-2\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.dealsPageForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(page.dealsPageForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                        <table class=\"table table-striped table-hover\">\n                            <thead class=\"table-border\">\n                            <tr class=\"table-primary\">\n                                <th scope=\"col\">#</th>\n                                <th scope=\"col\">Angebotstitel</th>\n                                <th scope=\"col\">Von</th>\n                                <th scope=\"col\">Nach</th>\n                                <th scope=\"col\">Abfahrtdatum</th>\n                                <th scope=\"col\">Fahrzeug</th>\n                                <th scope=\"col\">Angenommen von:</th>\n                                <th scope=\"col\">Status</th>\n                            </tr>\n                            </thead>\n                            <tbody>\n\n                            ");
				for (var el : ForSupport.of(page.getOfferList())) {
					jteOutput.writeContent("\n                            <tr>\n                                <th scope=\"row\">");
					jteOutput.setContext("th", null);
					jteOutput.writeUserContent(el.getIndex());
					jteOutput.writeContent("</th>\n                                <td>\n                                    <a href=\"#\">");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent("" + el.get().getUser().getUsername() + "'s Tour von "
                                        + el.get().getRoute().getStartLoc().getLocationName() + " nach "
                                        + el.get().getRoute().getEndLoc().getLocationName());
					jteOutput.writeContent("\n                                    </a>\n                                </td>\n                                <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(el.get().getRoute().getStartLoc().getLocationName());
					jteOutput.writeContent("</td>\n                                <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(el.get().getRoute().getEndLoc().getLocationName());
					jteOutput.writeContent("</td>\n                                <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(new SimpleDateFormat("dd. MM. yyyy").format(el.get().getRoute().getStartTime()));
					jteOutput.writeContent("</td>\n                                <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(el.get().getVehicle().map(vic -> "" + vic.getBrand().toString() + " " + vic.getModel()).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("</td>\n                                ");
					if (el.get().hasOfferAcceptor()) {
						jteOutput.writeContent("\n                                <td>\n                                    <input disabled type=\"text\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.dealsPageFormAcceptionUser)) {
							jteOutput.writeContent(" name=\"");
							jteOutput.setContext("input", "name");
							jteOutput.writeUserContent(page.dealsPageFormAcceptionUser);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"form-control\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(el.get().getOfferAcceptor().map(User::getUsername).orElseThrow(IllegalStateException::new))) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(el.get().getOfferAcceptor().map(User::getUsername).orElseThrow(IllegalStateException::new));
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                    <input hidden type=\"text\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.dealsPageFormOfferID)) {
							jteOutput.writeContent(" name=\"");
							jteOutput.setContext("input", "name");
							jteOutput.writeUserContent(page.dealsPageFormOfferID);
							jteOutput.writeContent("\"");
						}
						if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + el.get().getOfferID())) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent("" + el.get().getOfferID());
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                </td>\n                                <td>\n                                    <button type=\"submit\" class=\"btn btn-success\">\n                                        <i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i>\n                                    </button>\n                                </td>\n                                ");
					} else {
						jteOutput.writeContent("\n                                <td>\n                                    <input type=\"text\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.dealsPageFormAcceptionUser)) {
							jteOutput.writeContent(" name=\"");
							jteOutput.setContext("input", "name");
							jteOutput.writeUserContent(page.dealsPageFormAcceptionUser);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"form-control\"\n                                        placeholder=\"Angebotspartner\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(el.get().getOfferAcceptor().map(User::getUsername).orElse(""))) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(el.get().getOfferAcceptor().map(User::getUsername).orElse(""));
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                    <input hidden type=\"text\"");
						if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.dealsPageFormOfferID)) {
							jteOutput.writeContent(" name=\"");
							jteOutput.setContext("input", "name");
							jteOutput.writeUserContent(page.dealsPageFormOfferID);
							jteOutput.writeContent("\"");
						}
						if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + el.get().getOfferID())) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent("" + el.get().getOfferID());
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\n                                </td>\n                                <td>\n                                    <button type=\"submit\" class=\"btn btn-failure\">\n                                        <i class=\"fa fa-lock-alt\" aria-hidden=\"true\"></i>\n                                    </button>\n                                </td>\n                                ");
					}
					jteOutput.writeContent("\n                            </tr>\n                            ");
				}
				jteOutput.writeContent("\n\n                            </tbody>\n                        </table>\n                    </form>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n\n");
			}
		});
		jteOutput.writeContent("\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		my_cargonaut.profile.deals.DealsPage page = (my_cargonaut.profile.deals.DealsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

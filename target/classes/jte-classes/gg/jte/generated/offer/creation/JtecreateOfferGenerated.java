package gg.jte.generated.offer.creation;
import my_cargonaut.offer.creation.OfferCreationPage;;
public final class JtecreateOfferGenerated {
	public static final String JTE_NAME = "offer/creation/createOffer.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,4,4,6,6,7,7,13,13,16,16,16,19,19,20,20,29,29,29,29,29,29,29,29,29,29,29,29,29,29,38,38,38,38,38,38,38,38,38,38,38,38,38,38,41,41,41,41,41,41,41,41,41,41,41,41,41,41,44,44,44,44,44,44,44,44,44,44,44,44,44,44,50,50,50,50,50,50,50,50,50,50,50,50,50,50,53,53,53,53,53,53,53,53,53,53,53,53,53,53,56,56,56,56,56,56,56,56,56,56,56,56,56,56,59,59,59,59,59,59,59,59,59,59,59,59,59,59,65,65,65,65,65,65,65,65,65,65,65,65,65,65,79,79,79};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, my_cargonaut.offer.creation.OfferCreationPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n");
				if (page.wasOfferCreationAttempted()) {
					jteOutput.writeContent("\n");
					if (page.hasOfferCreationSucceeded()) {
						jteOutput.writeContent("\n<div class=\"container-fluid mx-auto\">\n    <div class=\"alert alert-success\">\n        <strong>Ihr Angebot wurde erstellt!</strong>\n    </div>\n</div>\n");
					} else {
						jteOutput.writeContent("\n<div class=\"container-fluid mx-auto\">\n    <div class=\"alert alert-danger\">\n        <strong>Angebotserstellung fehlgeschlagen:</strong> ");
						jteOutput.setContext("div", null);
						jteOutput.writeUserContent("" + page.getCreationErrorMsg());
						jteOutput.writeContent("\n    </div>\n</div>\n");
					}
					jteOutput.writeContent("\n");
				}
				jteOutput.writeContent("\n\n<div class=\"container bg-light mt-5\">\n    <div class=\"row justify-content-center\" style=\"align-self: center\">\n        <div class=\"col-6\">\n            <div class=\"bg-light\">\n                <nav class=\"flex-column\" style=\"text-align: center\">\n                    <h4 class=\"mt-2\">Erstellen</h4>\n                    <br>\n                    <form class=\"form\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.PATH)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(OfferCreationPage.PATH);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    <div class=\"col form-group\">\n                        <select class=\"form-control\" id=\"createDropdown\">\n                            <option>Angebot</option>\n                            <option>Gesuch</option>\n                        </select>\n                    </div>\n                    <br>\n                    <div class=\"col form-group\">\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormStart)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormStart);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormStart)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormStart);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Von\" required>\n                    </div>\n                    <div class=\"col form-group\">\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDest)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDest);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDest)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDest);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Nach\" required>\n                    </div>\n                    <div class=\"col form-group\">\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormStartTime)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormStartTime);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"datetime-local\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormStartTime)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormStartTime);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\n                    </div>\n\n                    <div class=\"col form-group\">\n                        <div class=\"row\">\n                            <div class=\"col form-group\">\n                                <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormHeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormHeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Hoehe\" required>\n                            </div>\n                            <div class=\"col form-group\">\n                                <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormLength)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormLength);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormLength)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormLength);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Breite\" required>\n                            </div>\n                            <div class=\"col form-group\">\n                                <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDepth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDepth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Tiefe\" required>\n                            </div>\n                            <div class=\"col form-group\">\n                                <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormWeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormWeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Gewicht\" required>\n                            </div>\n                        </div>\n                    </div>\n\n                    <div class=\"col form-group\">\n                        <textarea");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDesc)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("textarea", "name");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDesc);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OfferCreationPage.offerCFormDesc)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("textarea", "id");
					jteOutput.writeUserContent(OfferCreationPage.offerCFormDesc);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" rows=\"3\" placeholder=\"Beschreibung\"></textarea>\n                    </div>\n                    <br>\n                    <br>\n                    <div class=\"col form-group\">\n                        <button class=\"btn btn-primary\" name=\"apply\" type=\"submit\"><i class=\"fa fa-plus\"></i></button>\n                    </div>\n                    </form>\n                </nav>\n            </div>\n        </div>\n    </div>\n</div>\n\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		my_cargonaut.offer.creation.OfferCreationPage page = (my_cargonaut.offer.creation.OfferCreationPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

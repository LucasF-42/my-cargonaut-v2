package gg.jte.generated.landing;
import my_cargonaut.landing.LandingPage;
import my_cargonaut.offer.search.OffersSearchPage;
public final class JtelandingGenerated {
	public static final String JTE_NAME = "landing/landing.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,5,5,5,5,14,14,14,14,14,14,14,14,14,14,14,14,14,14,23,23,23,23,23,23,23,24,24,24,24,24,24,24,24,24,24,24,24,24,24,27,27,27,27,27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,31,31,31,31,31,31,31,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,35,35,35,35,35,35,36,36,36,36,36,36,36,36,36,36,36,36,36,36,50,50,50,52};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, LandingPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n<div class=\"container bg-light mt-5\">\n    <div class=\"row justify-content-center\" style=\"align-self: center\">\n        <div class=\"col-6\">\n            <div class=\"bg-light\">\n                <nav class=\"flex-column\" style=\"text-align: center\">\n                    <h4 class=\"mt-2\">Suche</h4>\n                    <br>\n                    <form class=\"form text-body\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(page.offerSearchForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"get\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(OffersSearchPage.PATH)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(OffersSearchPage.PATH);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    <div class=\"col form-group\">\n                        <select class=\"form-control\" id=\"createDropdown\">\n                            <option>Angebot</option>\n                            <option>Gesuch</option>\n                        </select>\n                    </div>\n                    <br>\n                    <div class=\"col form-group\">\n                        <label class=\"form-label\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormOrig)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormOrig);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Ausgangsstadt</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormOrig)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormOrig);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormOrig)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormOrig);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Von\" required>\n                    </div>\n                    <div class=\"col form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormDest)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormDest);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Zielstadt</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormDest)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormDest);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormDest)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormDest);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"Nach\" required>\n                    </div>\n                    <div class=\"col form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormStartT)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormStartT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Zeitraum von</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormStartT)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormStartT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"datetime-local\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormStartT)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormStartT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                    <div class=\"col form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormEndT)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormEndT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">bis</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormEndT)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormEndT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"datetime-local\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormEndT)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormEndT);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                    <br>\n                    <br>\n                    <div class=\"col form-group\">\n                        <button class=\"btn btn-primary\" name=\"apply\" type=\"submit\"><i class=\"fa fa-search\"></i></button>\n                    </div>\n                    </form>\n                </nav>\n            </div>\n        </div>\n    </div>\n</div>\n\n");
			}
		});
		jteOutput.writeContent("\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		LandingPage page = (LandingPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

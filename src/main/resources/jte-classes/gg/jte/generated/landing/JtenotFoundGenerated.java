package gg.jte.generated.landing;
import my_cargonaut.landing.NotFoundPage;
public final class JtenotFoundGenerated {
	public static final String JTE_NAME = "landing/notFound.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,4,4,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, NotFoundPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"container d-flex justify-content-center\">\n        <h1>Error 404: Not found</h1>\n    </div>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		NotFoundPage page = (NotFoundPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

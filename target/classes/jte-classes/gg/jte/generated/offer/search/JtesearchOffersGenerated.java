package gg.jte.generated.offer.search;
import gg.jte.support.ForSupport;;
import my_cargonaut.offer.search.OffersSearchPage;;
import my_cargonaut.utility.data_classes.Measurements;;
import java.text.SimpleDateFormat;;
public final class JtesearchOffersGenerated {
	public static final String JTE_NAME = "offer/search/searchOffers.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,7,7,7,7,16,16,16,16,16,16,16,16,16,16,16,16,16,16,21,21,21,21,21,21,21,22,22,22,22,22,22,22,22,22,22,22,22,22,22,23,23,23,23,23,23,23,30,30,30,30,30,30,30,31,31,31,31,31,31,31,31,31,31,31,31,31,31,32,32,32,32,32,32,32,40,40,40,40,40,40,40,41,41,41,41,41,41,41,41,41,41,41,41,41,41,42,42,42,42,42,42,42,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,64,64,64,64,64,64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,73,73,73,73,73,73,73,74,74,74,74,74,74,74,74,74,74,74,74,74,74,75,75,75,75,75,75,75,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,83,83,83,83,83,84,84,84,84,84,84,84,91,91,91,91,91,91,91,92,92,92,92,92,92,92,92,92,92,92,92,92,92,93,93,93,93,93,93,93,99,122,143,143,146,146,148,148,148,150,152,152,152,152,155,155,155,156,156,156,157,157,157,158,158,158,159,159,159,160,160,160,161,161,161,162,162,162,164,164,166,166,171,171,171,173};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, OffersSearchPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n<div class=\"container-fluid mt-1 p-2 text-body bg-light\">\n    <div class=\"row mb-3\">\n        <div class=\"col\">\n            <button type=\"button\" class=\"btn btn-sm btn-outline-info\" data-toggle=\"collapse\" data-target=\"#offerSearchFilter\">Filter anzeigen/ausblenden</button>\n        </div>\n    </div>\n    <div id=\"offerSearchFilter\" class=\"collapse\">\n        <form class=\"form\" role=\"form\"");
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
				jteOutput.writeContent(">\n            <div class=\"row\">\n                <div class=\"col\">\n                    <div class=\"mb-3\">\n                        <div class=\"form-group\">\n                            <label class=\"form-label\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormOrig)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormOrig);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Ausgangsstadt</label>\n                            <input");
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
				jteOutput.writeContent("\n                                placeholder=\"Von\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormOrig))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormOrig));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                        </div>\n                    </div>\n                </div>\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
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
				jteOutput.writeContent("\n                            placeholder=\"Nach\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormDest))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormDest));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col\"></div>\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
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
				jteOutput.writeContent("\n                            placeholder=\"\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormStartT))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormStartT));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
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
				jteOutput.writeContent("\n                            placeholder=\"\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormEndT))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormEndT));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col-1\"></div>\n            </div>\n            <div class=\"row\">\n              <label class=\"col-1 col-form-label\">Ladung</label>\n            </div>\n            <div class=\"row\">\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoHeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormCargoHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Hoehe (cm)</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoHeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormCargoHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoHeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormCargoHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\n                            placeholder=\"0\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormCargoHeight))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormCargoHeight));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoWidth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormCargoWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Breite (cm)</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoWidth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormCargoWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoWidth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormCargoWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\n                            placeholder=\"0\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormCargoWidth))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormCargoWidth));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col\">\n                <div class=\"mb-3\">\n                    <div class=\"form-group\">\n                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoDepth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormCargoDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Tiefe (cm)</label>\n                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoDepth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormCargoDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoDepth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormCargoDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\n                            placeholder=\"0\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormCargoDepth))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormCargoDepth));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                    </div>\n                </div>\n              </div>\n              <div class=\"col\">\n                  <div class=\"mb-3\">\n                      <div class=\"form-group\">\n                          <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoMaxWeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(page.offerSearchFormCargoMaxWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-label\">Maximalgewicht (kg)</label>\n                          <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoMaxWeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(page.offerSearchFormCargoMaxWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.offerSearchFormCargoMaxWeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(page.offerSearchFormCargoMaxWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\n                              placeholder=\"0\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getEnteredValue(page.offerSearchFormCargoMaxWeight))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getEnteredValue(page.offerSearchFormCargoMaxWeight));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                      </div>\n                  </div>\n              </div>\n              <div class=\"col\"></div>\n              <div class=\"col\">\n                ");
				jteOutput.writeContent("\n              </div>\n              <div class=\"col-1\">\n              </div>\n            </div>\n            <div class=\"row\">\n                <div class=\"col\"></div>\n                <div class=\"col-1\">\n                    <button class=\"btn btn-primary\" name=\"searchOfferSubmit\" type=\"submit\"><i class=\"fa fa-search\"></i></button>\n                </div>\n            </div>\n        </form>\n    </div>\n</div>\n\n");
				jteOutput.writeContent("\n<div class=\"container bg-light table-responsive pt-2\">\n    <table class=\"table table-striped table-hover\">\n        <thead class=\"table-border\">\n            <tr class=\"table-primary\">\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">#</th>\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">Angebotstitel</th>\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">Von</th>\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">Nach</th>\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">Abfahrtdatum</th>\n                <th scope=\"col\" rowspan=\"2\" style=\"vertical-align:middle;text-align:center;\">Abfahrtzeit</th>\n                <th scope=\"col\" colspan=\"4\" class=\"text-center\">Stauraum</th>\n            </tr>\n            <tr class=\"table-primary\">\n                <th scope=\"col\">Hoehe(cm)</th>\n                <th scope=\"col\">Breite(cm)</th>\n                <th scope=\"col\">Tiefe(cm)</th>\n                <th scope=\"col\">Maximalgewicht(kg)</th>\n            </tr>\n        </thead>\n\n        ");
				if (page.displaysQueryResult()) {
					jteOutput.writeContent("\n        <tbody>\n\n            ");
					for (var el : ForSupport.of(page.getOfferList())) {
						jteOutput.writeContent("\n            <tr>\n                <th scope=\"row\">");
						jteOutput.setContext("th", null);
						jteOutput.writeUserContent(el.getIndex());
						jteOutput.writeContent("</th>\n                <td>\n                    <a href=\"#\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent("" + el.get().getUser().getUsername() + "'s Tour von "
                        + el.get().getRoute().getStartLoc().getLocationName() + " nach "
                        + el.get().getRoute().getEndLoc().getLocationName());
						jteOutput.writeContent("\n                    </a>\n                </td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(el.get().getRoute().getStartLoc().getLocationName());
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(el.get().getRoute().getEndLoc().getLocationName());
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(new SimpleDateFormat("dd. MM. yyyy").format(el.get().getRoute().getStartTime()));
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(new SimpleDateFormat("HH:mm").format(el.get().getRoute().getStartTime()));
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent("" + el.get().getFreeSpace().map(Measurements::getHeight).orElse(0.0));
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent("" + el.get().getFreeSpace().map(Measurements::getWidth).orElse(0.0));
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent("" + el.get().getFreeSpace().map(Measurements::getDepth).orElse(0.0));
						jteOutput.writeContent("</td>\n                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent("" + el.get().getFreeSpace().map(Measurements::getWeight).orElse(0.0));
						jteOutput.writeContent("</td>\n            </tr>\n            ");
					}
					jteOutput.writeContent("\n        </tbody>\n        ");
				}
				jteOutput.writeContent("\n    </table>\n\n</div>\n\n");
			}
		});
		jteOutput.writeContent("\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		OffersSearchPage page = (OffersSearchPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

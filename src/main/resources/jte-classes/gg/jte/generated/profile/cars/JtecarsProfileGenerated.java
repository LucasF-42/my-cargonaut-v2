package gg.jte.generated.profile.cars;
import my_cargonaut.profile.deals.DealsPage;
import my_cargonaut.profile.edit.EditPage;
import my_cargonaut.profile.cars.CarsPage;
import my_cargonaut.utility.data_classes.user.CarManufacturer;
public final class JtecarsProfileGenerated {
	public static final String JTE_NAME = "profile/cars/carsProfile.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,7,7,7,7,14,14,14,14,14,14,14,15,15,15,15,15,15,15,20,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,30,30,30,30,30,30,30,31,31,31,31,31,31,31,31,31,31,31,31,31,32,32,32,32,32,32,32,33,33,33,102,102,102,102,102,102,102,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,103,108,108,108,108,108,108,108,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,109,114,114,114,114,114,114,114,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,115,120,120,120,120,120,120,120,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,121,128,128,128,128,128,128,128,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,129,138,138,138,138,138,138,138,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,139,144,144,144,144,144,144,144,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,145,150,150,150,150,150,150,150,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,156,156,156,156,156,156,156,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,157,172,172,172,173};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, my_cargonaut.profile.cars.CarsPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n        <div class=\"container mt-3\">\n            <div class=\"row\">\n                <div class=\"col-lg-2 col-md-12\">\n                    <div class=\"bg-light\">\n                        <nav class=\"nav nav-tabs flex-column\">\n                            <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(EditPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Profil</a>\n                            <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Deals</a>\n                            <a class=\"nav-link active\" href=\"#\">Fuhrpark</a>\n                        </nav>\n                    </div>\n                </div>\n                ");
				jteOutput.writeContent("\n\n                <div class=\"col-lg-10 col-md-12\">\n                    <form class=\"form text-body\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCForm);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCForm)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("form", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.getDynamicPath(page.getCurrentUserName().get()))) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(CarsPage.getDynamicPath(page.getCurrentUserName().get()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("> ");
				jteOutput.writeContent("\n                    <div class=\"bg-light\">\n                        <div class=\"container\">\n                            <h2 class=\"pt-2\">Mein Fahrzeug</h2>\n                            <div class=\"row\">\n                                <div class=\"col\">\n                                    <div class=\"form-group\">\n                                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCBrand)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCBrand);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Marke</label>\n                                        <select class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCBrand)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("select", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCBrand);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCBrand)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("select", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCBrand);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" >\n                                            <option selected hidden");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getVehicle().map(vehicle -> vehicle.getBrand().toString()).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("option", "value");
					jteOutput.writeUserContent(page.getVehicle().map(vehicle -> vehicle.getBrand().toString()).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                ");
				jteOutput.setContext("option", null);
				jteOutput.writeUserContent(page.getVehicle().map(vehicle -> vehicle.getBrand().toString()).orElseThrow(IllegalStateException::new));
				jteOutput.writeContent("\n                                            </option>\n                                            <option>Alfa-Romeo</option>\n                                            <option>AMG</option>\n                                            <option>Aston-Martin</option>\n                                            <option>Audi</option>\n                                            <option>Bentley</option>\n                                            <option>Bugatti</option>\n                                            <option>BMW</option>\n                                            <option>Buick</option>\n                                            <option>Cadillac</option>\n                                            <option>Chevrolet</option>\n                                            <option>Citroen</option>\n                                            <option>Chrysler</option>\n                                            <option>Daihatsu</option>\n                                            <option>Dacia</option>\n                                            <option>Dodge</option>\n                                            <option>Ferrari</option>\n                                            <option>Fiat</option>\n                                            <option>Ford</option>\n                                            <option>General Motors</option>\n                                            <option>GMC</option>\n                                            <option>Honda</option>\n                                            <option>Hummer</option>\n                                            <option>Hyundai</option>\n                                            <option>Infiniti</option>\n                                            <option>Jaguar</option>\n                                            <option>Jeep</option>\n                                            <option>Kia</option>\n                                            <option>Lada</option>\n                                            <option>Lamborghini</option>\n                                            <option>Lancia</option>\n                                            <option>Land Rover</option>\n                                            <option>Lexus</option>\n                                            <option>Lincoln</option>\n                                            <option>Lotus</option>\n                                            <option>Maybach</option>\n                                            <option>Maserati</option>\n                                            <option>Mazda</option>\n                                            <option>McLaren</option>\n                                            <option>Mercedes-Benz</option>\n                                            <option>Mini</option>\n                                            <option>Mitsubishi</option>\n                                            <option>Nissan</option>\n                                            <option>Oldsmobile</option>\n                                            <option>Opel/Vauxhall</option>\n                                            <option>Peugeot</option>\n                                            <option>Plymouth</option>\n                                            <option>Porsche</option>\n                                            <option>Renault</option>\n                                            <option>Rolls-Royce</option>\n                                            <option>Saab</option>\n                                            <option>Seat</option>\n                                            <option>Skoda</option>\n                                            <option>Subaru</option>\n                                            <option>Suzuki</option>\n                                            <option>Tesla</option>\n                                            <option>Toyota</option>\n                                            <option>Volkswagen</option>\n                                            <option>Volvo</option>\n                                        </select>\n                                    </div>\n                                    <br>\n                                    <div class=\"form-group\">\n                                        <label>Freier Platz (aktuell)</label>\n                                            <div class=\"col\">\n                                                <div class=\"row\">\n                                                    <div class=\"col\">\n                                                        <div class=\"form-group\">\n                                                            <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeHeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Hoehe (cm)</label>\n                                                            <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getHeight()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getHeight()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeHeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeHeight);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeHeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                        </div>\n                                                    </div>\n                                                    <div class=\"col\">\n                                                        <div class=\"form-group\">\n                                                            <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWidth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Breite (cm)</label>\n                                                            <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getWidth()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getWidth()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWidth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWidth);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWidth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                        </div>\n                                                    </div>\n                                                    <div class=\"col\">\n                                                        <div class=\"form-group\">\n                                                            <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeDepth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Tiefe (cm)</label>\n                                                            <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getDepth()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getDepth()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeDepth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeDepth);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeDepth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                        </div>\n                                                    </div>\n                                                </div>\n                                                <div class=\"form-group\">\n                                                    <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Gewicht (kg)</label>\n                                                    <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getWeight()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getCurrentCargoHold().getWeight()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"number\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWeight);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCFreeWeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCFreeWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                </div>\n                                            </div>\n                                    </div>\n                                </div>\n                                <div class=\"col\">\n                                    <div class=\"form-group\">\n                                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCModel)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCModel);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Model</label>\n                                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getVehicle().map(vehicle -> vehicle.getModel()).orElse("ERR"))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getVehicle().map(vehicle -> vehicle.getModel()).orElse("ERR"));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCModel)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCModel);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCModel)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCModel);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                    </div>\n                                    <br>\n                                    <div class=\"form-group\">\n                                        <label>Freier Platz (maximum)</label>\n                                        <div class=\"col\">\n                                            <div class=\"row\">\n                                                <div class=\"col\">\n                                                    <div class=\"form-group\">\n                                                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxHeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Hoehe (cm)</label>\n                                                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getHeight()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getHeight()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxHeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxHeight);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxHeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxHeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                    </div>\n                                                </div>\n                                                <div class=\"col\">\n                                                    <div class=\"form-group\">\n                                                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWidth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Breite (cm)</label>\n                                                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getWidth()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getWidth()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWidth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWidth);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWidth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWidth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                    </div>\n                                                </div>\n                                                <div class=\"col\">\n                                                    <div class=\"form-group\">\n                                                        <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxDepth)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Tiefe (cm)</label>\n                                                        <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getDepth()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getDepth()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxDepth)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxDepth);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxDepth)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxDepth);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                    </div>\n                                                </div>\n                                            </div>\n                                            <div class=\"form-group\">\n                                                <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWeight)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Gewicht (kg)</label>\n                                                <input");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getWeight()).orElse(0.0))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent("" + page.getVehicle().map(vehicle -> vehicle.getMaxCargoHold().getWeight()).orElse(0.0));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWeight)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWeight);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.ProfileCMaxWeight)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(CarsPage.ProfileCMaxWeight);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                            </div>\n                                        </div>\n                                    </div>\n                                </div>\n\n                            </div>\n                            <button type=\"submit\" class=\"btn btn-primary mb-2\">Aenderungen bestaetigen</button>\n                        </div>\n                    </div>\n                    </form>\n                </div>\n            </div>\n        </div>\n\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		my_cargonaut.profile.cars.CarsPage page = (my_cargonaut.profile.cars.CarsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

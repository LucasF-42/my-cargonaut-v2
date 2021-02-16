package gg.jte.generated.profile.edit;
import my_cargonaut.profile.cars.CarsPage;
import my_cargonaut.profile.edit.EditPage;
import my_cargonaut.profile.edit.EditProfileController;
import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.profile.deals.DealsPage;
public final class JteeditProfileGenerated {
	public static final String JTE_NAME = "profile/edit/editProfile.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,6,6,6,8,8,8,8,17,17,17,17,17,17,17,18,18,18,18,18,18,18,22,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,28,31,34,34,34,34,34,34,34,35,35,35,35,35,35,35,35,35,35,35,35,35,36,36,36,36,36,36,36,37,37,37,45,45,45,45,45,45,45,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,49,51,51,51,51,51,51,51,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,55,58,58,58,58,58,58,58,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,62,62,62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,66,68,68,68,68,68,68,68,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,72,74,97,98,98,98,98,98,98,98,102,102,102,102,102,102,102,121,121,121,122};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, EditPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, page, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n               <br>\n                <div class=\"container\">\n                   <div class=\"row\">\n                       <div class=\"col-lg-2 col-md-12\">\n                           <div class=\"bg-light\">\n                               <nav class=\"nav nav-tabs flex-column\">\n                                   <a class=\"nav-link active\" href=\"#\">Profil</a>\n                                   <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(DealsPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Deals</a>\n                                   <a class=\"nav-link\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(CarsPage.getDynamicPath(page.getCurrentUser().get().getUsername()))) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(CarsPage.getDynamicPath(page.getCurrentUser().get().getUsername()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Fuhrpark</a>\n                               </nav>\n                           </div>\n                       </div>\n                       ");
				jteOutput.writeContent("\n                       <div class=\"col-lg-10 col-md-12\">\n                            <form class=\"form text-body\" role=\"form\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEForm)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("form", "name");
					jteOutput.writeUserContent(EditPage.ProfileEForm);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEForm)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("form", "id");
					jteOutput.writeUserContent(EditPage.ProfileEForm);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.getDynamicPath(page.getCurrentUserName().get()))) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(EditPage.getDynamicPath(page.getCurrentUserName().get()));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                <div class=\"bg-light\">\n                                                               <div class=\"container\">\n                                                                   <h2>Mein Profil</h2>\n                                                                   ");
				jteOutput.writeContent("\n                                                                   <div class=\"row\">\n                                                                       <div class=\"col-lg-7 col-md-12 box\">\n                                                                           ");
				jteOutput.writeContent("\n                                                                           <div class=\"row\">\n                                                                               <div class=\"col form-group\">\n                                                                                   <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPronoun)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileEPronoun);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Anrede</label>\n                                                                                   <select class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPronoun)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("select", "name");
					jteOutput.writeUserContent(EditPage.ProfileEPronoun);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPronoun)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("select", "id");
					jteOutput.writeUserContent(EditPage.ProfileEPronoun);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" >\n                                                                                       <option selected hidden");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(user -> user.getPronoun().toString()).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("option", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(user -> user.getPronoun().toString()).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                                            ");
				jteOutput.setContext("option", null);
				jteOutput.writeUserContent(page.getCurrentUser().map(user -> user.getPronoun().toString()).orElseThrow(IllegalStateException::new));
				jteOutput.writeContent("\n                                                                                       </option>\n                                                                                       <option>Herr</option>\n                                                                                       <option>Frau</option>\n                                                                                       <option>Divers</option>\n                                                                                   </select>\n                                                                               </div>\n                                                                               <div class=\"col form-group\">\n                                                                                    <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEName)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileEName);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Vorname</label>\n                                                                                    <input type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEName)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(EditPage.ProfileEName);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEName)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(EditPage.ProfileEName);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(User::getGivenName).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(User::getGivenName).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                               </div>\n                                                                           </div>\n                                                                           ");
				jteOutput.writeContent("\n                                                                           <div class=\"form-group\">\n                                                                               <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileESurname)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileESurname);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Nachname</label>\n                                                                               <input type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileESurname)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(EditPage.ProfileESurname);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileESurname)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(EditPage.ProfileESurname);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(User::getSurname).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(User::getSurname).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                           </div>\n\n                                                                           ");
				jteOutput.writeContent("\n                                                                           <div class=\"row\">\n                                                                               <div class=\"col-md-5 form-group\">\n                                                                                   <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPLZ)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileEPLZ);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">PLZ</label>\n                                                                                   <input type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPLZ)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(EditPage.ProfileEPLZ);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileEPLZ)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(EditPage.ProfileEPLZ);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(User::getCityPostal).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(User::getCityPostal).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                               </div>\n                                                                               <div class=\"col-md-7 form-group\">\n                                                                                   <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECity)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileECity);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Stadt</label>\n                                                                                   <input type=\"text\" class=\"form-control\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECity)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(EditPage.ProfileECity);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECity)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(EditPage.ProfileECity);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(User::getCity).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(User::getCity).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                               </div>\n                                                                           </div>\n                                                                           ");
				jteOutput.writeContent("\n                                                                           <div class=\"form-group\">\n                                                                               <label");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECellPhone)) {
					jteOutput.writeContent(" for=\"");
					jteOutput.setContext("label", "for");
					jteOutput.writeUserContent(EditPage.ProfileECellPhone);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Handynummer</label>\n                                                                               <input class=\"form-control\" type=\"tel\"");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECellPhone)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("input", "id");
					jteOutput.writeUserContent(EditPage.ProfileECellPhone);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(EditPage.ProfileECellPhone)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(EditPage.ProfileECellPhone);
					jteOutput.writeContent("\"");
				}
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(User::getCellphoneNumber).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(User::getCellphoneNumber).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                           </div>\n                                                                       </div>\n                                                                       ");
				jteOutput.writeContent("\n                                                                       <div class=\"col-lg-5 col-md-12 box\">\n                                                                           ");
				jteOutput.writeContent("\n                                                                           <div class=\"form-group\">\n                                                                                <label for=\"avatarInput\">Profilbild</label>\n                                                                                    <form class=\"md-form\">\n                                                                                        <div class=\"file-field\">\n                                                                                            <div class=\"mb-4\">\n                                                                                                <img src=\"https://mdbootstrap.com/img/Photos/Others/placeholder-avatar.jpg\"\n                                                                                                     class=\"rounded-circle z-depth-1-half avatar-pic\"\n                                                                                                     width=\"150px\" alt=\"example placeholder avatar\">\n                                                                                            </div>\n                                                                                        <div class=\"d-flex\">\n                                                                                             <div class=\"btn btn-primary\">\n                                                                                                <input type=\"file\" name=\"file\" id=\"avatarInput\">\n                                                                                             </div>\n                                                                                        </div>\n                                                                                        </div>\n                                                                                    </form>\n                                                                           </div>\n                                                                           <div class=\"d-flex justify-content-center\">\n                                                                               <button class=\"btn btn-info\"><i class=\"fa fa-paypal\"></i> PayPal verlinken</button>\n                                                                           </div>\n                                                                           <div class=\"col form-group\">\n                                                                               <label for=\"emailInput\">Benutzername</label>\n                                                                               ");
				jteOutput.writeContent("\n                                                                               <input type=\"email\" class=\"form-control\" id=\"emailInput\" disabled");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(user -> user.getUsername()).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(user -> user.getUsername()).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                           </div>\n                                                                           <div class=\"col form-group\">\n                                                                               <label for=\"passwordInput\">Passwort</label>\n                                                                               <input type=\"text\" class=\"form-control\" id=\"passwordInput\" disabled");
				if (gg.jte.internal.TemplateUtils.isAttributeRendered(page.getCurrentUser().map(user -> user.getPassword().getPw()).orElseThrow(IllegalStateException::new))) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(page.getCurrentUser().map(user -> user.getPassword().getPw()).orElseThrow(IllegalStateException::new));
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\n                                                                           </div>\n\n                                                                       </div>\n                                                                   </div>\n\n                                                                   <button type=\"submit\" class=\"btn btn-primary mb-2 ml-2\">Aenderungen speichern</button>\n                                                               </div>\n                                                           </div>\n                            </form>\n\n                       </div>\n                   </div>\n                </div>\n\n\n\n\n\n    ");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		EditPage page = (EditPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}

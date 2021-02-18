package my_cargonaut;

import io.javalin.Javalin;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// See https://javalin.io/tutorials/testing
public class FunctionalTest {
    @Test
    public void GET_to_reach_landing_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1111);
        HttpResponse<String> response = Unirest.get("http://localhost:1111").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_to_reach_register_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1112);
        HttpResponse<String> response = Unirest.get("http://localhost:1112/register").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_to_reach_create_offer_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1113);
        HttpResponse<String> response = Unirest.get("http://localhost:1113/createOffer").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_to_reach_profile_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1114);
        HttpResponse<String> response = Unirest.get("http://localhost:1114/user/t/editProfile/profile").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_to_reach_profile_cars_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1115);
        HttpResponse<String> response = Unirest.get("http://localhost:1115/user/t/editProfile/cars").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_to_reach_profile_deals_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1116);
        HttpResponse<String> response = Unirest.get("http://localhost:1116/user/t/editProfile/deals").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }

    @Test
    public void GET_log_out_ok(){
        Javalin app = App.setUpCargonaut();
        app.start(1117);
        HttpResponse<String> response = Unirest.get("http://localhost:1117/logout").asString();
        assertEquals(response.getStatus(),200);
        app.stop();
    }



}

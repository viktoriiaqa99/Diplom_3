package api;

import io.restassured.response.ValidatableResponse;
import model.TestUser;

import static io.restassured.RestAssured.given;

public class UserApi {

    private static final String BASE_URL =
            "https://stellarburgers.education-services.ru";

    public ValidatableResponse register(TestUser user) {
        return given()
                .baseUri(BASE_URL)
                .contentType("application/json")
                .body(user)
                .post("/api/auth/register")
                .then();
    }

    public void delete(String accessToken) {
        given()
                .baseUri(BASE_URL)
                .header("Authorization", accessToken)
                .delete("/api/auth/user");
    }
}

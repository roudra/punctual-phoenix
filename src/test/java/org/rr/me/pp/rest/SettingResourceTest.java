package org.rr.me.pp.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class SettingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/settings")
                .then()
                .statusCode(200);
    }

}
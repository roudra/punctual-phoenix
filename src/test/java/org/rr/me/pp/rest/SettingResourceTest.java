package org.rr.me.pp.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class SettingResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/settings")
                .then()
                .statusCode(200);
    }

}
package org.rr.me.pp;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PhoenixTest {

    @Test
     void fullTest() {
        Results results = Runner.path("classpath:org/rr/me/pp").tags("@smoke").parallel(4);
        Assertions.assertEquals(results.getFailCount(), 0, results.getErrorMessages());
    }

    @Test
    void smokeTest() {
        Results results = Runner.path("classpath:org/rr/me/pp").tags("@smoke").parallel(4);
        Assertions.assertEquals(results.getFailCount(), 0, results.getErrorMessages());
    }
}

//    @Test
//    void testHelloEndpoint() {
//        given()
//                .when().get("/hello")
//                .then()
//                .statusCode(200)
//                .body(is("Hello from RESTEasy Reactive"));
//    }
